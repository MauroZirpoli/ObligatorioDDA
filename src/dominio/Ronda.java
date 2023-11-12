
package dominio;

import java.util.ArrayList;

public class Ronda {
    private int numero=0;
    private Bola bola;
    private Mesa mesa;
    private ArrayList<Apuesta> apuestas;
    private String mecanismoSorteo;
    private int balanceSaldo=0;
    private int montoTotalApostado;

    public Ronda(int numeroRonda, /*Bola bola,*/ int balanceSaldo,Mesa mesa,  String mecanismoSorteo, int montoTotalApostado) {
        this.numero = numeroRonda;
        this.balanceSaldo=balanceSaldo;
        //this.bola=bola;
        this.mesa = mesa;
        this.apuestas = apuestas;
        this.mecanismoSorteo = mecanismoSorteo;

        this.montoTotalApostado=montoTotalApostado;
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

    public int getMontoTotalApostado() {
        return montoTotalApostado;
    }

    public void setMontoTotalApostado(int montoTotalApostado) {
        this.montoTotalApostado = montoTotalApostado;
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

    public String getMecanismoSorteo() {
        return mecanismoSorteo;
    }

    public void setMecanismoSorteo(String mecanismoSorteo) {
        this.mecanismoSorteo = mecanismoSorteo;
    }

    public int getBalanceSaldo() {
        return balanceSaldo;
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
    
    //Para Mesa de Crupier:
    
    public int montoTotalDeLasApuestas() {
        int monto = 0;

        for (Apuesta a : apuestas) {
            //monto+= a.montoTotal(cantidad); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
        }
        return monto;
    };
    
    public int montoTotalApuestasPerdidasRecoleccion() {
        int monto = 0;

        for (Apuesta a : apuestas) {
            if (!a.getApuestaGanada()) {
                //monto += a.getMontoTotal(); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
            }
        }

        return monto;
    }

    public int montoTotalApuestasPagadasLiquidacion() {
        int monto = 0;

        for (Apuesta a : apuestas) {
            if (a.getApuestaGanada()) {
                //monto += a.getMontoTotal(); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
            }
        }

        return monto;
    }
    
    public void calcularBalanceSaldo() {
        for (Apuesta a : apuestas) {
            if (a.getApuestaGanada()) {
                balanceSaldo += a.calcularPago();
            } else {
                balanceSaldo -= a.getMontoTotal();
            }
        }
    }
}

