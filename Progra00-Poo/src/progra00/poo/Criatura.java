/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

public abstract class Criatura extends Tropa{
    
    //===============Atributos==================
    
    private int daño;
    
    //==========================================
    // constructores
    //==========================================
    
    public Criatura(String nombre, int vida, int daño) {
        super(nombre, vida);
        this.daño = daño;
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
    
    //==========================================
    // gets, setters
    //==========================================

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

}
