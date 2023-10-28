
package dominio;

public class FichaCinco extends Ficha {
    
    public FichaCinco() {
        super(5);
    }

    @Override
    public int total(int cantidad) {
        return valor * cantidad;
    }

    
}
