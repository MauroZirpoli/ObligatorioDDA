
package dominio;


public class ApuestaDirecta extends TipoApuesta{
    
    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 36;
    }
    
}
