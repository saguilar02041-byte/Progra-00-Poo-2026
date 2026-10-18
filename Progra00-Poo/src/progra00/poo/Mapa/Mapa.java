/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Mapa;

import java.io.Serializable;
import java.util.ArrayList;
import progra00.poo.Criatura;
import progra00.poo.Defensa;
import progra00.poo.Tropa;

public class Mapa implements Serializable {
    
    //===============Atributos==================
    
    //Matriz 25x25 donde se ponen las tropas
    private Tropa[][] matriz = new Tropa[25][25];
    private final Nucleo nucleo;
    
    private boolean batallaActiva = false;
    
    //==========================================
    // constructores
    //==========================================
    
    public Mapa(){
        nucleo = new Nucleo(200);
        this.add(13, 13, nucleo);
    }
    
    //==========================================
    // métodos
    //==========================================
    
    public boolean dentro(int i, int j) {
        return i >= 0 && i < 25 && j >= 0 && j < 25;
    }

    public synchronized boolean add(int i, int j, Tropa t) {
        if (!dentro(i, j) || matriz[i][j] != null) {
            return false;
        }
        
        matriz[i][j] = t;
        t.setPosicion(i, j);
        t.setMapa(this);
        
        return true;
    }

    public synchronized boolean addDefensa(int i, int j, Defensa d) {
        if (d == null) {
            if (dentro(i, j) && matriz[i][j] != nucleo) {
                matriz[i][j] = null;
            }
            return true;
        }
        return add(i, j, d);
    }

    public synchronized boolean mover(Tropa t, int i, int j) {
        if (!t.estaViva() || !dentro(i, j) || matriz[i][j] != null) {
            return false;
        }
        
        if (matriz[t.getI()][t.getJ()] != t) {
            return false;
        }
        
        matriz[t.getI()][t.getJ()] = null;
        matriz[i][j] = t;
        t.setPosicion(i, j);
        
        return true;
    }

    public synchronized void quitar(Tropa t) {
        if (t != nucleo && dentro(t.getI(), t.getJ()) && matriz[t.getI()][t.getJ()] == t) {
            matriz[t.getI()][t.getJ()] = null;
        }
    }    
    
    //==========================================
    // consultas
    //==========================================
    
    public synchronized boolean estaLibre(int i, int j) {
        return dentro(i, j) && matriz[i][j] == null;
    }

    public synchronized Tropa getTropa(int i, int j) {
        return dentro(i, j) ? matriz[i][j] : null;
    }

    public synchronized Defensa getDefensa(int i, int j) {
        Tropa t = getTropa(i, j);
        return (t instanceof Defensa) ? (Defensa) t : null;
    }

    public synchronized ArrayList<Tropa> getVecinos(int i, int j, int radio) {
        ArrayList<Tropa> lista = new ArrayList<>();
        
        for (int a = i-radio; a <= i+radio; a++) {
            
            for (int b = j-radio; b <= j+radio; b++) {
                
                if ((a!=i || b!=j) && dentro(a, b) && matriz[a][b] != null) {
                    lista.add(matriz[a][b]);
                }
            }
        }
        return lista;
    }

    public synchronized ArrayList<Criatura> getCriaturas() {
        ArrayList<Criatura> lista = new ArrayList<>();
        
        for (int i=0; i<25; i++) {
            
            for (int j=0; j<25; j++) {
            
                if (matriz[i][j] instanceof Criatura && matriz[i][j].estaViva()) {
                    lista.add((Criatura) matriz[i][j]);
                }
            }
        }
        return lista;
    }

    public synchronized ArrayList<Defensa> getDefensas() {
        ArrayList<Defensa> lista = new ArrayList<>();
        for (int i=0; i<25; i++) {
            
            for (int j=0; j<25; j++) {
            
                if (matriz[i][j] instanceof Defensa && matriz[i][j] != nucleo) {
                    lista.add((Defensa) matriz[i][j]);
                }
            }
        }
        return lista;
    }

    public synchronized Criatura criaturaMasCercana(Tropa desde, int alcance) {
        
        Criatura mejor = null;
        int menor = alcance + 1;
        
        for (Criatura c : getCriaturas()) {
            int d = desde.distanciaA(c);
            
            if (d < menor) {
                menor = d;
                mejor = c;
            }
        }
        return mejor;
    }

    public Nucleo getNucleo() {
        return nucleo;
    }
    
    //==========================================
    // consultas
    //==========================================
    
    public void iniciarBatalla() {
        batallaActiva = true;
    }

    public void terminarBatalla() {
        batallaActiva = false;
    }

    public boolean hayBatalla() {
        return batallaActiva;
    }
    
    
    
}
