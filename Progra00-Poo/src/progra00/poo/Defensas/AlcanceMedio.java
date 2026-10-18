/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import progra00.poo.Criaturas.Criatura;
import progra00.poo.Variantes.LargoAlcance;

public class AlcanceMedio extends DefensaAtacante {

    //===============Atributos==================
    
    private int alcance;
    
    //==========================================
    // constructores
    //==========================================
    
    public AlcanceMedio(String nombre, int vida, int daño, int alcance) {
        super(nombre, vida, daño);
        this.alcance = alcance;
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Criatura enemigo) {
        LargoAlcance.atacar(this, enemigo, this.getDaño(), alcance);
    }
    
    
    public int getDistanciaAtaque() {
        return alcance;
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
