/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Criatura;
import progra00.poo.Defensa;
import progra00.poo.Variantes.Volar;

public class Volador extends Criatura {
    
    //==========================================
    // constructores
    //==========================================
    
    public Volador(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void atacar(Defensa enemigo) {
    }

    @Override
    public void move() {
        Volar.volar(this);
    }

    
    
}
