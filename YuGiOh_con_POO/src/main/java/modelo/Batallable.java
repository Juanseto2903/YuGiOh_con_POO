/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public interface Batallable {
    String ejecutarAtaque(Monstruo atacante, Monstruo defensor, Jugador jDefensor);
    String ejecutarAtaque(Monstruo atacante, Jugador jDefensor); // Polimorfismo de sobrecarga
}