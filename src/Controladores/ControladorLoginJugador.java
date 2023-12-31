/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Exceptions.UsuariosExceptions;
import dominio.Jugador;
import dominio.Usuario;
import interfaces.VistaLogin;
import logica.Fachada;


/**
 *
 * @author Mauro
 */
public class ControladorLoginJugador extends ControladorLogin{
    
    public ControladorLoginJugador(VistaLogin vista) {
        super(vista);
    }

      @Override
    public void loginUsuario(int cedula, String password) {
        try {
            Jugador jugador = Fachada.getInstancia().loginJugador(cedula, password);
            this.vista.ejecutarLogin(jugador);
        } catch (UsuariosExceptions ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }
    
}
