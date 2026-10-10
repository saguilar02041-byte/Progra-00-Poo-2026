/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criatura;
import progra00.poo.Defensa;
import progra00.poo.Tropa;

/**
 * Esta clase separa a las clases que heredan de defensa que aparte pueden atacar
 */
public abstract class DefensaAtacante extends Defensa {
    
    //===============Atributos==================
    
    private int daño;
    
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
