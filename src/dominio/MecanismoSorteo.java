package dominio;

import java.util.Random;
import dominio.Ronda;
import java.util.ArrayList;

public abstract class MecanismoSorteo {
    
    private ArrayList<Ronda> rondas = new ArrayList<>();

    public void agregarRonda(Ronda ronda) {
        rondas.add(ronda);
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }
    
}