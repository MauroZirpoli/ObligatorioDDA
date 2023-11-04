/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Usuario;

/**
 *
 * @author Angela
 */
public interface VistaLogin {
    public void mostrarError (String msj);
    public void salir();
    public void ejecutarLogin (Usuario usuario);
}
