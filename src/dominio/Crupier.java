
package dominio;

public class Crupier extends Usuario{
    
    private Mesa mesaAsignada;
    private boolean logueado;
    
    public Crupier(int cedula, String nombre, String password) {
        super(cedula, nombre, password);
    }

    public Mesa getMesaAsignada() {
        return mesaAsignada;
    }

    public void setMesaAsignada(Mesa mesaAsignada) {
        this.mesaAsignada = mesaAsignada;
    }
    
    public boolean isLogueado(){
        return logueado;
    };

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    
    
    
}
