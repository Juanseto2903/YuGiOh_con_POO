/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author juans
 */

import modelo.*;

public class ControladorBatalla {
    private LogicaCombate logica;
    private GestorPersistencia persistencia;

    public ControladorBatalla() {
        this.logica = new LogicaCombate();
        this.persistencia = new GestorPersistencia();
    }

    public String procesarAtaque(Monstruo atacante, Monstruo defensor, Jugador jDefensor) {
        String resultado = logica.ejecutarAtaque(atacante, defensor, jDefensor);
        persistencia.guardarHistorial(resultado);
        return resultado; 
    }

    public String procesarAtaqueDirecto(Monstruo atacante, Jugador jDefensor) {
        String resultado = logica.ejecutarAtaque(atacante, jDefensor);
        persistencia.guardarHistorial(resultado);
        return resultado;
    }
}
