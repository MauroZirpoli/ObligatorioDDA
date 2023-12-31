
package logica;

import Exceptions.UsuariosExceptions;
import dominio.Crupier;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.Ronda;
import dominio.TipoApuesta;
import java.util.ArrayList;


public class Fachada {
    
    private static Fachada instancia; 
    
    private SistemaUsuario sistemaUsuario;
    private SistemaRuleta sistemaRuleta;
    private SistemaTipoApuesta sistemaTipoApuesta;
    private SistemaMecanismo sistemaMecanismo;
    
    private Fachada() {
        sistemaUsuario = new SistemaUsuario();
        sistemaRuleta = new SistemaRuleta();
        sistemaTipoApuesta = new SistemaTipoApuesta();
        sistemaMecanismo = new SistemaMecanismo();
    }

    public synchronized static Fachada getInstancia() {
        if(instancia == null) {
            instancia =  new Fachada();
        }
        return instancia;
    }
    
    public ArrayList<Mesa> getMesas() {
        return sistemaRuleta.getMesas();
    }
    
    public ArrayList<Mesa> getMesasDisponibles(){
        return sistemaRuleta.getMesasDisponibles();
    }
    
    public ArrayList<Ronda> obtenerRondasDeJugador(Jugador jugador){
        return sistemaRuleta.obtenerRondasDeJugador(jugador);
    }
    
    public ArrayList<Jugador> getJugadores() {
        return sistemaUsuario.getJugadores();
    }
    
    public ArrayList<Crupier> getCrupiers() {
        return sistemaUsuario.getCrupiers();
    }
    
    public ArrayList<TipoApuesta> getTiposApuesta() {
        return sistemaTipoApuesta.getTiposApuesta();
    }
    
    public Jugador loginJugador(int cedula, String password) throws UsuariosExceptions {
        return sistemaUsuario.loginJugador(cedula,password);
    }
    
    public Crupier loginCrupier(int cedula, String password) throws UsuariosExceptions{
        return sistemaUsuario.loginCrupier(cedula,password);
    }
    
    public void agregarJugador(Jugador jugador){
        sistemaUsuario.agregar(jugador);
    }
    
    public void agregarCrupier(Crupier crupier){
        sistemaUsuario.agregar(crupier);
    }

    void agregar(TipoApuesta tipoApuesta1) {
        sistemaTipoApuesta.agregar(tipoApuesta1);
    }

    public ArrayList<MecanismoSorteo> getEfectos() {
        return sistemaMecanismo.getEfectos();
    }
    
    public void agregar(MecanismoSorteo efecto) {
        sistemaMecanismo.agregar(efecto);
    }
    
    public Mesa buscarMesa(Mesa mesa){
        return sistemaRuleta.buscarMesa(mesa);
    }
    
    public boolean agregarJugadorAMesa(Mesa mesa, Jugador jugador) throws UsuariosExceptions{
        return sistemaRuleta.agregarJugadorAMesa(mesa, jugador);
    }

    public void agregarMesa(Mesa mesa) {
        sistemaRuleta.agregarMesa(mesa);
    }
      
}
