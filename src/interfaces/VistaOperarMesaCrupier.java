/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Bola;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Ronda;
import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public interface VistaOperarMesaCrupier {
    public void mostrarDatos(int saldoMesa, int ronda, int numeroMesa, ArrayList<MecanismoSorteo> efectos);
    public void listarJugadoresConSuSaldo(ArrayList<Jugador> jugadores);
    public void listarRondasConSuInformacion(ArrayList<Ronda> rondas);
    public void ultimosLanzamientos(ArrayList<Integer> ultimosLanzamientos);
    public void ultimoNumeroSorteado(int ultimoNumero);
    public void salir();
    public void pausarRuleta();
    public void reanudarRuleta();
    public void mostrarBola(Bola bolaSorteada);
    public void obtenerCantidadDeApuestasPorRonda(int cantidad);
    public void obtenerMontoApostadoPorRonda(int montoApostado);
  
}
