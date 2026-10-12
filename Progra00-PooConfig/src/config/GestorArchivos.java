/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author paula
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivos {
    private final File archivo;

    public GestorArchivos(String ruta) {
        this.archivo = new File(ruta);
    }

    public void guardar(List<ConfigComponente> lista) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(new ArrayList<>(lista));
        }
    }

    @SuppressWarnings("unchecked")
    public List<ConfigComponente> cargar() throws IOException {
        if (!archivo.exists()) {
            return new ArrayList<>();           // primera vez: lista vacía
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<ConfigComponente>) in.readObject();
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException("Archivo de configuración corrupto o incompatible", e);
        }
    }
}
