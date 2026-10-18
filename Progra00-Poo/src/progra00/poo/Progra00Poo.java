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
    ArrayList<Defensa> listaDefensas; 
    ArrayList<Criatura> listaCriaturas;
    
    ArrayList<Acechador> listaAcechadores;
    ArrayList<Demoledor> listaDemoledores;
    ArrayList<Enjambre> listaEnjambre;
    ArrayList<Escupidor> listaEscupidores;
    ArrayList<Volador> listaVoladores;
    
    ArrayList<AlcanceMedio> listaAlcanceMedio;
    ArrayList<AtaqueMultiple> listaAtaqueMultiple;
    ArrayList<Barrera> listaBarreras;
    ArrayList<Contacto> listaContactos;
    ArrayList<DefensaAtacante> listaDefensasAtacantes;
    ArrayList<Dron> listaDrones;
    ArrayList<Impacto> listaImpactos;
    
    
    for (ConfigComponente c : listaComponentes) {
    //TODO: hay que clasificar cada uno
        if(c.getCategoria().equals("Defensa")){
            listaDefensas.add(c);
            if(c.getTipo().equals("AlcanceMedio")){
                listaAlcanceMedio.add(c);
            }else if(c.getTipo().equals("AtaqueMultiple")){
                listaAtaqueMultiple.add(c);
            }else if(c.getTipo().equals("Barrera")){
                listaBarreras.add(c);
            }else if(c.getTipo().equals("Contacto")){
                listaContactos.add(c);
            }else if(c.getTipo().equals("DefensaAtacante")){
                listaDefensasAtacantes.add(c);
            }else if(c.getTipo().equals("Dron")){
                listaDrones.add(c);
            }else if(c.getTipo().equals("Impacto")){
                listaImpactos.add(c);
            }
        }else if(c.getCategoria().equals("Criatura")){
            listaCriaturas.add(c);
            if(c.getTipo().equals("Acechador")){
                listaAcechadores.add(c);
            }else if(c.getTipo().equals("Demoledor")){
                listaDemoledores.add(c);
            }else if(c.getTipo().equals("Enjambre")){
                listaEnjambre.add(c);
            }else if(c.getTipo().equals("Escupidor")){
                listaEscupidores.add(c);
            }else if(c.getTipo().equals("Volador")){
                listaVoladores.add(c);
            }
        }   
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
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
