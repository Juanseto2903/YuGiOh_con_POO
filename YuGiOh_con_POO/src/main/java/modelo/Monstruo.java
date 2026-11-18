/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public class Monstruo extends ComponenteJuego {
    private int atk;
    private int def;
    private String posicion; // "ATAQUE" o "DEFENSA"

    // Único constructor para cumplir el UML
    public Monstruo(String nombre, int atk, int def, String posicion) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.posicion = posicion;
    }

    public int getAtk() { return atk; }
    public void setAtk(int atk) { this.atk = atk; }
    public int getDef() { return def; }
    public void setDef(int def) { this.def = def; }
    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    @Override
    public String toString() {
        return "Monstruo[" + nombre + " | ATK: " + atk + " | DEF: " + def + " | POS: " + posicion + "]";
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(this.toString());
    }
}