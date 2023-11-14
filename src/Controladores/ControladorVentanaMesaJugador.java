package Controladores;


import Observer.Observable;
import Observer.Observador;
import dominio.Bola;
import dominio.Jugador;
import dominio.Mesa;
import dominio.Ronda;
import dominio.TipoApuesta;
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
        if (((Observable.Evento) evento).equals(Observable.Evento.AGREGAR_JUGADOR)) {
            this.vista.listarJugadoresConSuSaldo(Fachada.getInstancia().buscarMesa(mesaAsignada).getJugadores());
        }
        
    }

    private void inicializarSubs() {
        this.mesaAsignada.subscribir(this);
    }
    
    public void crearApuesta(int universalCellCode, int valorDeApuesta, Jugador jugador, TipoApuesta tipo){
        Ronda ronda = mesaAsignada.getUltimaRonda();
        
        ronda.agregarApuesta(universalCellCode, valorDeApuesta, jugador, tipo);
    }

    public TipoApuesta buscarTipoApuesta(int universalCellCode) {
        ArrayList<TipoApuesta> ta = Fachada.getInstancia().getTiposApuesta();
        
        for(TipoApuesta tipoApuesta : ta){
            if(tipoApuesta.getCodigo() == universalCellCode){
                return tipoApuesta;
            }
        }
        
        return null;
    }

    }
