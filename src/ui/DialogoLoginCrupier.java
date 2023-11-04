/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Controladores.ControladorLoginCrupier;
import Exceptions.UsuariosExceptions;
import dominio.Crupier;
import dominio.Jugador;
import dominio.Usuario;
import java.awt.Frame;
import logica.Fachada;

/**
 *
 * @author Mauro
 */
public class DialogoLoginCrupier extends DialogoLoginGenerico{

    public DialogoLoginCrupier(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new ControladorLoginCrupier(this));
        this.setTitle("Ingresa datos de Crupier");
    }

    /*@Override
    protected Crupier loginCrupier(int cedula, String password) {
        try{
            return Fachada.getInstancia().loginCrupier(cedula, password);
        }catch(UsuariosExceptions e){
            //ToDo: Devolverle mensaje de error a la vista.
            
           return null;
        }
    }*/

    @Override
    public void ejecutarLogin(Usuario usu) {
        new IniciarMesaCrupier((java.awt.Frame) this.getParent(), false, (Crupier) usu).setVisible(true);
    }

    @Override
    public void mostrarError(String msj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
