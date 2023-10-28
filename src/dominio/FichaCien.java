
package dominio;


public class FichaCien extends Ficha {
    
    public FichaCien() {
        super(100);
    }

    @Override
    public int total(int cantidad) {
       return valor * cantidad;
    }
    
}
