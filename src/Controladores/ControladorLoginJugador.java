/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Exceptions.UsuariosExceptions;
import dominio.Usuario;
import logica.Fachada;
import ui.VistaLogin;

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
            Usuario usuario = Fachada.getInstancia().loginCrupier(cedula, password);
            this.vista.ejecutarLogin(usuario);
        } catch (UsuariosExceptions ex) {
            //ToDo: Crear mensaje de Exceptions
        }
    }
    
}
