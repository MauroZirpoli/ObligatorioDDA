
package dominio;

public class Crupier extends Usuario{
    
    private String mesaAsignada;
    private boolean logueado;
    
    public Crupier(int cedula, String nombre, String password) {
        super(cedula, nombre, password);
    }

    public String getMesaAsignada() {
        return mesaAsignada;
    }

    public void setMesaAsignada(String mesaAsignada) {
        this.mesaAsignada = mesaAsignada;
    }
    
    public boolean isLogueado(){
        return logueado;
    };

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    
    
    
}
