package ui;

import Controladores.ControladorOperarMesaCrupier;
import Controladores.ControladorVentanaMesaJugador;
import componente.PanelRuleta;
import dominio.Ronda;
import interfaces.VistaVentanaMesaJugador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author digregor
 */
public class VentanaMesaJugador extends javax.swing.JFrame implements VistaVentanaMesaJugador{

    private ControladorVentanaMesaJugador controlador;
    //int apuestaRojo = 0;

    /**
     * Creates new form NewJFrame
     */
    public VentanaMesaJugador() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/pesos.png"))); // NOI18N

        txtRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRonda.setText("Ronda #");

        lbRuleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRuleta.setText("Ruleta #");

        txtRuleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("$ -");

        txtSaldoJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSaldoJugador.setForeground(new java.awt.Color(255, 51, 51));
        txtSaldoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoJugadorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Aplicación Jugador");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(r, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
                        .addContainerGap())))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(695, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPesos)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSaldoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoJugadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
                ronda.montoTotalApostadoEnLaRonda(jugador),
                ronda.montoTotalPerdidoEnLaRonda(jugador),
                ronda.montoTotalGanadoEnLaRonda(jugador),
                ronda.montoBalanceEnLaRonda(jugador),
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


}
