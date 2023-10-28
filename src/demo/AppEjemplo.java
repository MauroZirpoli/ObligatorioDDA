
package demo;

import logica.DatosPrueba;

public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       DatosPrueba.iniciar();
       new VentanaMesa().setVisible(true);

    }
    
}
