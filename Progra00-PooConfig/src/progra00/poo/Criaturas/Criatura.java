/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Tropa;

public abstract class Criatura extends Tropa{
    private static final long serialVersionUID = 1L;
    private int dano;

    public Criatura(int dano, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
        this.dano = dano;
    }

    
    
    
    
    

}
