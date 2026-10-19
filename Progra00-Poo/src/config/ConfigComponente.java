/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author paula
 */

import java.io.Serializable;

public class ConfigComponente implements Serializable{
    private static final long serialVersionUID = 1L;
    // ATRIBUTOS
    private String id;
    private String nombre;
    private String categoria;     // "DEFENSA" o "CRIATURA"
    private String tipo;          // "CONTACTO", "ALCANCE", "DRON", "ACECHADOR", ...
    private int vida;
    private int frecuencia;
    private int alcance;
    private int radio;
    private int costo;
    private int misionMinima;
    private String imgNormal;
    private String imgMovimiento;
    private String imgAtaque;
    private boolean activo = false;
    
    //Constructor

    public ConfigComponente(String nombre, String categoria, String tipo, int vida, int frecuencia, int alcance, int radio, int costo, int misionMinima) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipo = tipo;
        this.vida = vida;
        this.frecuencia = frecuencia;
        this.alcance = alcance;
        this.radio = radio;
        this.costo = costo;
        this.misionMinima = misionMinima;
    }
    

    // GETTERS Y SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getMisionMinima() {
        return misionMinima;
    }

    public void setMisionMinima(int misionMinima) {
        this.misionMinima = misionMinima;
    }

    public String getImgNormal() {
        return imgNormal;
    }

    public void setImgNormal(String imgNormal) {
        this.imgNormal = imgNormal;
    }

    public String getImgMovimiento() {
        return imgMovimiento;
    }

    public void setImgMovimiento(String imgMovimiento) {
        this.imgMovimiento = imgMovimiento;
    }

    public String getImgAtaque() {
        return imgAtaque;
    }

    public void setImgAtaque(String imgAtaque) {
        this.imgAtaque = imgAtaque;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}

