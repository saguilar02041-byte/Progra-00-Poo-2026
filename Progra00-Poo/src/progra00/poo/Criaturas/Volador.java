/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Defensas.Defensa;
import progra00.poo.Variantes.CortoAlcance;
import progra00.poo.Variantes.Volar;

public class Volador extends Criatura {
    
    //==========================================
    // constructores
    //==========================================
    
    public Volador(int dano, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(dano, nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
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
        Volar.volar(this);
    }

    
    
}
