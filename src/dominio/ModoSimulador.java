package dominio;

import java.util.Random;
import java.util.ArrayList;
import dominio.Bola;

public class ModoSimulador extends MecanismoSorteo {
    
    
    /*private ArrayList<Integer> numerosApuestaDirecta;

    public ModoSimulador(ArrayList<Integer> numerosApuestaDirecta) {
        this.numerosApuestaDirecta = numerosApuestaDirecta;
    }*/

    @Override
    public Bola sortearBola() {
        int numero = 0;
        /*Random random = new Random();
        int index = random.nextInt(numerosApuestaDirecta.size() + 1);
        int numero;
        if (index == numerosApuestaDirecta.size()) {
            numero = 0; // El cero
        } else {
            numero = numerosApuestaDirecta.get(index);
        }*/
        return new Bola(numero);
    }

    public ModoSimulador(String nombre) {
        super(nombre);
    }
    
    
    /*private ArrayList<Integer> numerosApuestaDirecta;

    public ModoSimulador(ArrayList<Integer> numerosApuestaDirecta) {
        this.numerosApuestaDirecta = numerosApuestaDirecta;
    }

    public Bola sortearBola() {
        Random random = new Random();
        int index = random.nextInt(numerosApuestaDirecta.size() + 1);
        int numero;
        if (index == numerosApuestaDirecta.size()) {
            numero = 0; // El cero
        } else {
            numero = numerosApuestaDirecta.get(index);
        }
        return new Bola(numero);
    }*/

   
}
