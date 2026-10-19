/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

import config.ConfigComponente;

public abstract class Tropa extends ConfigComponente {
    private static final long serialVersionUID = 1L;
    
    //===============Atributos==================
    
    //pos en la matriz
    private int i;
    private int j;

    //===============Constructor==================
    public Tropa(String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
        this.i = 0;
        this.j = 0;
    }
    
    
    
}
