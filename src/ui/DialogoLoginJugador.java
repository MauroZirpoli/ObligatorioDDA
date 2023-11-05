/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Controladores.ControladorLoginJugador;
import Exceptions.UsuariosExceptions;
import dominio.Jugador;
import dominio.Usuario;
import java.awt.Frame;
import javax.swing.JOptionPane;
import logica.Fachada;

/**
 *
 * @author Mauro
 */
public class DialogoLoginJugador extends DialogoLoginGenerico{
    
    public DialogoLoginJugador(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new ControladorLoginJugador(this));
        this.setTitle("Ingrese sus datos como Jugador");
    }

    /*@Override
    protected Jugador loginJugador(int cedula, String password) {
        
        
        try{
            return Fachada.getInstancia().loginJugador(cedula, password);
        }catch(UsuariosExceptions e){
            //ToDo: Devolverle mensaje de error a la vista.
            
           return null;
        }
    }*/

    @Override
    public void ejecutarLogin(Usuario usu) {
        new UnirseAMesaJugador((java.awt.Frame) this.getParent(), false, (Jugador) usu).setVisible(true);
    }

    @Override
    public void mostrarError(String msj) {
        JOptionPane.showMessageDialog(this, msj, "Login incorrecto", JOptionPane.ERROR_MESSAGE);        
    }

    @Override
    public void salir() {
        this.dispose();
    }
    
}
