/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criatura;
import progra00.poo.Variantes.CortoAlcance;

public class Contacto extends DefensaAtacante {
    
    //==========================================
    // constructores
    //==========================================
    
    public Contacto(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Criatura enemigo) {
        CortoAlcance.atacar(this, enemigo, this.getDaño());
    }
    
}
