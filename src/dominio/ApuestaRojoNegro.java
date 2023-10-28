
package dominio;


public class ApuestaRojoNegro extends TipoApuesta{

    @Override
    public int calcularPago(int montoTotal) {
        return montoTotal * 2;
    }

    
    
}
