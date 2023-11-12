/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Observer.Observable;
import Observer.Observador;
import dominio.Bola;
import dominio.Crupier;

import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.Ronda;

import interfaces.VistaOperarMesaCrupier;
import java.util.ArrayList;
import logica.Fachada;
import componente.PanelRuleta;


public class ControladorOperarMesaCrupier implements Observador {

    VistaOperarMesaCrupier vista;
    Crupier usuarioCrupier;
    Mesa mesaAsignada;
    

    public ControladorOperarMesaCrupier(VistaOperarMesaCrupier vista, Crupier usuarioCrupier) {
        this.vista = vista;
        this.usuarioCrupier = usuarioCrupier;
        this.mesaAsignada = usuarioCrupier.getMesaAsignada();
    }

    public Mesa getMesaAsignada() {
        return mesaAsignada;
    }

    public void obtenerDatos() {
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        int numeroMesa = mesaAsignada.getNumeroDeMesa();
        ArrayList<MecanismoSorteo> efectos = Fachada.getInstancia().getEfectos();
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, 1, numeroMesa, efectos);

    }

    boolean bandera = true;
    public void lanzarPagar(int numeroDeRonda, int balanceSaldo,/* int numeroSorteado,*/ int montoTotalApostado, int cantidadDeApuestas, Mesa mesa, String mecanismo) {
        if (bandera) {
            bandera=false;
            agregarRonda(numeroDeRonda, balanceSaldo, montoTotalApostado, cantidadDeApuestas, mesa, mecanismo);
            this.vista.pausarRuleta();
            
        } else {
            bandera = true;
            this.vista.reanudarRuleta();
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
        usuarioCrupier.setLogueado(false);
        vista.salir();
        //ver a que pantalla va
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
    
    public void agregarRonda(int numeroDeRonda, int balanceSaldo,/* int numeroSorteado,*/ int montoTotalApostado, int cantidadDeApuestas, Mesa mesa, String mecanismo){
           
        Ronda r = new Ronda(numeroDeRonda, balanceSaldo/*, bola*/, mesa, mecanismo, montoTotalApostado);
        
        Fachada.getInstancia().buscarMesa(mesa).agregarRonda(r);
    }
}
