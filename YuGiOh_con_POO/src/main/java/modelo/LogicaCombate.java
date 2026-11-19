/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public class LogicaCombate implements Batallable {
    @Override
    public String ejecutarAtaque(Monstruo atacante, Monstruo defensor, Jugador jDefensor) {
        if(defensor.getPosicion().equalsIgnoreCase("ATAQUE")) {
            if(atacante.getAtk() > defensor.getAtk()) {
                int dano = atacante.getAtk() - defensor.getAtk();
                jDefensor.lp -= dano;
                String mensaje = atacante.nombre + " destruye a " + defensor.nombre + ". Daño a LP: " + dano;
                if (jDefensor.lp <= 0) {
                    jDefensor.lp = 0;
                    mensaje += " ¡El jugador defensor se ha quedado sin LP! ¡Derrota!";
                }
                return mensaje;
            } else if(atacante.getAtk() == defensor.getAtk()) {
                return "Ambos monstruos se destruyen por empate de ATK.";
            } else {
                int dano = defensor.getAtk() - atacante.getAtk();
                return "Ataque fallido. " + atacante.nombre + " destruido. Pierdes LP: " + dano;
            }
        } else {
            if(atacante.getAtk() > defensor.getDef()) {
                return atacante.nombre + " destruye a " + defensor.nombre + " (Estaba en DEFENSA). Sin daño a LP.";
            } else if(atacante.getAtk() == defensor.getDef()) {
                return "Empate en defensa. Ningún monstruo es destruido.";
            } else {
                int dano = defensor.getDef() - atacante.getAtk();
                return "Defensa inquebrantable. " + atacante.nombre + " rebota. Pierdes LP: " + dano;
            }
        }
    }

    @Override
    public String ejecutarAtaque(Monstruo atacante, Jugador jDefensor) {
        jDefensor.lp -= atacante.getAtk();
        String mensaje = "Ataque directo de " + atacante.nombre + ". Daño a LP: " + atacante.getAtk();
        if (jDefensor.lp <= 0) {
            jDefensor.lp = 0;
            mensaje += " ¡El jugador defensor se ha quedado sin LP! ¡Derrota!";
        }
        return mensaje;
    }
}