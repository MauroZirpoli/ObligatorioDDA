/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import dominio.Crupier;
import ui.VistaOperarMesaCrupier;

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
    
}
