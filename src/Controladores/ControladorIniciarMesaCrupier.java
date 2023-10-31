/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import dominio.Crupier;
import logica.Fachada;
import ui.VistaIniciarMesaCrupier;


public class ControladorIniciarMesaCrupier /*implements Observador*/{
    
    VistaIniciarMesaCrupier vista;
    Crupier usuarioCrupier;

    public ControladorIniciarMesaCrupier(VistaIniciarMesaCrupier vista, Crupier usuarioCrupier) {
        this.vista = vista;
        this.usuarioCrupier = usuarioCrupier;
    }
    
    public void listarTipoApuestas(){
        this.vista.listarTiposDeApuestas(Fachada.getInstancia().getTiposApuesta());
    }
    
    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Iniciar Mesa Crupier")) {
            usuarioCrupier.setLogueado(false);
            vista.salir();
        }
    }
    
}
