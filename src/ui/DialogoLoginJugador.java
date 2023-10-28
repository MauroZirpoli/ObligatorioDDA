/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Exceptions.UsuariosExceptions;
import dominio.Jugador;
import java.awt.Frame;
import logica.Fachada;

/**
 *
 * @author Mauro
 */
public class DialogoLoginJugador extends LoginJugador{
    
    public DialogoLoginJugador(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese suss de Usuario agenda credenciales de Usuario agenda");
    }

    @Override
    protected Jugador loginJugador(String nombreUsuario, String password) {
        
        
        try{
            return Fachada.getInstancia().loginJugador(nombreUsuario, password);
        }catch(UsuariosExceptions e){
            //ToDo: Devolverle mensaje de error a la vista.
            
           return null;
        }
    }

    @Override
    protected void ejecutarCasoUsoInicial(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
