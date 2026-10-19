/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Mapa;

import config.ConfigComponente;
import java.util.ArrayList;
import java.util.Random;
import progra00.poo.Criaturas.Criatura;
import progra00.poo.Defensas.Defensa;
import progra00.poo.Defensas.DefensaAtacante;
import progra00.poo.FabricaTropas;

/**
 * Organiza una batalla:
 *  1. prepara el ejército enemigo (criaturas del catálogo hasta gastar la capacidad de la misión),
 *  2. arranca un hilo por cada defensa que ataca,
 *  3. va haciendo aparecer las criaturas por los bordes del mapa, una por una, cada una con su hilo,
 *  4. revisa si la misión terminó (VICTORIA o DERROTA).
 */
public class Batalla {

    private final Mapa mapa;
    private final ArrayList<Criatura> porAparecer = new ArrayList<>();
    private final ArrayList<Criatura> todasLasCriaturas = new ArrayList<>();   // para la pantalla de resultados
    private final Random azar = new Random();
    
    int mision;
    private volatile boolean todasHanAparecido = false;
    private volatile String resultado = "EN CURSO";

    //==========================================
    // constructor
    //==========================================

    public Batalla(Mapa mapa, ArrayList<ConfigComponente> catalogo, int mision) {
        this.mapa = mapa;
        this.mision = mision;
        prepararEjercito(catalogo, mision);
    }

    public static int capacidadParaMision(int mision) {
        return 20 + 5 * (mision - 1);
    }

    //==========================================
    // preparación
    //==========================================

    private void prepararEjercito(ArrayList<ConfigComponente> catalogo, int mision) {

        //criaturas que se pueden usar en esta misión
        ArrayList<ConfigComponente> posibles = new ArrayList<>();
        
        for (ConfigComponente c : catalogo) {
        
            if (c.getCategoria().equalsIgnoreCase("Criatura") && c.isActivo()
                    && c.getMisionMinima() <= mision && c.getCosto() > 0) {
                posibles.add(c);
            }
        }

        //elijo al azar hasta gastar toda la capacidad
        int capacidad = capacidadParaMision(mision);
        
        while (capacidad > 0 && !posibles.isEmpty()) {
            ConfigComponente c = posibles.get(azar.nextInt(posibles.size()));
        
            if (c.getCosto() > capacidad) {
                posibles.remove(c);              // ya no cabe, no la vuelvo a elegir
                continue;
            }
            
            Criatura nueva = (Criatura) FabricaTropas.crear(c);
            porAparecer.add(nueva);
            todasLasCriaturas.add(nueva);
            capacidad -= c.getCosto();
        }
    }

    //==========================================
    // la batalla
    //==========================================

    public void iniciar() {
        mapa.iniciarBatalla();

        // un hilo por cada defensa que ataca (las barreras no atacan, no necesitan hilo)
        for (Defensa defensa : mapa.getDefensas()) {
            
            if (defensa instanceof DefensaAtacante defensaAtacante) {
                defensaAtacante.activar(); 
            }
        }

        // un hilo que va haciendo aparecer las criaturas
        lanzar(this::hacerAparecerCriaturas);
    }

    private void hacerAparecerCriaturas() {
        for (Criatura c : porAparecer) {
            if (!mapa.hayBatalla()) {
                return;
            }
            if (colocarEnBorde(c)) {
                c.move();                        // la criatura crea su propio hilo y empieza a moverse
            }
            dormir(1000);
            verificarFin();
        }
        todasHanAparecido = true;

        // ya aparecieron todas: reviso hasta que termine
        while (mapa.hayBatalla()) {
            verificarFin();
            dormir(300);
        }
    }

    /** Pone la criatura en una casilla libre del borde del mapa (siempre fuera del perímetro de defensas). */
    private boolean colocarEnBorde(Criatura c) {
        for (int intento = 0; intento < 200; intento++) {
            int k = azar.nextInt(25);
            int ultimo = 25 - 1;
            int i, j;
            switch (azar.nextInt(4)) {
                case 0 -> { i = k;      j = 0; }
                case 1 -> { i = k;      j = ultimo; }
                case 2 -> { i = 0;      j = k; }
                default -> { i = ultimo; j = k; }
            }
            if (mapa.add(i, j, c)) {
                return true;
            }
        }
        return false;
    }

    private synchronized void verificarFin() {
        if (!mapa.hayBatalla()) {
            return;
        }
        if (!mapa.getNucleo().estaViva()) {
            terminar("DERROTA");
        } else if (todasHanAparecido && mapa.getCriaturas().isEmpty()) {
            terminar("VICTORIA");
        }
    }

    private void terminar(String resultadoFinal) {
        resultado = resultadoFinal;
        mapa.terminarBatalla();
        System.out.println("Misión terminada: " + resultadoFinal);
    }

    //==========================================
    // utilidades
    //==========================================

    private void lanzar(Runnable r) {
        Thread hilo = new Thread(r);
        hilo.setDaemon(true);                   // si se cierra la ventana, no queda nada colgado
        hilo.start();
    }

    private void dormir(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    //==========================================
    // gets
    //==========================================

    public String getResultado() {
        return resultado;
    }

    public int getCantidadEnemigos() {
        return todasLasCriaturas.size();
    }

    public ArrayList<Criatura> getTodasLasCriaturas() {
        return todasLasCriaturas;
    }
}
