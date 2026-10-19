/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import java.util.ArrayList;
import progra00.poo.Defensas.Defensa;
import progra00.poo.Tropa;
import progra00.poo.Variantes.AtacarVarios;
import progra00.poo.Variantes.CortoAlcance;

public class Demoledor extends Criatura {

    private static final long serialVersionUID = 1L;

    //==========================================
    // constructores
    //==========================================

    public Demoledor(int dano, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(dano, nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
    }

    //==========================================
    // métodos
    //==========================================

    public void explotar(ArrayList<Tropa> adyacentes) {
        AtacarVarios.atacar(this, adyacentes, this.getDaño());
        this.morir();
    }

    @Override
    public void atacar(Defensa enemigo) {
        CortoAlcance.atacar(this, enemigo, this.getDaño());
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
