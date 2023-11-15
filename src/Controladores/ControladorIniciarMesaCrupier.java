/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Observer.Observable;
import Observer.Observador;
import dominio.Crupier;
import dominio.Mesa;
import dominio.Ronda;
import dominio.TipoApuesta;
import logica.Fachada;
import interfaces.VistaIniciarMesaCrupier;
import java.util.ArrayList;


public class ControladorIniciarMesaCrupier implements Observador{
    
    VistaIniciarMesaCrupier vista;
    Crupier usuarioCrupier;

    public ControladorIniciarMesaCrupier(VistaIniciarMesaCrupier vista, Crupier usuarioCrupier) {
        this.vista = vista;
        this.usuarioCrupier = usuarioCrupier;
        Mesa mesa = new Mesa(usuarioCrupier);
        Ronda ronda = new Ronda();
        mesa.agregarRonda(ronda);
        this.usuarioCrupier.setMesaAsignada(mesa);
        Fachada.getInstancia().agregarMesa(mesa);
    }
    
    public void listarTipoApuestas(){
        ArrayList<TipoApuesta> tipos = Fachada.getInstancia().getTiposApuesta();
        this.vista.listarTiposDeApuestas(tipos);
    }
    
        
    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Iniciar Mesa Crupier")) {
            usuarioCrupier.setLogueado(false);
            vista.salir();
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
