package logica;

import Exceptions.UsuariosExceptions;
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

        for (Mesa m : mesas) {
            if (m.isDisponible()) {
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

    public boolean agregarJugadorAMesa(Mesa mesa, Jugador jugador) throws UsuariosExceptions {

        boolean existe = mesa.jugadorEstaEnMesa(jugador);

        if (!existe) {
            mesa.agregarJugador(jugador);
        } else {
            throw new UsuariosExceptions("El jugador ya participa de esta Mesa.");
        }
        return true;
    }

    void agregarMesa(Mesa mesa) {
        if (mesa != null) {
            mesas.add(mesa);
        }
    }
}
