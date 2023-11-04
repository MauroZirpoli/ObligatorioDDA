package demo;

import logica.DatosPrueba;
import ui.InicioVentana;

public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosPrueba.iniciar();
        new InicioVentana().setVisible(true);
    }

}
