/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

public abstract class Tropa {
    
    //===============Atributos==================

    private int vida;
    private String nombre;
    
    //==========================================
    // constructores
    //==========================================
    
    public Tropa(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
