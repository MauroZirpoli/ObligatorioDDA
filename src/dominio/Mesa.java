
package dominio;

import java.util.ArrayList;

public class Mesa {
    
    private ArrayList<Ronda> rondas = new ArrayList<>();
    private ArrayList<Apuesta> apuestas = new ArrayList<>();
    private ArrayList<TipoApuesta> tiposApuesta = new ArrayList<>();
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Crupier crupier;
    private boolean disponible;
    private int balanceSaldo=0;
    private int numeroDeMesa=0;

    public Mesa(ArrayList<Ronda> rondas, ArrayList<Apuesta> apuestas, ArrayList<TipoApuesta> tiposApuesta, ArrayList<Jugador> jugadores, Crupier crupier) {
        this.rondas = rondas;
        this.apuestas = apuestas;
        this.tiposApuesta = tiposApuesta;
        this.jugadores = jugadores;
        this.crupier = crupier;
        this.disponible=false;
        numeroDeMesa++;
    }

    public int getNumeroDeMesa(){
        return numeroDeMesa;
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(ArrayList<Ronda> rondas) {
        this.rondas = rondas;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public ArrayList<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }

    public void setTiposApuesta(ArrayList<TipoApuesta> tiposApuesta) {
        this.tiposApuesta = tiposApuesta;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getBalanceSaldo() {
        return balanceSaldo;
    }
    
    public int cantidadDeApuestas(){
        return apuestas.size();
    };
        
    public int montoTotalDeLasApuestas(){
        int monto=0;
        
        for(Apuesta a: apuestas){
            //monto+= a.montoTotal(cantidad); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
        }
        return monto;
    };
    
    public int montoTotalApuestasPerdidasRecoleccion(){
        int monto=0;
        
        for(Apuesta a: apuestas){
            if(!a.getApuestaGanada()){
                //monto += a.getMontoTotal(); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
            }
        }
        
        return monto;
    }
    
    public int montoTotalApuestasPagadasLiquidacion(){
        int monto=0;
        
        for(Apuesta a: apuestas){
            if(a.getApuestaGanada()){
                //monto += a.getMontoTotal(); //ToDo: Nose como hacer para traerle la cantidad de fichas que se pusieron en cada apuesta
            }
        }
        
        return monto;
    }
    
    
    public int totalDeApuestasPorRonda(){
        int apuestasPorRonda;
        Ronda ronda = rondas.get(rondas.size() - 1);
        apuestasPorRonda = ronda.totalDeApuestas();
        return apuestasPorRonda;
    }
    
    public int ultimoNumeroSorteado(){
        int ultimoNumeroSorteado;
        Ronda ronda = rondas.get(rondas.size() - 1);
        ultimoNumeroSorteado = ronda.getBola().getNumero();
        return ultimoNumeroSorteado;
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
    
    public ArrayList<Integer> ultimosSeisNumerosSorteados(){
        ArrayList<Integer> ultimosNumeros = new ArrayList<>();
        
        int inicio = Math.max(0, rondas.size() - 6);
        
        for(int x = inicio; x < rondas.size(); x++){
            Ronda r = rondas.get(x);
            ultimosNumeros.add(r.getBola().getNumero());
        }
        
        return ultimosNumeros;
    }
}
