/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criaturas.Criatura;
import progra00.poo.Mapa.HiloDefensa;
import progra00.poo.Tropa;

/**
 * Esta clase separa a las clases que heredan de defensa que aparte pueden atacar
 */
public abstract class DefensaAtacante extends Defensa {
    
    //===============Atributos==================
    
    private int dano;

    public DefensaAtacante(int daño, String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        super(nombre, categoria, tipo, vida, frecuencia, alcance, radio, costo, misionMinima);
        this.dano = daño;
    }
    
    
}
