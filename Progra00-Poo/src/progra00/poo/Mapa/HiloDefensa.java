/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Mapa;

import progra00.poo.Defensas.DefensaAtacante;

/**
 *
 * @author sebitas
 */
public class HiloDefensa extends Thread {

    private final DefensaAtacante defensa;
    private final Mapa mapa;

    public HiloDefensa(DefensaAtacante defensa, Mapa mapa) {
        this.defensa = defensa;
        this.mapa = mapa;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (defensa.estaViva() && mapa.hayBatalla()) {

            defensa.actuar();                   // un turno de la defensa

            try {
                Thread.sleep(1000 / defensa.getFrecuencia());
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
