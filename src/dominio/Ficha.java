
package dominio;

public abstract class Ficha {
    protected int valor;
    private Apuesta apuesta;

    public Ficha(int valor) {
        this.valor = valor;
    }

    public abstract int total(int cantidad);

    public Apuesta getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }
}
