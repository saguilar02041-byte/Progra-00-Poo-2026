/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criaturas.Criatura;
import progra00.poo.Variantes.CortoAlcance;

public class Contacto extends DefensaAtacante {
    
    //==========================================
    // constructores
    //==========================================
    
    public Contacto(int daño, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(daño, nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
    }
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Criatura enemigo) {
        CortoAlcance.atacar(this, enemigo, this.getDaño());
    }
    
}
