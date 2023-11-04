package logica;

import Exceptions.UsuariosExceptions;
import java.util.ArrayList;
import dominio.Crupier;
import dominio.Jugador;

class SistemaUsuario {

    private ArrayList<Jugador> jugadores;
    private ArrayList<Crupier> crupiers;

    public SistemaUsuario() {
        jugadores = new ArrayList();
        crupiers = new ArrayList();
    }

    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregar(Crupier crupier) {
        crupiers.add(crupier);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public ArrayList<Crupier> getCrupiers() {
        return crupiers;
    }

    public Jugador loginJugador(int cedula, String password) throws UsuariosExceptions {
        for (Jugador j : jugadores) {
            if (j.validarCredenciales(cedula, password)) {

                if (j.isLogueado()) {
                    throw new UsuariosExceptions("Acceso denegado. El Usuario ya tiene una sesion activa.");
                }
                j.setLogueado(true);
                return j;
            }
        }
        throw new UsuariosExceptions("Credenciales incorrectas");
    }

    public Crupier loginCrupier(int cedula, String password) throws UsuariosExceptions {

        for (Crupier c : crupiers) {

            if (c.validarCredenciales(cedula, password)) {
                if (c.isLogueado()) {
                    throw new UsuariosExceptions("Acceso denegado. El Usuario ya tiene una sesion activa.");
                }
                c.setLogueado(true);
                return c;
            }
        }
        throw new UsuariosExceptions("Credenciales incorrectas");
    }

}
