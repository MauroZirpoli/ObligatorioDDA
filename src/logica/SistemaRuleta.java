
package logica;

import dominio.Jugador;
import dominio.Mesa;
import dominio.Ronda;
import java.util.ArrayList;

class SistemaRuleta {
    
    private ArrayList<Mesa> mesas;


    public SistemaRuleta() {
        mesas = new ArrayList();
        
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }
    
    public ArrayList<Mesa> getMesasDisponibles() {
        ArrayList<Mesa> mesasDisponibles = new ArrayList();
        
        for(Mesa m: mesas){
            if(m.isDisponible()){
                mesasDisponibles.add(m);
            }
        }
        
        return mesasDisponibles;
    }
    
    public ArrayList<Ronda> obtenerRondasDeJugador(Jugador jugador) {
        ArrayList<Ronda> rondasParticipadas = new ArrayList<>();

        for (Mesa mesa : mesas) {
            if (mesa.getJugadores().contains(jugador)) {
                rondasParticipadas.addAll(mesa.getRondas());
            }
        }

        return rondasParticipadas;
    }
    
    public Mesa buscarMesa(Mesa mesa) {
    for (Mesa m : mesas) {
        if (m.equals(mesa)) {
            return m; 
        }
    }
    return null; 
}
    
}
