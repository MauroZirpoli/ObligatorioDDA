/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Observer.Observable;
import Observer.Observador;
import dominio.Crupier;

import dominio.MecanismoSorteo;
import dominio.Mesa;

import interfaces.VistaOperarMesaCrupier;
import java.util.ArrayList;
import logica.Fachada;


public class ControladorOperarMesaCrupier implements Observador {

    VistaOperarMesaCrupier vista;
    Crupier usuarioCrupier;
    Mesa mesaAsignada;

    public ControladorOperarMesaCrupier(VistaOperarMesaCrupier vista, Crupier usuarioCrupier) {
        this.vista = vista;
        this.usuarioCrupier = usuarioCrupier;
        this.mesaAsignada = usuarioCrupier.getMesaAsignada();
    }

    public void obtenerDatos() {
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        int numeroMesa = mesaAsignada.getNumeroDeMesa();
        ArrayList<MecanismoSorteo> efectos = Fachada.getInstancia().getEfectos();
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, 1, numeroMesa, efectos);

    }

    public void lanzarPagar() {
        if (mesaAsignada.isDisponible()) {
            mesaAsignada.setDisponible(false);
            //habilitar el boton cerrar mesa
        } else {
            mesaAsignada.setDisponible(true);
            //deshabilitar boton cerrar mesa
        }
    }
    
    public void listarJugadoresConSuSaldo(){
        this.vista.listarJugadoresConSuSaldo(Fachada.getInstancia().buscarMesa(mesaAsignada).getJugadores());
    }
    
    public void listarRondasConSuInformacion(){
        this.vista.listarRondasConSuInformacion(Fachada.getInstancia().buscarMesa(mesaAsignada).getRondas());
    }
    
    public void ultimosLanzamientos(){
        this.vista.ultimosLanzamientos(Fachada.getInstancia().buscarMesa(mesaAsignada).ultimosSeisNumerosSorteados());
    }
    
    public void ultimoNumeroSorteado(){
        this.vista.ultimoNumeroSorteado(mesaAsignada.ultimoNumeroSorteado());
    }

    public void cerrarMesa() {
        //liquidar mesa (pagar)
        // desloguear jug
          // desloguear el crupier
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        
        if (((Observable.Evento) evento).equals(Observable.Evento.CARGAR_RONDA)) {
            
            obtenerDatos();
            listarJugadoresConSuSaldo();
            listarRondasConSuInformacion(); 
            ultimosLanzamientos();
            ultimoNumeroSorteado();
        }
    }
}
