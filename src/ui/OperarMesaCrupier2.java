package ui;

import interfaces.VistaOperarMesaCrupier;
import Controladores.ControladorOperarMesaCrupier;
import componente.PanelRuleta;
import dominio.Crupier;
import dominio.Jugador;
import dominio.MecanismoSorteo;
import dominio.Mesa;
import dominio.Ronda;
import dominio.TipoApuesta;
import interfaces.Renderizable;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author digregor
 */
public class OperarMesaCrupier2 extends javax.swing.JFrame implements VistaOperarMesaCrupier {

    private ControladorOperarMesaCrupier controlador;
    private TipoApuesta[] tipoApuesta;
    int apuestaRojo = 0;

    /**
     * Creates new form NewJFrame
     */
    public OperarMesaCrupier2(Crupier crupier, TipoApuesta[] tiposApuesta) {
        this.controlador = new ControladorOperarMesaCrupier(this, crupier);
        this.tipoApuesta = tiposApuesta;
        initComponents();
        //inhabilitarComponentes();
        inicializar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMontoMesa = new javax.swing.JTextField();
        lbPesos = new javax.swing.JLabel();
        txtRonda = new javax.swing.JTextField();
        lbRonda = new javax.swing.JLabel();
        lbRuleta = new javax.swing.JLabel();
        lbPesos2 = new javax.swing.JLabel();
        txtRuleta = new javax.swing.JTextField();
        btnCerrarMesa = new javax.swing.JButton();
        lbApuestas = new javax.swing.JLabel();
        txtApuestas = new javax.swing.JTextField();
        lbMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbEfectos = new javax.swing.JComboBox();
        btnLanzarPagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListUltimosLanzamientos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUltimoNumeroSorteado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("$ -");

        txtMontoMesa.setEditable(false);
        txtMontoMesa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMontoMesa.setForeground(new java.awt.Color(255, 51, 51));
        txtMontoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMesaActionPerformed(evt);
            }
        });

        lbPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/pesos.png"))); // NOI18N

        txtRonda.setEditable(false);
        txtRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbRonda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbRonda.setText("Ronda #");

        lbRuleta.setText("Ruleta #");

        lbPesos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/ruleta.png"))); // NOI18N

        txtRuleta.setEditable(false);

        btnCerrarMesa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrarMesa.setText("Cerrar mesa");

        lbApuestas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbApuestas.setText("Apuestas:");

        txtApuestas.setEditable(false);
        txtApuestas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbMonto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMonto.setText("Monto$");

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Aplicación Crupier  -  Operar Ruleta");

        cbEfectos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEfectos.setToolTipText("");

        btnLanzarPagar.setText("Lanzar/Pagar");
        btnLanzarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarPagarActionPerformed(evt);
            }
        });

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Bce Anterior", "Apuestas", "Recolección", "Liquidación", "Bce Posterior"
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
                "Jugador", "Saldo"
            }
        ));
        jScrollPane2.setViewportView(jTabla2);

        jListUltimosLanzamientos.setModel(new javax.swing.AbstractListModel<Integer>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListUltimosLanzamientos);

        jLabel3.setText("Ultimos lanzamientos:");

        jLabel4.setText("Ultimo numero sorteado:");

        txtUltimoNumeroSorteado.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUltimoNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(85, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMontoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(lbMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEfectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPesos2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(btnCerrarMesa))
                                .addComponent(btnLanzarPagar)))
                        .addComponent(jLabel2))
                    .addContainerGap(192, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUltimoNumeroSorteado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPesos))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtMontoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbPesos2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCerrarMesa)))
                            .addGap(8, 8, 8)
                            .addComponent(btnLanzarPagar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addComponent(cbEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMesaActionPerformed

    private void btnLanzarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarPagarActionPerformed
        lanzarPagar();
    }//GEN-LAST:event_btnLanzarPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JButton btnLanzarPagar;
    private javax.swing.JComboBox cbEfectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<Integer> jListUltimosLanzamientos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTable jTabla2;
    private javax.swing.JLabel lbApuestas;
    private javax.swing.JLabel lbMonto;
    private javax.swing.JLabel lbPesos;
    private javax.swing.JLabel lbPesos2;
    private javax.swing.JLabel lbRonda;
    private javax.swing.JLabel lbRuleta;
    private javax.swing.JTextField txtApuestas;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoMesa;
    private javax.swing.JTextField txtRonda;
    private javax.swing.JTextField txtRuleta;
    private javax.swing.JTextField txtUltimoNumeroSorteado;
    // End of variables declaration//GEN-END:variables
    
    private void inicializar() {
        //habilitarComponentes();
        controlador.obtenerDatos();
        controlador.listarJugadoresConSuSaldo();
        controlador.ultimosLanzamientos();
        controlador.ultimoNumeroSorteado();
        controlador.listarRondasConSuInformacion();
    }

    @Override
    public void mostrarDatos(int saldoMesa, int ronda, int numeroMesa, ArrayList<MecanismoSorteo> efectos) {
        txtMontoMesa.setText(saldoMesa + "");
        txtRonda.setText(ronda + "");
        txtRuleta.setText(numeroMesa + "");
        DefaultComboBoxModel<MecanismoSorteo> model = new DefaultComboBoxModel<>();
        for (MecanismoSorteo e : efectos) {
            model.addElement(e);
        }
        cbEfectos.setModel(model);
    }

    private void lanzarPagar() {
        agregarRonda();
        controlador.lanzarPagar();
    }

    private class Detalle implements ListCellRenderer<Renderizable> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Renderizable> list, Renderizable value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = new JLabel();
            label.setText(value.getRenderDetail());
            return label;
        }
    }

/*    private void inhabilitarComponentes() {
        r.setVisible(PanelRuleta.MAYOR, false);
        r.setVisible(PanelRuleta.MENOR, false);
        r.setVisible(PanelRuleta.COMPUESTO, false);
        r.setVisible(PanelRuleta.PRIMO, false);
        r.setVisible(PanelRuleta.IMPAR, false);
        r.setVisible(PanelRuleta.PAR, false);
        r.setVisible(PanelRuleta.PRIMERA_COLUMNA, false);
        r.setVisible(PanelRuleta.SEGUNDA_COLUMNA, false);
        r.setVisible(PanelRuleta.TERCERA_COLUMNA, false);
        r.setVisible(PanelRuleta.ROJO, false);
        r.setVisible(PanelRuleta.NEGRO, false);
        r.setVisible(PanelRuleta.PRIMERA_DOCENA, false);
        r.setVisible(PanelRuleta.SEGUNDA_DOCENA, false);
        r.setVisible(PanelRuleta.TERCERA_DOCENA, false);
    }

    private void habilitarComponentes() {
        for (TipoApuesta ta : tipoApuesta) {
            switch (ta.getCasillero()) {
                case "Rojo":
                    r.setVisible(PanelRuleta.ROJO, true);
                    break;
                case "Negro":
                    r.setVisible(PanelRuleta.NEGRO, true);
                    break;
                case "Primera Docena":
                    r.setVisible(PanelRuleta.PRIMERA_DOCENA, true);
                    break;
                case "Segunda Docena":
                    r.setVisible(PanelRuleta.SEGUNDA_DOCENA, true);
                    break;
                case "Tercera Docena":
                    r.setVisible(PanelRuleta.TERCERA_DOCENA, true);
                    break;
                default:
                    break;
            }
        }
    }*/

    @Override
    public void salir() {
        dispose();
    }
    
    @Override
    public void listarJugadoresConSuSaldo(ArrayList<Jugador> jugadores) {

        DefaultTableModel modelo = (DefaultTableModel) jTabla2.getModel();
        modelo.setRowCount(0); // Limpia todas las filas existentes en la tabla

        for (Jugador jugador : jugadores) {
            String nombreJugador = jugador.getNombre(); 
            double saldo = jugador.getSaldoInicial(); 
            modelo.addRow(new Object[]{nombreJugador, saldo});
        }
        
    }
    
    @Override
    public void listarRondasConSuInformacion(ArrayList<Ronda> rondas) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTabla1.getModel();
        modelo.setRowCount(0); // Limpia todas las filas existentes en la tabla
        
        int balanceAnterior = 0; // Inicializa el balance anterior en 0

        for (Ronda r : rondas) {
            int numeroRonda = r.getNumero(); 
            //int balanceAnterior = r.getBalanceAnteriorAlSorteo();
            int montoTotalDeApuestas = r.montoTotalDeLasApuestas(); 
            int montoTotalApuestasPerdidas = r.montoTotalApuestasPerdidasRecoleccion();
            int montoTotalDeApuestasPagadas = r.montoTotalApuestasPagadasLiquidacion();
            int balancePosteriorAlSorteo = r.getBalanceSaldo();
            modelo.addRow(new Object[]{numeroRonda, balanceAnterior, montoTotalDeApuestas, montoTotalApuestasPerdidas, montoTotalDeApuestasPagadas, balancePosteriorAlSorteo });
        
            // Actualiza el balance anterior para la próxima ronda
            balanceAnterior = balancePosteriorAlSorteo;

        }
        
    }
    
    public void agregarRonda(){
        
        int numeroDeRonda = Integer.parseInt(txtRonda.getText());
        int montoTotalApostado = Integer.parseInt(txtMonto.getText());
        int balanceSaldo = Integer.parseInt(txtMontoMesa.getText());
        int cantidadDeApuestas = Integer.parseInt(txtApuestas.getText());
        Mesa mesa = controlador.getMesaAsignada();
        MecanismoSorteo mecanismo = (MecanismoSorteo) cbEfectos.getSelectedItem();
        //int numeroSorteado = Integer.parseInt(txtNumeroSorteado.getText());
        //ToDo: Faltaria numeroSorteadoDeLaRonda

        controlador.agregarRonda(numeroDeRonda, balanceSaldo, montoTotalApostado, cantidadDeApuestas, mesa, mecanismo);
    }
    
    
    //PARTE DE ULTIMOS LANZAMIENTOS:
    
    @Override
    public void ultimosLanzamientos(ArrayList<Integer> ultimosLanzamientos) {
        
        DefaultListModel<Integer> lista = new DefaultListModel<>();

        for (Integer numero : ultimosLanzamientos) {
            lista.addElement(numero);
        }

        jListUltimosLanzamientos.setModel(lista);
        
    }
    
    @Override
    public void ultimoNumeroSorteado(int ultimoNumero) {
        txtUltimoNumeroSorteado.setText(String.valueOf(ultimoNumero));
    }

}
