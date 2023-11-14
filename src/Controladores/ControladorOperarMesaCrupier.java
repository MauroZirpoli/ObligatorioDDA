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
import dominio.ModoAleatorioCompleto;
import dominio.ModoAleatorioParcial;

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

        int ronda = 0;
    public void obtenerDatos() {
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        //int numeroMesa = mesaAsignada.getNumeroDeMesa();
        int numeroMesa=1;
        ArrayList<MecanismoSorteo> efectos = Fachada.getInstancia().getEfectos();
        ronda++;
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, ronda, numeroMesa, efectos);
    }

    boolean bandera = true;
    Bola bolaSorteada;

    public void lanzarPagar(int numeroDeRonda, int balanceSaldo,/* int numeroSorteado,*/ int montoTotalApostado, int cantidadDeApuestas, Mesa mesa, String mecanismo) {
        if (bandera) {
            bandera = false;
            switch (mecanismo) {
                case "Aleatorio Completo":
                    MecanismoSorteo h = new ModoAleatorioCompleto(mecanismo);
                    bolaSorteada = h.sortearBola();
                    break;
                    //Fachada.getInstancia().sortearBolaCompleta();
                case "Aleatorio Parcial":
                    MecanismoSorteo i = new ModoAleatorioParcial(mecanismo);
                    bolaSorteada = i.sortearBola();
                    break;
                    //Fachada.getInstancia().sortearBola();
                case "Simulador":
                    MecanismoSorteo j = new ModoAleatorioParcial(mecanismo);
                    bolaSorteada = j.sortearBola();
                    break;
                    //Fachada.getInstancia().sortearBolaSimulador();
                default:
                    break;
            }
            this.vista.mostrarBola(bolaSorteada);
            agregarRonda(numeroDeRonda, balanceSaldo, bolaSorteada, montoTotalApostado, cantidadDeApuestas, mesa, mecanismo);
            this.vista.pausarRuleta();
        } else {
            bandera = true;
            this.vista.reanudarRuleta();
        }
    }

    public void listarJugadoresConSuSaldo() {
        this.vista.listarJugadoresConSuSaldo(Fachada.getInstancia().buscarMesa(mesaAsignada).getJugadores());
    }

    public void listarRondasConSuInformacion() {
        this.vista.listarRondasConSuInformacion(Fachada.getInstancia().buscarMesa(mesaAsignada).getRondas());
    }

    public void ultimosLanzamientos() {
        this.vista.ultimosLanzamientos(Fachada.getInstancia().buscarMesa(mesaAsignada).ultimosSeisNumerosSorteados());
    }

    public void ultimoNumeroSorteado() {
        this.vista.ultimoNumeroSorteado(mesaAsignada.ultimoNumeroSorteado());
    }
    
    public void obtenerCantidadApuestasPorRonda(){
        
        Ronda ultimaRonda = mesaAsignada.getUltimaRonda();
        this.vista.obtenerCantidadDeApuestasPorRonda(ultimaRonda.totalDeApuestas());
    }
    
    public void montoApostadoDeRonda(){
        Ronda ultimaRonda = mesaAsignada.getUltimaRonda();
        this.vista.obtenerMontoApostadoPorRonda(ultimaRonda.getMontoTotalApostado());
    }

    public void cerrarMesa() {
         //liquidar mesa (pagar)
        // desloguear jug
        usuarioCrupier.setLogueado(false);
        mesaAsignada.setDisponible(false);
        this.vista.salir();
        //ver a que pantalla va
    }

    @Override
    public void notificar(Observable origen, Object evento) {

        if (((Observable.Evento) evento).equals(Observable.Evento.CARGAR_RONDA)) {

            obtenerDatos();
            //listarJugadoresConSuSaldo();
            //listarRondasConSuInformacion();
            //ultimosLanzamientos();
            //ultimoNumeroSorteado();
        }
    }

    public void agregarRonda(int numeroDeRonda, int balanceSaldo, Bola bola, int montoTotalApostado, int cantidadDeApuestas, Mesa mesa, String mecanismo) {

        Ronda r = new Ronda(numeroDeRonda, balanceSaldo, bola, mesa, mecanismo, montoTotalApostado);

        mesa.agregarRonda(r);
    }
   
}
