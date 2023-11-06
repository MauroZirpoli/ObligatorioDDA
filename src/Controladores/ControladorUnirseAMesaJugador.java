/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import dominio.Jugador;
import dominio.Mesa;
import logica.Fachada;
import interfaces.VistaUnirseAMesaJugador;
import ui.VentanaMesaJugador;

public class ControladorUnirseAMesaJugador /*implements Observador*/{
    
    VistaUnirseAMesaJugador vista;
    Jugador usuarioJugador;

    public ControladorUnirseAMesaJugador(VistaUnirseAMesaJugador vista, Jugador usuarioJugador) {
        this.vista = vista;
        this.usuarioJugador = usuarioJugador;
    }
    
    public void listarMesasDisponibles(){
        this.vista.listarMesasDisponibles(Fachada.getInstancia().getMesasDisponibles());
    }
    
     
    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Unirse a Mesa Jugador")) {
            usuarioJugador.setLogueado(false);
            vista.salir();
        }
    }
    
}
