/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;


import static config.ManejoArchivos.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author paula
 */
public class config {
    

    public static void main(String[] args) {
        //crearArchivo(); //Puedo ponerle una ruta y al final el nombre del archivo que quiero crear
        FrameLogin frameLog = new FrameLogin();
        frameLog.setVisible(true);
    }
        
    
    
    
}
    

