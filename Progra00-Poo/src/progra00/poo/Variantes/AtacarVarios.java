/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Variantes;

import java.util.ArrayList;
import progra00.poo.Tropa;

public class AtacarVarios {

    //==========================================
    // métodos
    //==========================================

    public static void atacar(Tropa tropa, ArrayList<Tropa> adyacentes, int daño){
        
        for (Tropa adyacente : adyacentes ) {
            adyacente.setVida( adyacente.getVida() - daño );
        }
    }    
}
