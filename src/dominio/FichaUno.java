
package dominio;


public class FichaUno extends Ficha{
    
    public FichaUno() {
        super(1);
    }

    @Override
    public int total(int cantidad) {
        return valor * cantidad;
    }
    
}
