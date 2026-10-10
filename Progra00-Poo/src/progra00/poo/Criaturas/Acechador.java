/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Criatura;
import progra00.poo.Defensa;
import progra00.poo.Variantes.CortoAlcance;

public class Acechador extends Criatura {

    //==========================================
    // constructores
    //==========================================
    
    public Acechador(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Defensa enemigo) {
        CortoAlcance.atacar(this, enemigo, this.getDaño());
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
