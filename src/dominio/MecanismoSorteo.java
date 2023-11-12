package dominio;

import java.util.Random;
import dominio.Ronda;
import interfaces.Renderizable;
import java.util.ArrayList;

public abstract class MecanismoSorteo implements Renderizable{
    private String nombre;

    public MecanismoSorteo(String nombre) {
        this.nombre = nombre;
    }
    
       
    private ArrayList<Ronda> rondas = new ArrayList<>();

    public void agregarRonda(Ronda ronda) {
        rondas.add(ronda);
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }
    
    @Override
    public String getRenderDetail() {
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
