
package dominio;


public class Jugador extends Usuario{
    
    private int saldoInicial;
    private boolean logueado;

    public Jugador(int cedula, String nombre, String password, int saldo) {
        super(cedula, nombre, password);
        this.saldoInicial = saldo;
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
