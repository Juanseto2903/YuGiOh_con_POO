/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

import java.io.FileWriter;
import java.io.IOException;

public class GestorPersistencia {
    public void guardarHistorial(String registro) {
        try (FileWriter fw = new FileWriter("historial_combate.txt", true)) {
            fw.write(registro + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}