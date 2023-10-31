
package logica;

import dominio.Mesa;
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
    
    
    
}
