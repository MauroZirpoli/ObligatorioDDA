package ui;

import Controladores.ControladorOperarMesaCrupier;
import Controladores.ControladorVentanaMesaJugador;
import componente.PanelRuleta;
import dominio.Jugador;
import dominio.Mesa;
import dominio.Ronda;
import interfaces.VistaVentanaMesaJugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author digregor
 */
public class VentanaMesaJugador extends javax.swing.JFrame implements VistaVentanaMesaJugador{

    private ControladorVentanaMesaJugador controlador;
    private Mesa mesa;
    private Jugador jugador;

    //int apuestaRojo = 0;

    /**
     * Creates new form NewJFrame
     */
    public VentanaMesaJugador(Jugador jugador, Mesa mesa) {
        this.controlador = new ControladorVentanaMesaJugador(this, jugador/*, mesa*/);
        
        this.mesa = mesa;
        this.jugador = jugador;

        initComponents();
        //inhabilitarComponentes();
        inicializar();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r = new componente.PanelRuleta();
        lbPesos = new javax.swing.JLabel();
        txtRonda = new javax.swing.JTextField();
        lbRonda = new javax.swing.JLabel();
        lbRuleta = new javax.swing.JLabel();
        txtRuleta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSaldoJugador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(r, java.awt.BorderLayout.CENTER);

        lbPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/pesos.png"))); // NOI18N
        getContentPane().add(lbPesos, java.awt.BorderLayout.PAGE_START);

        txtRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtRonda, java.awt.BorderLayout.PAGE_END);

        lbRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRonda.setText("Ronda #");
        getContentPane().add(lbRonda, java.awt.BorderLayout.LINE_END);

        lbRuleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRuleta.setText("Ruleta #");
        getContentPane().add(lbRuleta, java.awt.BorderLayout.LINE_START);

        txtRuleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtRuleta, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("$ -");
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        txtSaldoJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSaldoJugador.setForeground(new java.awt.Color(255, 51, 51));
        txtSaldoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(txtSaldoJugador, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Aplicación Jugador");
        getContentPane().add(jLabel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoJugadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbPesos;
    private javax.swing.JLabel lbRonda;
    private javax.swing.JLabel lbRuleta;
    private componente.PanelRuleta r;
    private javax.swing.JTextField txtRonda;
    private javax.swing.JTextField txtRuleta;
    private javax.swing.JTextField txtSaldoJugador;
    // End of variables declaration//GEN-END:variables
    
    private void inicializar() {
        
        
    }
    
    @Override
    public void mostrarDatos(int saldoMesa, int ronda, int numeroMesa) {
    }

    @Override
    public void salir() {
        dispose();
    }
    
    public void abandonar(){
        mesa.eliminarJugador(jugador);
        salir();
    }

    @Override
    public void mostrarInfoRonda(ArrayList<Ronda> rondasDelJugador) {
        
        //private void mostrarTabla(Propietario propietario) {

        DefaultTableModel modeloDefault = new DefaultTableModel() {

            /*@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }*/
        };

        modeloDefault.addColumn("Ronda");
        modeloDefault.addColumn("Total apostado");
        modeloDefault.addColumn("Ganado");
        modeloDefault.addColumn("Perdido");
        modeloDefault.addColumn("Balance");
        jTable1.setModel(modeloDefault);
        
        // Limpia la tabla (borra filas existentes)
        modeloDefault.setRowCount(0);
        
        // Recorre el ArrayList de Rondas y agrega cada objeto como una fila
        for (Ronda ronda : rondasDelJugador) {
            // Crea un array de objetos con los datos de la Ronda
            Object[] fila = {
                ronda.getNumero(), // Reemplaza "getDato1" con el método apropiado para obtener tus datos
                //ronda.montoTotalApostadoEnLaRonda(jugador),
                //ronda.montoTotalPerdidoEnLaRonda(jugador),
                //ronda.montoTotalGanadoEnLaRonda(jugador),
                //ronda.montoBalanceEnLaRonda(jugador),
            };

            // Agrega la fila al modelo de datos de la tabla
            modeloDefault.addRow(fila);
        }

/*public void mostrarInfoRonda(ArrayList<Ronda> rondasDelJugador) {
    // Obtén el modelo de datos de la JTable
    DefaultTableModel modelo = (DefaultTableModel) tablaRondas.getModel();

    // Asegúrate de que el modelo tenga las 5 columnas
    if (modelo.getColumnCount() != 5) {
        // Agrega las 5 columnas al modelo
        modelo.setColumnIdentifiers(new Object[]{"Columna1", "Columna2", "Columna3", "Columna4", "Columna5"});
    }

    // Recorre el ArrayList de Rondas y agrega cada objeto como una fila
    for (Ronda ronda : rondasDelJugador) {
        // Crea un array de objetos con los datos de la Ronda
        Object[] fila = {
            ronda.getDato1(), // Reemplaza "getDato1" con el método apropiado para obtener tus datos
            ronda.getDato2(),
            ronda.getDato3(),
            ronda.getDato4(),
            ronda.getDato5()
        };

        // Agrega la fila al modelo de datos de la tabla
        modelo.addRow(fila);
    }
}
*/
    
        
    }

    @Override
    public void mostrarUltimoNumeroSorteado() {
        int numero = controlador.ultimoNumeroSorteado();
    }

    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Login incorrecto", JOptionPane.ERROR_MESSAGE);
    }


}
