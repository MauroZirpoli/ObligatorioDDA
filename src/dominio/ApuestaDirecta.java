
package dominio;


public class ApuestaDirecta extends TipoApuesta{

    public ApuestaDirecta(String nombre, String casillero, int codigo) {
        super(nombre, casillero, codigo);
    }
    
    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 36;
    }
    
}
