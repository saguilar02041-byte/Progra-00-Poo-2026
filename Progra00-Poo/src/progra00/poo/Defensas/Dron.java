/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criatura;
import progra00.poo.Variantes.Volar;

public class Dron extends DefensaAtacante {

    //==========================================
    // constructores
    //==========================================
    
    public Dron(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Criatura enemigo) {
    }
    
    public void volar() {
        Volar.volar(this);
    }
    
    
}
