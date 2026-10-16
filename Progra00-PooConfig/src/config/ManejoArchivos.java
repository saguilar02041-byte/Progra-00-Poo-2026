/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author paula
 */
public class ManejoArchivos {
    private static final String nombreArchivo = "/home/paula/Documents/POO/Progra-00-Poo-2026/componentes.txt";


    /*public static void crearArchivo(){
        try {
            
            FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
            System.out.println("Se creo un archivo");
           
          
        } catch (FileNotFoundException ex) {
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }*/
    
    
    
    public static void crearEscribirArchivo(ArrayList<ConfigComponente> lista) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            
            out.writeObject(lista);
            System.out.println(lista+ "escrito");
            
        } catch (IOException ex) {
            
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
}
    
    

  
}
