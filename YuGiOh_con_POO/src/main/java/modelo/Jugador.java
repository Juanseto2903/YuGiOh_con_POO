/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public class Jugador extends ComponenteJuego {
    public int lp = 8000; 
    
    @Override
    public void mostrarDetalle() {
        System.out.println("Jugador: " + nombre + " | Life Points: " + lp);
    }
}