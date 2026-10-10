/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

public abstract class Defensa extends Tropa{

    //==========================================
    // constructores
    //==========================================

    public Defensa(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }    
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return obj instanceof Criatura;        
    }    
    
    public abstract void atacar(Criatura enemigo);
    
    
}
