/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Random;

public class Bola {
    
    private int numero;

    public Bola(int numero) {
        this.numero = numero;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int sortearNumero() {
        Random random = new Random();
        int numeroSorteado = random.nextInt(37);
        setNumero(numeroSorteado);
        return numeroSorteado;
    }
    
}
