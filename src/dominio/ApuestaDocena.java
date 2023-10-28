
package dominio;


public class ApuestaDocena extends TipoApuesta{

    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 12;
    }
    
}
