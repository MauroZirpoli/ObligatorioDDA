/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Exceptions.UsuariosExceptions;
import dominio.Crupier;
import java.awt.Frame;
import logica.Fachada;

/**
 *
 * @author Mauro
 */
public class DialogoLoginCrupier extends LoginCrupier{

    public DialogoLoginCrupier(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Este es el Login Crupier");
    }

    @Override
    protected Crupier loginCrupier(String nombreUsuario, String password) {
        try{
            return Fachada.getInstancia().loginCrupier(nombreUsuario, password);
        }catch(UsuariosExceptions e){
            //ToDo: Devolverle mensaje de error a la vista.
            
           return null;
        }
    }

    @Override
    protected void ejecutarCasoUsoInicial(Crupier crupier) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
