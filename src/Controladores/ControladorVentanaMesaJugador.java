package Controladores;


import Observer.Observable;
import Observer.Observador;
import dominio.Bola;
import dominio.Jugador;
import dominio.Mesa;
import dominio.Ronda;
import interfaces.VistaVentanaMesaJugador;
import java.util.ArrayList;
import logica.Fachada;


public class ControladorVentanaMesaJugador implements Observador{
      
    VistaVentanaMesaJugador vista;
    Jugador usuarioJugador;
    Mesa mesaAsignada;

    public ControladorVentanaMesaJugador(VistaVentanaMesaJugador vista, Jugador usuarioJugador, Mesa mesaAsignada) {
        this.vista = vista;
        this.usuarioJugador = usuarioJugador;
        this.mesaAsignada=mesaAsignada;
        this.inicializarSubs();
    }

    public void obtenerDatos() {
        Ronda ronda = mesaAsignada.getUltimaRonda();
        this.vista.mostrarDatos(ronda);
        
        this.usuarioJugador.getSaldoInicial();
        //traerNumeroDeMesaAsignada
        //numero de ronda de Mesa
        this.usuarioJugador.getNombre();
        
        ArrayList<Ronda> rondasDelJugador = Fachada.getInstancia().obtenerRondasDeJugador(usuarioJugador);
        
    }
    
    public void ultimoNumeroSorteado(Mesa mesa){
        this.vista.mostrarUltimoNumeroSorteado();
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        
        if (((Observable.Evento) evento).equals(Observable.Evento.CARGAR_RONDA)) {
            
            obtenerDatos();
        }
        
    }

    private void inicializarSubs() {
        this.mesaAsignada.subscribir(this);
    }
}
