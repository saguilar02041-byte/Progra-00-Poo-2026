/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

public abstract class Criatura extends Tropa{
    
    //==========================================
    // constructores
    //==========================================
    
    public Criatura(String nombre, int vida, int daño) {
        super(nombre, vida, daño);
    }
    
    //==========================================
    // métodos
    //==========================================
    
    @Override
    public boolean puedeAtacar(Tropa obj) {
        return obj instanceof Defensa;
    }
    
    public abstract void atacar(Defensa enemigo);
    
    public abstract void move(); 
    
    
}
