package dominio;
import java.util.Random;
import java.util.ArrayList;


import java.util.Random;

public class ModoAleatorioParcial extends MecanismoSorteo{
    
    private ArrayList<Integer> numerosSorteados = new ArrayList<>();

    public ModoAleatorioParcial(String nombre) {
        super(nombre);
    }

    public Bola sortearBola() {
        Random random = new Random();
        int numero;
        do {
            numero = random.nextInt(100);
        } while (numerosSorteados.contains(numero));

        numerosSorteados.add(numero);

        if (numerosSorteados.size() > 3) {
            numerosSorteados.remove(0); // Elimina los números más antiguos
        }

        return new Bola(numero);
    }
}
