/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Tropa;

public class Barrera extends Defensa {
    
    //==========================================
    // constructores
    //==========================================
    public Barrera(String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return false;
    }
    
    
}
