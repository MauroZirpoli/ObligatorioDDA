/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Exceptions.UsuariosExceptions;
import dominio.Crupier;
import dominio.Usuario;
import interfaces.VistaLogin;
import logica.Fachada;

/**
 *
 * @author Angela
 */
public class ControladorLoginCrupier extends ControladorLogin{
     public ControladorLoginCrupier(VistaLogin vista) {
        super(vista);
    }

      @Override
    public void loginUsuario(int cedula, String password) {
        try {
            Crupier crupier = Fachada.getInstancia().loginCrupier(cedula, password);
            this.vista.ejecutarLogin(crupier);
        } catch (UsuariosExceptions ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }
}
