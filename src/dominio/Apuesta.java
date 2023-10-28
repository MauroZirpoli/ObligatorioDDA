
package dominio;

import java.util.ArrayList;

public class Apuesta {
    
    private int montoTotal;
    private boolean apuestaGanada;
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private TipoApuesta tipoApuesta;

    public void agregarFicha(Ficha ficha, TipoApuesta tipoApuesta) {
        this.tipoApuesta=tipoApuesta;
        this.apuestaGanada=false;
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
    
    
    
    /**public int gananciaDeLaApuesta(){
        return montoTotal(/*int cantidad) * tipoApuesta.
    }*/
    

}
