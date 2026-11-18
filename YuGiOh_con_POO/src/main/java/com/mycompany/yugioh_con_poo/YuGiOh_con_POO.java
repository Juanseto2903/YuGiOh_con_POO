/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yugioh_con_poo;

/**
 *
 * @author juans
 */

import modelo.*;
import vista.VistaBatalla;
import java.util.ArrayList;

public class YuGiOh_con_POO {
    public static void main(String[] args) {
        // --- CUMPLIMIENTO DEL EXAMEN: REPORTES EN CONSOLA ---
        ArrayList<Monstruo> listaMonstruos = new ArrayList<>();
        listaMonstruos.add(new Monstruo("Mago Oscuro", 2500, 2100, "ATAQUE"));
        listaMonstruos.add(new Monstruo("Dragon Blanco", 3000, 2500, "DEFENSA"));
        
        ArrayList<Jugador> salaJugadores = new ArrayList<>();
        Jugador j1 = new Jugador();
        j1.nombre = "Yugi";
        salaJugadores.add(j1);

        System.out.println("=== REPORTE 1: CARTAS REGISTRADAS ===");
        for(Monstruo m : listaMonstruos) { m.mostrarDetalle(); }
        
        System.out.println("\n=== REPORTE 2: ESTADO DE JUGADORES ===");
        for(Jugador j : salaJugadores) { j.mostrarDetalle(); }

        // --- LANZAR LA INTERFAZ GRÁFICA ---
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBatalla().setVisible(true);
            }
        });
    }
}
