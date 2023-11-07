/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Jugador;
import dominio.MecanismoSorteo;
import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public interface VistaOperarMesaCrupier {
    public void mostrarDatos(int saldoMesa, int ronda, int numeroMesa, ArrayList<MecanismoSorteo> efectos);
    public void listarJugadoresConSuSaldo(ArrayList<Jugador> jugadores);
    public void ultimosLanzamientos(ArrayList<Integer> ultimosLanzamientos);
    public void salir();
}
