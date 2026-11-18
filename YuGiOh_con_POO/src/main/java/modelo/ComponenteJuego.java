/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public abstract class ComponenteJuego {
    public static final String FRANQUICIA = "Yu-Gi-Oh!";
    public String nombre;
    
    public abstract void mostrarDetalle(); // Polimorfismo de sobreescritura
}