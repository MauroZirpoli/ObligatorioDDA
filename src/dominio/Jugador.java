
package dominio;

import java.util.ArrayList;



public class Jugador extends Usuario{
    
    private int saldoInicial;
    private boolean logueado;
    private ArrayList<Apuesta> apuestas;

    public Jugador(int cedula, String nombre, String password, int saldo) {
        super(cedula, nombre, password);
        this.saldoInicial = saldo;
        this.apuestas= new ArrayList();
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    
    

    
    
    
}
