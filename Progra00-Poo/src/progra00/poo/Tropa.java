/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo;

import progra00.poo.Mapa.Mapa;
import config.ConfigComponente;

public abstract class Tropa extends ConfigComponente {

    
    //===============Atributos==================

    private int vida;
    private int vidaMax;
    private String nombre;
    
    //pos en la matriz
    private int i;
    private int j;
    
    private int frecuencia = 1;     //acciones por segundo
    private int costo = 1;
    
    //referenciadel mapa
    protected transient Mapa mapa;
    
    //==========================================
    // constructores
    //==========================================
    
    public Tropa(String nombre, int vida) {
        super(nombre, nombre, nombre, vida, 10, vida, vida, 1, vida);
    }
    
    //==========================================
    // métodos
    //==========================================
    
    public abstract boolean puedeAtacar(Tropa obj);
    
    public void morir(){
        this.vida = 0;
        
        System.out.println(nombre + "murió");
        
        if(mapa != null){
            mapa.quitar(this);
        }
        
    }
    
    public boolean estaViva() {
        return vida > 0;
    }

    public int distanciaA(Tropa otra) {
        return Math.max(Math.abs(i - otra.i), Math.abs(j - otra.j));
    }
    
    public void recibirDano(int daño) {
        
        this.vida =- daño;
        
        if(this.vida < 0){
            morir();
        }
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
    
    public int getDistanciaAtaque(){
        return 1;
    }
    
    public void setPosicion(int i, int j){
        this.i = i;
        this.j = j;
    }
    
    public int getVidaMaxima() {
        return vidaMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = Math.max(1, frecuencia);
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
}
