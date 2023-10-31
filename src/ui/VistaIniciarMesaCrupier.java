/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ui;

import dominio.TipoApuesta;
import java.util.ArrayList;

public interface VistaIniciarMesaCrupier {
    
    public void listarTiposDeApuestas(ArrayList<TipoApuesta> tipoApuestas);
    
    public boolean confirmar(String mensaje, String title);

    public void salir();
    
}
