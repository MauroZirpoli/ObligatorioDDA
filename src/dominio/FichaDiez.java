
package dominio;

public class FichaDiez extends Ficha{
    
    public FichaDiez() {
        super(10);
    }

    @Override
    public int total(int cantidad) {
        return valor * cantidad;
    }
    
}
