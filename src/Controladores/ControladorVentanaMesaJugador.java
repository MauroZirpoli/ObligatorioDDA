package Controladores;


import Observer.Observable;
import Observer.Observador;
import dominio.Jugador;
import dominio.Mesa;
import dominio.Ronda;
import interfaces.VistaVentanaMesaJugador;
import java.util.ArrayList;
import logica.Fachada;


public class ControladorVentanaMesaJugador implements Observador{
      
    VistaVentanaMesaJugador vista;
    Jugador usuarioJugador;
    //Mesa mesaAsignada;

    public ControladorVentanaMesaJugador(VistaVentanaMesaJugador vista, Jugador usuarioJugador/*, Mesa mesaAsignada*/) {
        this.vista = vista;
        this.usuarioJugador = usuarioJugador;
        //this.mesaAsignada=mesaAsignada;
    }

    public void obtenerDatos() {
        
        /*Mesa mesaAsignada = usuarioCrupier.getMesaAsignada();
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        int numeroMesa = mesaAsignada.getNumeroDeMesa();
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, 1, numeroMesa);*/
        
        this.usuarioJugador.getSaldoInicial();
        //traerNumeroDeMesaAsignada
        //numero de ronda de Mesa
        this.usuarioJugador.getNombre();
        
        ArrayList<Ronda> rondasDelJugador = Fachada.getInstancia().obtenerRondasDeJugador(usuarioJugador);
        
    }
    
    public int ultimoNumeroSorteado(Mesa mesa){
        return this.vista.mostrarUltimoNumeroSorteado();
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        
        if (((Observable.Evento) evento).equals(Observable.Evento.CARGAR_RONDA)) {
            
            obtenerDatos();
            ultimoNumeroSorteado();
        }
        
    }
    
    
}
