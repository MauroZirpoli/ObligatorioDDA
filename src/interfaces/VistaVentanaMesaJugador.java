/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Ronda;
import java.util.ArrayList;


public interface VistaVentanaMesaJugador {
    
    public void mostrarDatos(int saldoMesa, int ronda, int numeroMesa);
    public void mostrarInfoRonda(ArrayList<Ronda> rondasDelJugador);
    public void ultimoNumeroSorteado(int ultimoNumero);
    public void salir();
    
}
