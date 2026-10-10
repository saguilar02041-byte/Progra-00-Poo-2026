/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Criatura;
import progra00.poo.Defensa;
import progra00.poo.Variantes.LargoAlcance;

public class Escupidor extends Criatura {

    //===============Atributos==================

    private int alcance;
    
    //==========================================
    // constructores
    //==========================================
    
    public Escupidor(String nombre, int vida, int daño, int alcance) {
        super(nombre, vida, daño);
        this.alcance = alcance; 
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Defensa enemigo) {
        LargoAlcance.atacar(this, enemigo, this.getDaño(), alcance);
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //==========================================
    // gets, setters
    //==========================================
    
    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    
}
