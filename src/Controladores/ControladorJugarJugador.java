/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import dominio.Jugador;
import interfaces.VistaJugarJugador;


public class ControladorJugarJugador /*implements Observador*/{
    
    VistaJugarJugador vista;
    Jugador usuarioJugador;

    public ControladorJugarJugador(VistaJugarJugador vista, Jugador usuarioCrupier) {
        this.vista = vista;
        this.usuarioJugador = usuarioCrupier;
    }
    
    
}
