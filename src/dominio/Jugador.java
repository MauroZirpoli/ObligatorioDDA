
package dominio;


public class Jugador {
    
    private int cedula;
    private String contraseña;
    private String nombreCompleto;
    private double saldoInicial;
    private boolean logueado;

    public Jugador(int cedula, String contraseña, String nombreCompleto, double saldoInicial) {
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.saldoInicial = saldoInicial;
    }

    public int getCedula() {
        return cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    
    
    
}
