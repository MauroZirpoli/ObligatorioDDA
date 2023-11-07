/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import dominio.Crupier;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.Ronda;
import interfaces.VistaOperarMesaCrupier;
import java.util.ArrayList;
import logica.Fachada;

/**
 *
 * @author Mauro
 */
public class ControladorOperarMesaCrupier /*implements Observador*/ {

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
    
    public void listarRondasConSuInformacion(ArrayList<Ronda> rondas){
        this.vista.listarRondasConSuInformacion(Fachada.getInstancia().buscarMesa(mesaAsignada).getRondas());
    }
    
    public void ultimosLanzamientos(){
        this.vista.ultimosLanzamientos(Fachada.getInstancia().buscarMesa(mesaAsignada).ultimosSeisNumerosSorteados());
    }

    public void cerrarMesa() {
        //liquidar mesa (pagar)
        // desloguear jug
        // desloguear el crupier
    }

}
