/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicaCombateTest {

    @Test
    public void testAtaqueDirectoReduceLP() {
        Jugador kaiba = new Jugador(); // Inicia con 8000 LP
        kaiba.nombre = "Seto Kaiba";
        Monstruo mago = new Monstruo("Mago Oscuro", 2500, 2100, "ATAQUE");
        LogicaCombate logica = new LogicaCombate();
        
        logica.ejecutarAtaque(mago, kaiba);
        
        assertEquals(5500, kaiba.lp, "Los LP deberían quedar en 5500 tras recibir 2500 de daño directo.");
    }
    
    @Test
    public void testAtaqueVsAtaque() {
        Jugador yugi = new Jugador(); // Inicia con 8000 LP
        yugi.nombre = "Yugi Muto";
        Monstruo mFuerte = new Monstruo("Dragon", 3000, 2500, "ATAQUE");
        Monstruo mDebil = new Monstruo("Duende", 1000, 500, "ATAQUE");
        LogicaCombate logica = new LogicaCombate();
        
        logica.ejecutarAtaque(mFuerte, mDebil, yugi);
        
        assertEquals(6000, yugi.lp, "Yugi debería perder 2000 LP por la diferencia de poder.");
    }

    @Test
    public void testAtaqueVsDefensaNoReduceLP() {
        Jugador joey = new Jugador(); // Inicia con 8000 LP
        joey.nombre = "Joey Wheeler";
        Monstruo atacante = new Monstruo("Mago Oscuro", 2500, 2100, "ATAQUE");
        Monstruo defensor = new Monstruo("Guerrero Castor", 1200, 1500, "DEFENSA");
        LogicaCombate logica = new LogicaCombate();

        logica.ejecutarAtaque(atacante, defensor, joey);

        assertEquals(8000, joey.lp, "Al destruir un monstruo en DEFENSA, los LP del jugador no deben bajar.");
    }
}
