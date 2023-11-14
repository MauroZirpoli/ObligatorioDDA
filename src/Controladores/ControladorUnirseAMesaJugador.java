/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Exceptions.UsuariosExceptions;
import Observer.Observable;
import Observer.Observador;
import dominio.Jugador;
import dominio.Mesa;
import logica.Fachada;
import interfaces.VistaUnirseAMesaJugador;
import ui.VentanaMesaJugador;

public class ControladorUnirseAMesaJugador implements Observador{
    
    VistaUnirseAMesaJugador vista;
    Jugador usuarioJugador;

    public ControladorUnirseAMesaJugador(VistaUnirseAMesaJugador vista, Jugador usuarioJugador) {
        this.vista = vista;
        this.usuarioJugador = usuarioJugador;
    }
    
    public void listarMesasDisponibles(){
        this.vista.listarMesasDisponibles(Fachada.getInstancia().getMesasDisponibles());
    }
    
    public boolean agregarJugadorAMesa(Mesa mesaSeleccionada, Jugador jugador){
        
        boolean ok;
        
        try {
            ok = Fachada.getInstancia().agregarJugadorAMesa(mesaSeleccionada, jugador);
            return true;
        }catch(UsuariosExceptions e) {
            this.vista.mostrarError(e.getMessage());
        }
        
        return false;
        
    }
     
    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Unirse a Mesa Jugador")) {
            usuarioJugador.setLogueado(false);
            vista.salir();
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
