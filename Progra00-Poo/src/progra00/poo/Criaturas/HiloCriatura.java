/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Criaturas;

import progra00.poo.Mapa.Mapa;

/**
 *
 * @author sebitas
 */
public class HiloCriatura extends Thread{
    
    //===============Atributos==================

    private final Criatura criatura;
    private final Mapa mapa;

    //==========================================
    // constructor
    //==========================================
    
    public HiloCriatura(Criatura criatura, Mapa mapa) {
        this.criatura = criatura;
        this.mapa = mapa;
        setDaemon(true);
    }

    //==========================================
    // métodos
    //==========================================
    
    @Override
    public void run() {
        while (criatura.estaViva() && mapa.hayBatalla()) {

            criatura.actuar();                 
            
            try {
                //el sleep depende de qué tan rápida es la criatura
                Thread.sleep(1000 / criatura.getFrecuencia());
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
