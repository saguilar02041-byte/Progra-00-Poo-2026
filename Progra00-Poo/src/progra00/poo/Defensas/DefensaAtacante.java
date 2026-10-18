/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criaturas.Criatura;
import progra00.poo.Mapa.HiloDefensa;
import progra00.poo.Tropa;

/**
 * Esta clase separa a las clases que heredan de defensa que aparte pueden atacar
 */
public abstract class DefensaAtacante extends Defensa {
    
    //===============Atributos==================
    
    private int daño;
    private transient Thread hilo;
    
    //==========================================
    // constructores
    //==========================================
    
    public DefensaAtacante(String nombre, int vida, int daño) {
        super(nombre, vida);
        this.daño = daño;
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return obj instanceof Criatura;        
    }    
    
    public abstract void atacar(Criatura enemigo);
    
    
    public void activar() {
        
        if (mapa == null || hilo != null) {
            return;
        }
        hilo = new HiloDefensa(this, mapa);
        hilo.start();
    }

    public void actuar() {
        Criatura objetivo = mapa.criaturaMasCercana(this, getDistanciaAtaque());
        
        if (objetivo != null) {
            atacar(objetivo);
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
