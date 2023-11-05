
package dominio;


public class ApuestaColores extends TipoApuesta{

    public ApuestaColores(String nombre, String casillero, int codigo) {
        super(nombre, casillero, codigo);
    }

    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 2;
    }

    
    
}
