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


    public static void crearArchivo(String nombreArchivo){
        try {
            
            FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
            System.out.println("Se creo un archivo llamado: "+nombreArchivo);
           
          
        } catch (FileNotFoundException ex) {
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }
    

    @SuppressWarnings("unchecked")
    public static ArrayList<ConfigComponente> leerArchivo(String ruta) {
        
        File archivo = new File(ruta);
        
        if (!archivo.exists()) {
            System.out.println("No existe: " + archivo.getAbsolutePath());
            return new ArrayList<>();
        }
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<ConfigComponente>) in.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException ex) {
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            return new ArrayList<>();
        }
    }

    
    
    
    /*public static void crearEscribirArchivo(ArrayList<ConfigComponente> lista) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            
            out.writeObject(lista);
            System.out.println(lista+ "escrito");
            
        } catch (IOException ex) {
            
            System.getLogger(ManejoArchivos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
}*/
    
    

  
}
