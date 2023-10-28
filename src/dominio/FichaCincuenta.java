
package dominio;


public class FichaCincuenta extends Ficha{
    
    public FichaCincuenta() {
        super(50);
    }

    @Override
    public int total(int cantidad) {
        return valor * cantidad;
    }
    
}
