
package logica;

import Exceptions.UsuariosExceptions;
import dominio.Crupier;
import dominio.Jugador;
import dominio.Mesa;
import dominio.TipoApuesta;
import java.util.ArrayList;


public class Fachada {
    
    private static Fachada instancia; 
    
    private SistemaUsuario sistemaUsuario;
    private SistemaRuleta sistemaRuleta;
    private SistemaTipoApuesta sistemaTipoApuesta;
    
    private Fachada() {
        sistemaUsuario = new SistemaUsuario();
        sistemaRuleta = new SistemaRuleta();
        sistemaTipoApuesta = new SistemaTipoApuesta();
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
    
    public ArrayList<Jugador> getJugadores() {
        return sistemaUsuario.getJugadores();
    }
    
    public ArrayList<Crupier> getCrupiers() {
        return sistemaUsuario.getCrupiers();
    }
    
    public ArrayList<TipoApuesta> getTiposApuesta() {
        return sistemaTipoApuesta.getTiposApuesta();
    }
    
    public Jugador loginJugador(String nombre, String password) throws UsuariosExceptions {
        return sistemaUsuario.loginJugador(nombre,password);
    }
    
    public Crupier loginCrupier(String nombre, String password) throws UsuariosExceptions{
        return sistemaUsuario.loginCrupier(nombre,password);
    }
    
}
