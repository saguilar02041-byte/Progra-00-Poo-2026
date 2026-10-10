/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

public abstract class Tropa {
    
    //==========================================
    // Atributos
    //==========================================
    
    private int vida;
    private int daño;
    
    private String nombre;
    
    //==========================================
    // constructores
    //==========================================
    
    public Tropa(String nombre, int vida, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
    }
    
    //==========================================
    // métodos
    //==========================================
    
    public abstract boolean puedeAtacar(Tropa obj);
    
    public void morir(){
        System.out.println( nombre + " : morí");
    }
    
    //==========================================
    // gets, setters
    //==========================================

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
}
