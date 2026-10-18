/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Tropa;

public abstract class Defensa extends Tropa {

    //==========================================
    // constructores
    //==========================================

    public Defensa(String nombre, int vida) {
        super(nombre, vida);
    }    
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public abstract boolean puedeAtacar(Tropa obj);
    
    
}
