
package logica;

import dominio.ApuestaColores;
import dominio.ApuestaDirecta;
import dominio.ApuestaDocena;
import java.util.ArrayList;
import dominio.Crupier;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.ModoAleatorioCompleto;
import dominio.ModoAleatorioParcial;
import dominio.ModoSimulador;


public class DatosPrueba {
    
    public static void iniciar() {
        
        Crupier crupier1 = new Crupier(101, "Juan", "Crupier 1");
        Crupier crupier2 = new Crupier(102, "Pedro", "Crupier 2");
        Crupier crupier3 = new Crupier(103, "Ana", "Crupier 3");

        Jugador jugador1 = new Jugador(201, "Pablo", "Jugador 1", 1000);
        Jugador jugador2 = new Jugador(202, "Roberto", "Jugador 2", 500);
        Jugador jugador3 = new Jugador(203, "Andres", "Jugador 3", 100);
        Jugador jugador4 = new Jugador(204, "Laura", "Jugador 4", 50);
        Jugador jugador5 = new Jugador(205, "Valeria", "Jugador 5", 10);

        
        Fachada.getInstancia().agregarJugador(jugador1);
        Fachada.getInstancia().agregarJugador(jugador2);
        Fachada.getInstancia().agregarJugador(jugador3);
        Fachada.getInstancia().agregarJugador(jugador4);
        Fachada.getInstancia().agregarJugador(jugador5);

        Fachada.getInstancia().agregarCrupier(crupier1);
        Fachada.getInstancia().agregarCrupier(crupier2);
        Fachada.getInstancia().agregarCrupier(crupier3);
        
        ApuestaColores tipoApuesta1 = new ApuestaColores ("Colores", "Rojo",43);
        ApuestaColores tipoApuesta2 = new ApuestaColores ("Colores", "Negro", 44);
        ApuestaDocena tipoApuesta3 = new ApuestaDocena ("Docena", "Primera Docena",40);
        ApuestaDocena tipoApuesta4 = new ApuestaDocena ("Docena", "Segunda Docena",41);
        ApuestaDocena tipoApuesta5 = new ApuestaDocena ("Docena", "Tercera Docena",42);
        ApuestaDirecta tipoApuesta6 = new ApuestaDirecta ("Directa", "0",0);
        ApuestaDirecta tipoApuesta7 = new ApuestaDirecta ("Directa", "1",1);
        ApuestaDirecta tipoApuesta8 = new ApuestaDirecta ("Directa", "2",2);
        ApuestaDirecta tipoApuesta9 = new ApuestaDirecta ("Directa", "32",32);
        
         Fachada.getInstancia().agregar(tipoApuesta1);
         Fachada.getInstancia().agregar(tipoApuesta2);
         Fachada.getInstancia().agregar(tipoApuesta3);
         Fachada.getInstancia().agregar(tipoApuesta4);
         Fachada.getInstancia().agregar(tipoApuesta5);
         Fachada.getInstancia().agregar(tipoApuesta6);
         Fachada.getInstancia().agregar(tipoApuesta7);
         Fachada.getInstancia().agregar(tipoApuesta8);
         Fachada.getInstancia().agregar(tipoApuesta9);
        
	MecanismoSorteo aleatorioCompl = new ModoAleatorioCompleto ("Aleatorio Completo");
        MecanismoSorteo aleatorioParcial = new ModoAleatorioParcial ("Aleatorio Parcial");
        MecanismoSorteo simulador = new ModoSimulador ("Simulador");
        
        Fachada.getInstancia().agregar(aleatorioCompl);
        Fachada.getInstancia().agregar(aleatorioParcial);
        Fachada.getInstancia().agregar(simulador);
        
        //Mesa mesa = new Mesa (crupier1);
        //crupier1.setMesaAsignada(mesa);
        
        //Fachada.getInstancia().agregarMesa(mesa);
        
    }
    
}
