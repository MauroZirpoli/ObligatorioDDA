
package logica;

import java.util.ArrayList;
import dominio.Crupier;
import dominio.Jugador;


public class DatosPrueba {
    
    public static void iniciar() {
        
        Crupier crupier1 = new Crupier(101, "aaa", "Crupier 1", "Mesa 1");
        Crupier crupier2 = new Crupier(102, "bbb", "Crupier 2", "Mesa 2");
        Crupier crupier3 = new Crupier(103, "ccc", "Crupier 3", "Mesa 3");

        Jugador jugador1 = new Jugador(201, "aaa", "Jugador 1", 1000);
        Jugador jugador2 = new Jugador(202, "bbb", "Jugador 2", 500);
        Jugador jugador3 = new Jugador(203, "ccc", "Jugador 3", 100);
        Jugador jugador4 = new Jugador(204, "ddd", "Jugador 4", 50);
        Jugador jugador5 = new Jugador(205, "eee", "Jugador 5", 10);

        ArrayList<Crupier> crupieres = new ArrayList<>();
        crupieres.add(crupier1);
        crupieres.add(crupier2);
        crupieres.add(crupier3);

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
		
    }
    
}
