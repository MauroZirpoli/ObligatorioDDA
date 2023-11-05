
package dominio;


public class ApuestaDocena extends TipoApuesta{

    public ApuestaDocena(String nombre, String casillero, int codigo) {
        super(nombre, casillero, codigo);
    }

 
    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 12;
    }
    
}
