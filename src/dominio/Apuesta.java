
package dominio;

import java.util.ArrayList;

public class Apuesta {
    
    private int numeroDeCelda;
    private int valorApostado;
    private int montoTotal;
    private boolean apuestaGanada;
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private TipoApuesta tipoApuesta;
    private Jugador jugador;

    public Apuesta(int numeroDeCelda, int valorApostado, Jugador jugador, TipoApuesta tipoApuesta) {
        this.numeroDeCelda = numeroDeCelda;
        this.valorApostado = valorApostado;
        this.jugador=jugador;
        this.tipoApuesta=tipoApuesta;
    }

    public void agregarFicha(Ficha ficha, TipoApuesta tipoApuesta) {
        this.tipoApuesta=tipoApuesta;
        this.apuestaGanada=false;
        this.jugador=jugador;
        fichas.add(ficha);
        ficha.setApuesta(this);
    }
    
    public void calcularMontoTotal(int cantidad) {
        int montoTotal = 0;
        for (Ficha ficha : fichas) {
            montoTotal += ficha.total(cantidad);
        }
        this.montoTotal = montoTotal;
    }

    public boolean getApuestaGanada() {
        return apuestaGanada;
    }
    
    public int calcularPago() {
        return tipoApuesta.calcularPago(montoTotal);
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public Jugador getJugador() {
        return jugador;
    }
    
    
    /**public int gananciaDeLaApuesta(){
        return montoTotal(/*int cantidad) * tipoApuesta.
    }*/
    
    
}
