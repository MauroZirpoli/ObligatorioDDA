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
        this.inicializarSubs();
    }

    public Mesa getMesaAsignada() {
        return mesaAsignada;
    }

    public void obtenerDatos() {
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        //int numeroMesa = mesaAsignada.getNumeroDeMesa();
        int numeroMesa = 1;
        ArrayList<MecanismoSorteo> efectos = Fachada.getInstancia().getEfectos();
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, mesaAsignada.getUltimaRonda().getNumero(), numeroMesa, efectos);
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

                case "Aleatorio Parcial":
                    MecanismoSorteo i = new ModoAleatorioParcial(mecanismo);
                    bolaSorteada = i.sortearBola();
                    break;


                case "Simulador":
                    MecanismoSorteo j = new ModoAleatorioParcial(mecanismo);
                    bolaSorteada = j.sortearBola();
                    break;

                default:
                    break;
            }

            this.vista.pausarRuleta();
            this.vista.mostrarBola(bolaSorteada);
            int bS = balanceSaldo; //calcular este monto.
            this.mesaAsignada.setBalanceSaldo(bS);
            setearRonda(bolaSorteada, montoTotalApostado, mesa, mecanismo);
        } else {
            //esto es pagar
            bandera = true;
            Ronda r = new Ronda();
            this.mesaAsignada.agregarRonda(r);
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

    public void obtenerCantidadApuestasPorRonda() {
        Ronda ultimaRonda = mesaAsignada.getUltimaRonda();
        this.vista.obtenerCantidadDeApuestasPorRonda(ultimaRonda.totalDeApuestas());
    }

    public void montoApostadoDeRonda() {
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

        if (((Observable.Evento) evento).equals(Observable.Evento.BOLA_SETEADA)
                || ((Observable.Evento) evento).equals(Observable.Evento.RONDA_AGREGADA)) {
            obtenerDatos();
            //listarJugadoresConSuSaldo();
            //listarRondasConSuInformacion();
            //ultimosLanzamientos();
            //ultimoNumeroSorteado();
        }
        if (((Observable.Evento) evento).equals(Observable.Evento.APUESTA_AGREGADA)) {
            montoApostadoDeRonda();
            obtenerCantidadApuestasPorRonda();
        }
    }

    public void setearRonda(Bola bola, int montoTotalApostado, Mesa mesa, String mecanismo) {
        Ronda ultimaRonda = mesa.getUltimaRonda();
        ultimaRonda.setBola(bola);
        ultimaRonda.setMontoTotalApostado(montoTotalApostado);
        ultimaRonda.setMesa(mesa);
        ultimaRonda.setMecanismoSorteo(mecanismo);
    }

    private void inicializarSubs() {
        this.mesaAsignada.subscribir(this);
        for (Ronda r : this.mesaAsignada.getRondas()) {
            r.subscribir(this);
        }
    }

}
