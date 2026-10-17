/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra00.poo;

import config.ConfigComponente;
import config.ManejoArchivos;
import java.util.ArrayList;
import progra00.poo.Criaturas.*;
import progra00.poo.Defensas.*;


public class Progra00Poo {

    public static void main(String[] args) {
        
    ArrayList<ConfigComponente> listaComponentes = ManejoArchivos.leerArchivo("/home/paula/Documents/POO/Progra-00-Poo-2026/componentes.txt");
    
    for (ConfigComponente c : listaComponentes) {
    //TODO: hay que clasificar cada uno
    }
    
        //esto es para copiar y pegar en las clases
    //==========================================
    // Atributos
    //==========================================
    
    
    //==========================================
    // constructores
    //==========================================
    
    
    //==========================================
    // métodos
    //==========================================
    
    
    //==========================================
    // gets, setters
    //==========================================
        //ignoremos
        
        
    Defensa droncito = new Dron("droncito", 10, 10);
    Volador mosca = new Volador("mosca", 10, 10);

        System.out.println(droncito.puedeAtacar(mosca));
        System.out.println(mosca.puedeAtacar(mosca));
        
        mosca.morir();
        droncito.morir();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
