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
    private static String nombreArchivo = "componentes.txt";


    public static void crearArchivo(){
        try {
            
            FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
            System.out.println("Se creo un archivo");
           
          
        } catch (FileNotFoundException ex) {
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }
    
    public static void escribirArchivo(ArrayList<ConfigComponente> lista) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(lista);   // se guarda toda la lista como un solo objeto
            System.out.println("se guardo la lista");
        } catch (IOException ex) {
            System.getLogger(ManejoArchivos.class.getName())
                  .log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    

  
}
