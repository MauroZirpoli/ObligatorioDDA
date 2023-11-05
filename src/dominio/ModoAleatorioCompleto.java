package dominio;

import java.util.Random;


public class ModoAleatorioCompleto extends MecanismoSorteo{

    public ModoAleatorioCompleto(String nombre) {
        super(nombre);
    }
    
    public Bola sortearBola() {
        Random random = new Random();
        int numero = random.nextInt(100); // Valor aleatorio en cada ronda
        return new Bola(numero);
    }

    
    
}
