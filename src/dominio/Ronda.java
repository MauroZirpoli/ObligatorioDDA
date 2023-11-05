
package dominio;

import java.util.ArrayList;

public class Ronda {
    private int numero=0;
    private Bola bola;
    private Mesa mesa;
    private ArrayList<Apuesta> apuestas;
    private MecanismoSorteo mecanismoSorteo;

    public Ronda(int numero, Bola bola, Mesa mesa, ArrayList<Apuesta> apuestas, MecanismoSorteo mecanismoSorteo) {
        //this.numero = numero;
        this.bola = bola;
        this.mesa = mesa;
        this.apuestas = apuestas;
        this.mecanismoSorteo = mecanismoSorteo;
        numero++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Bola getBola() {
        return bola;
    }

    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public MecanismoSorteo getMecanismoSorteo() {
        return mecanismoSorteo;
    }

    public void setMecanismoSorteo(MecanismoSorteo mecanismoSorteo) {
        this.mecanismoSorteo = mecanismoSorteo;
    }
    
    public int totalDeApuestas(){
        return apuestas.size();
    };
    
    public int montoTotalApostadoEnLaRonda(Jugador jugador){
        
        int montoTotal=0;
        
        for(Apuesta a: apuestas){
            
           if(a.getJugador().equals(jugador)){
               montoTotal+= a.getMontoTotal();
                       
           } 
        
        }
        return montoTotal;
    }
    
    public int montoTotalPerdidoEnLaRonda(Jugador jugador){
        
        int montoTotal=0;
        
        for(Apuesta a: apuestas){
            
           if(a.getJugador().equals(jugador) && !a.getApuestaGanada()){
               montoTotal+= a.getMontoTotal();
                       
           } 
        
        }
        return montoTotal;
    }
    
    public int montoTotalGanadoEnLaRonda(Jugador jugador){
        
        int montoTotal=0;
        
        for(Apuesta a: apuestas){
            
           if(a.getJugador().equals(jugador) && a.getApuestaGanada()){
               montoTotal+= a.getMontoTotal();
                       
           } 
        
        }
        return montoTotal;
    }
    
    public int montoBalanceEnLaRonda(Jugador jugador){
        return montoTotalGanadoEnLaRonda(jugador) - montoTotalPerdidoEnLaRonda(jugador);
    }
}

