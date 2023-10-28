
package dominio;

public class Crupier {
    
    private int cedula;
    private String contraseña;
    private String nombreCompleto;
    private String mesaAsignada;
    private boolean logueado;

    public Crupier(int cedula, String contraseña, String nombreCompleto, String mesaAsignada) {
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.mesaAsignada = mesaAsignada;
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

    public String getMesaAsignada() {
        return mesaAsignada;
    }
    
    public boolean isLogueado(){
        return logueado;
    };

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    
    
    
}
