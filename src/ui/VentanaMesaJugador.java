package ui;

import interfaces.VistaOperarMesaCrupier;
import Controladores.ControladorOperarMesaCrupier;
import Controladores.ControladorVentanaMesaJugador;
import componente.PanelRuleta;
import dominio.Crupier;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.Ronda;
import dominio.TipoApuesta;
import interfaces.Renderizable;
import interfaces.VistaVentanaMesaJugador;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author digregor
 */
public class VentanaMesaJugador extends javax.swing.JFrame implements VistaVentanaMesaJugador {

    private ControladorVentanaMesaJugador controlador;
    private Mesa mesa;
    private Jugador jugador;
    int apuestaRojo = 0;

    /**
     * Creates new form NewJFrame
     */
     public VentanaMesaJugador(Jugador jugador, Mesa mesa) {
        this.controlador = new ControladorVentanaMesaJugador(this, jugador, mesa);
        
        this.mesa = mesa;
        this.jugador = jugador;

        initComponents();
        //inhabilitarComponentes();
        inicializar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r = new componente.PanelRuleta();
        jLabel1 = new javax.swing.JLabel();
        txtSaldoJugador = new javax.swing.JTextField();
        lbPesos = new javax.swing.JLabel();
        txtRonda = new javax.swing.JTextField();
        lbRonda = new javax.swing.JLabel();
        lbRuleta = new javax.swing.JLabel();
        lbPesos2 = new javax.swing.JLabel();
        txtRuleta = new javax.swing.JTextField();
        btnAbandonar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla2 = new javax.swing.JTable();
        txtUltimoNumeroSorteado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("$ -");

        txtSaldoJugador.setEditable(false);
        txtSaldoJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSaldoJugador.setForeground(new java.awt.Color(255, 51, 51));
        txtSaldoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoJugadorActionPerformed(evt);
            }
        });

        lbPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/pesos.png"))); // NOI18N

        txtRonda.setEditable(false);
        txtRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRondaActionPerformed(evt);
            }
        });

        lbRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRonda.setText("Ronda #");

        lbRuleta.setText("Ruleta #");

        lbPesos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/ruleta.png"))); // NOI18N

        txtRuleta.setEditable(false);

        btnAbandonar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbandonar.setText("Abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Aplicación Jugador");

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Total Apostado", "Ganado", "Perdido", "Balance"
            }
        ));
        jTabla1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTabla1);

        jTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Valor", "Ocurrencia"
            }
        ));
        jScrollPane2.setViewportView(jTabla2);

        txtUltimoNumeroSorteado.setEditable(false);
        txtUltimoNumeroSorteado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltimoNumeroSorteadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Último número sorteado");

        jButton1.setText("Limpiar apuestas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar 10 a la apuesta del rojo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setText("50");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Apostar en seleccion");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Jugador");

        txtNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbandonar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(lbPesos2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreJugador))
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(txtUltimoNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPesos))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSaldoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbPesos2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUltimoNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2)))
                    .addComponent(btnAbandonar))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoJugadorActionPerformed

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        abandonar();
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        r.limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        apuestaRojo += 10;
        r.setApuesta(PanelRuleta.ROJO, apuestaRojo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            r.agregar(new PanelRuleta.Escuchador() {
                @Override
                public void celdaSeleccionada(int universalCellCode) {
                    int apuesta = Integer.valueOf(jTextField1.getText());
                    System.out.println("Id de celda seleccionada: " + universalCellCode + ". Apuesta anterior: " + r.getApuesta(universalCellCode) + ". Apuesta nueva:" + apuesta);
                    r.setApuesta(universalCellCode, apuesta);
                    TipoApuesta ta = controlador.buscarTipoApuesta(universalCellCode);
                    controlador.crearApuesta(universalCellCode,apuesta, jugador, ta);
                }
            });
        } else {
            r.eliminarEscuchadores();
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void txtRondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRondaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRondaActionPerformed

    private void txtUltimoNumeroSorteadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltimoNumeroSorteadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUltimoNumeroSorteadoActionPerformed

    private void txtNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreJugadorActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTable jTabla2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbPesos;
    private javax.swing.JLabel lbPesos2;
    private javax.swing.JLabel lbRonda;
    private javax.swing.JLabel lbRuleta;
    private componente.PanelRuleta r;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtRonda;
    private javax.swing.JTextField txtRuleta;
    private javax.swing.JTextField txtSaldoJugador;
    private javax.swing.JTextField txtUltimoNumeroSorteado;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        txtSaldoJugador.setText(String.valueOf(jugador.getSaldoInicial()));
        txtNombreJugador.setText(jugador.getNombre());
        controlador.obtenerDatos();
        
    }
    
    @Override
    public void mostrarDatos(Ronda ronda) {
        if (ronda.getBola() != null ){
           txtUltimoNumeroSorteado.setText(ronda.getBola().getNumero()+ "");
        } else {
            txtUltimoNumeroSorteado.setText( "-");
        }
        txtRonda.setText(ronda.getNumero()+ "");
        txtRuleta.setText(this.mesa.getNumeroDeMesa()+ ""); 
    }

    @Override
    public void salir() {
        dispose();
    }
    
    public void abandonar(){
        mesa.eliminarJugador(jugador);
        salir();
        
        //actualizar mesas disponibles en la lista o fijarse si cuando 
        //se cierra la mesa, se sale de la lista
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
        jTabla1.setModel(modeloDefault);
        
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
        //int numero = controlador.ultimoNumeroSorteado();
    }

    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Login incorrecto", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void listarJugadoresConSuSaldo(ArrayList<Jugador> jugadoresDeLaMesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
