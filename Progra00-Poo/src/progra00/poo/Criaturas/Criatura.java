/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import java.util.ArrayList;
import java.util.Collections;
import progra00.poo.Defensas.Defensa;
import progra00.poo.Mapa.Nucleo;
import progra00.poo.Tropa;

public abstract class Criatura extends Tropa{
    
    //===============Atributos==================
    
    private int daño;
    
    //hilo para que se pueda mover
    private Thread hilo;
    
    public Criatura(int dano, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
        this.daño = dano;
    }
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return obj instanceof Defensa;
    }
    
    public abstract void atacar(Defensa enemigo);
    
    public void move() {
        if (mapa == null || hilo != null) {
            return;                  // todavía no está en el mapa, o ya se está moviendo
        }
        hilo = new HiloCriatura(this, mapa);
        hilo.start();
    }

    public void actuar() {
        Nucleo nucleo = mapa.getNucleo();
        
        //si se encuentra en su rango
        if (distanciaA(nucleo) <= getDistanciaAtaque()) {
            atacar(nucleo);
        } else {
            //sino camina
            darPaso();
        }
    }
    
    //da un paso al frente
    private void darPaso() {
        if (avanzar()) {
            return;
        }
        Defensa estorbo = buscarEstorbo();
        if (estorbo == null) {
            return;                  // lo que estorba es otra criatura: espera
        }
        if (ignoraObstaculos()) {
            pasoLateral();           // el volador rodea
        } else {
            atacar(estorbo);         // la terrestre rompe el obstáculo
        }
    }

    protected boolean ignoraObstaculos() {
        return false;
    }

    // ---------- movimiento (auxiliares) ----------

    private int[][] direcciones() {
        Nucleo n = mapa.getNucleo();
        
        int di = Integer.signum(n.getI() - getI());
        int dj = Integer.signum(n.getJ() - getJ());
        
        return new int[][]{{di, dj}, {di, 0}, {0, dj}};
    }

    private boolean avanzar() {
        
        for (int[] d : direcciones()) {
            
            if (d[0] == 0 && d[1] == 0) {
                continue;
            }
            if (mapa.mover(this, getI()+d[0], getJ()+d[1])) {
                return true;
            }
        }
        return false;
    }

    private Defensa buscarEstorbo() {
        for (int[] d : direcciones()) {
            if (d[0] == 0 && d[1] == 0) {
                continue;
            }
            Tropa t = mapa.getTropa(getI() + d[0], getJ() + d[1]);
            if (t instanceof Defensa) {
                return (Defensa) t;
            }
        }
        return null;
    }

    private void pasoLateral() {
        ArrayList<int[]> dirs = new ArrayList<>();
        
        for (int di = -1; di <= 1; di++) {
            
            for (int dj = -1; dj <= 1; dj++) {
            
                if (di != 0 || dj != 0) {
                    dirs.add(new int[]{di, dj});
                }
            }
        }
        
        Collections.shuffle(dirs);
        
        for (int[] d : dirs) {
        
            if (mapa.mover(this, getI() + d[0], getJ() + d[1])) {
                return;
            }
        }
    }
    
    //==========================================
    // gets, setters
    //==========================================

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

}
