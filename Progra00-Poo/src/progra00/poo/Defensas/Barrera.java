/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Defensa;
import progra00.poo.Tropa;

public class Barrera extends Defensa {
    
    //==========================================
    // constructores
    //==========================================
    
    public Barrera(String nombre, int vida) {
        super(nombre, vida);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return false;
    }
    
    
}
