/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Variantes;

import progra00.poo.Tropa;

/**
 * Esta clase permite que Acechador, Contacto, Dron y Volador ataquen a corto alcance 
 */
public class CortoAlcance {
    
    //==========================================
    // métodos
    //==========================================
    
    public static void atacar(Tropa atacante, Tropa enemiga, int daño){
        
        if( /* tiene un enemigo cerca*/ true )
            enemiga.setVida( enemiga.getVida() - daño );
        
    }
}
