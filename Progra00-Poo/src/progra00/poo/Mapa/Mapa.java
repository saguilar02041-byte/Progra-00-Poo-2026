/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra00.poo.Mapa;

import progra00.poo.Defensa;

public class Mapa {
    
    //Matriz 25x25 donde se ponen las tropas
    private Defensa[][] matriz;
    
    
    public Mapa(){
        matriz = new Defensa[25][25];
    }
    
    
    public Defensa getDefensa(int i, int j){
        return matriz[i][j];
    }
    
    public void addDefensa(int i, int j, Defensa defensa){
        matriz[i][j] = defensa;
    }
    
    
    
    
}
