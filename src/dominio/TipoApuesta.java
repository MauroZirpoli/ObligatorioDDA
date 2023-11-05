package dominio;

public abstract class TipoApuesta {

    private final String nombre;
    private final String casillero;
    private final int codigo;

    public TipoApuesta(String nombre, String casillero, int codigo) {
        this.nombre = nombre;
        this.casillero = casillero;
        this.codigo = codigo;
    }



    //public abstract double ganancia(int montoTotal);
    public abstract int calcularPago(int montoTotal);

    public String getNombre() {
        return nombre;
    }

    public String getCasillero() {
        return casillero;
    }

    
    public int getCodigo() {
        return codigo;
    }

}
