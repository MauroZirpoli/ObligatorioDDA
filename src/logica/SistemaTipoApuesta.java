
package logica;

import dominio.TipoApuesta;

import java.util.ArrayList;


class SistemaTipoApuesta {
    
    private ArrayList<TipoApuesta> tiposApuesta;


    public SistemaTipoApuesta() {
        tiposApuesta = new ArrayList();
        
    }
    
    public void agregar(TipoApuesta tipoApuesta) {
        tiposApuesta.add(tipoApuesta);
    }


    public ArrayList<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }
    
}
