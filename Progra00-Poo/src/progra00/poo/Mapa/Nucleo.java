/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Mapa;

import progra00.poo.Defensas.Defensa;
import progra00.poo.Tropa;

public class Nucleo extends Defensa{

    //==========================================
    // constructores
    //==========================================
    
    public Nucleo(int vida) {
        super("Núcleo de oxígeno", vida);
    }

    //==========================================
    // métodos
    //==========================================

    @Override
    public boolean puedeAtacar(Tropa obj) {
        return false;
    }
    
    
    
    
    
    
    
}
