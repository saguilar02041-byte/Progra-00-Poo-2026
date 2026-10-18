/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Defensas;

import java.util.ArrayList;
import progra00.poo.Criaturas.Criatura;
import progra00.poo.Tropa;
import progra00.poo.Variantes.AtacarVarios;
import progra00.poo.Variantes.CortoAlcance;

public class Impacto extends DefensaAtacante {

    //==========================================
    // constructores
    //==========================================
    
    public Impacto(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }

    //==========================================
    // métodos
    //==========================================

    public void explotar(ArrayList<Tropa> adyacentes) {
        AtacarVarios.atacar(this, adyacentes, this.getDaño());
        this.morir();
    }

    @Override
    public void atacar(Criatura enemigo) {
        CortoAlcance.atacar(this, enemigo, this.getDaño());
    }

    
    
}
