/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Mesa;
import java.util.ArrayList;


public interface VistaUnirseAMesaJugador {
    
    public void listarMesasDisponibles(ArrayList<Mesa> mesasDisponibles);
    
    public boolean confirmar(String mensaje, String title);

    public void salir();
    
}
