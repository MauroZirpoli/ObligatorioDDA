
package dominio;

import Observer.Observable;
import java.util.ArrayList;

public class Ronda extends Observable {
    private static int contador = 0;
    private int numero;
    private Bola bola;
    private Mesa mesa;
    private ArrayList<Apuesta> apuestas;
    private String mecanismoSorteo;
    private int montoTotalApostado;

   /* public Ronda(int numeroRonda,  int balanceSaldo,Bola bola, Mesa mesa,  String mecanismoSorteo, int montoTotalApostado) {
        this.numero = numeroRonda;
        this.balanceSaldo=balanceSaldo;
        this.bola=bola;
        this.mesa = mesa;
        //No existe un parametro apuestas que se pase cómo para hacer esta asignación
        this.apuestas = apuestas;
        this.mecanismoSorteo = mecanismoSorteo;

        this.montoTotalApostado=montoTotalApostado;
        numero++;
    }*/

    public Ronda() {
        this.numero = ++contador;
        this.apuestas = new ArrayList();
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
        this.notificar(Evento.BOLA_SETEADA);
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
    
    public int montoTotalPerdidoEnLaRonda(){
        
        int montoTotal=0;
        
        for(Apuesta a: apuestas){
            
           if(!a.getApuestaGanada()){
               montoTotal+= a.getMontoTotal();
                       
           } 
        
        }
        return montoTotal;
    }
    
    public int montoTotalGanadoEnLaRonda(){
        
        int montoTotal=0;
        
        for(Apuesta a: apuestas){
            
           if(a.getApuestaGanada()){
               montoTotal+= a.getMontoTotal();
                       
           } 
        
        }
        return montoTotal;
    }
    
    public int montoBalanceEnLaRonda(){
        return montoTotalGanadoEnLaRonda() - montoTotalPerdidoEnLaRonda();
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
    
    /*public void calcularBalanceSaldo() {
        for (Apuesta a : apuestas) {
            if (a.getApuestaGanada()) {
                balanceSaldo += a.calcularPago();
            } else {
                balanceSaldo -= a.getMontoTotal();
            }
        }
    }*/
    
    public void agregarJugador(Apuesta a) {
        if (a != null) {
            this.apuestas.add(a);
        }
    }

    public void agregarApuesta(int universalCellCode, int valorDeApuesta, Jugador jugador, TipoApuesta tipo) {
        Apuesta apuesta = new Apuesta(universalCellCode, valorDeApuesta, jugador, tipo );
        this.apuestas.add(apuesta);
        this.notificar(Observable.Evento.APUESTA_AGREGADA);
    }
}

