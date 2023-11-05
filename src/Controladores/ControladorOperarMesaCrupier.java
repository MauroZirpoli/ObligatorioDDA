/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import dominio.Crupier;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import interfaces.VistaOperarMesaCrupier;
import java.util.ArrayList;
import logica.Fachada;


/**
 *
 * @author Mauro
 */
public class ControladorOperarMesaCrupier /*implements Observador*/{
    
    VistaOperarMesaCrupier vista;
    Crupier usuarioCrupier;

    public ControladorOperarMesaCrupier(VistaOperarMesaCrupier vista, Crupier usuarioCrupier) {
        this.vista = vista;
        this.usuarioCrupier = usuarioCrupier;
    }
    
  

    public void obtenerDatos() {
        Mesa mesaAsignada = usuarioCrupier.getMesaAsignada();
        int saldoMesa = mesaAsignada.getBalanceSaldo();
        int numeroMesa = mesaAsignada.getNumeroDeMesa();
        ArrayList <MecanismoSorteo> efectos = Fachada.getInstancia().getEfectos();
        //int ronda = ronda.getnumero();
        this.vista.mostrarDatos(saldoMesa, 1, numeroMesa, efectos);
        
    }
    
}
