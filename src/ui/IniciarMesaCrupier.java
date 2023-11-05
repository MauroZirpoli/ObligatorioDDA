/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import interfaces.VistaIniciarMesaCrupier;
import Controladores.ControladorIniciarMesaCrupier;
import dominio.Crupier;
import dominio.Mesa;
import dominio.TipoApuesta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IniciarMesaCrupier extends javax.swing.JDialog implements VistaIniciarMesaCrupier {

    private ControladorIniciarMesaCrupier controlador;
    private Crupier crupier;

    public IniciarMesaCrupier() {
        initComponents();
    }

    public IniciarMesaCrupier(java.awt.Frame parent, boolean modal, Crupier crupier) {
        super(parent, modal);

        initComponents();
        this.controlador = new ControladorIniciarMesaCrupier(this, crupier);
        this.crupier = crupier;
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTipoAp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextField1.setText("Tipo de Apuesta:");

        jTextField2.setText("Aplicacion Crupier - Iniciar Mesa");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        tblTipoAp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Casillero", "Codigo"
            }
        ));
        tblTipoAp.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tblTipoAp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnIniciar)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciar();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrar();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblTipoAp;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        controlador.listarTipoApuestas();
        
    }

    @Override
    public void listarTiposDeApuestas(ArrayList<TipoApuesta> tipoApuestas) {
        String[] columnNames = {"Nombre", "Casillero", "Codigo"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, tipoApuestas.size());
        
        for (TipoApuesta t : tipoApuestas) {
            modeloDefault.addRow(new Object[]{t.getNombre(), t.getCasillero(), t.getCodigo()});
        }
        tblTipoAp.setModel(modeloDefault);
    }
    
    

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        dispose();
    }

    private void iniciar() {
        int [] selectedRows = tblTipoAp.getSelectedRows();
        for (int row:selectedRows){
            Object[] rowData = new Object[tblTipoAp.getColumnCount()];
            for (int col = 0; col < tblTipoAp.getColumnCount(); col++){
                rowData[col]=tblTipoAp.getValueAt(row, col);
            }
        }
        new OperarMesaCrupier(crupier).setVisible(true);
       // Mesa mesa = new Mesa(controlador.getUsuarioCrupier());
        /*    
        btnIniciar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                TipoApuesta[] items = IListTipoApuesta.getSelectedValuesList().toArray(new TipoApuesta[0]);
                
                Mesa mesa = new Mesa(controlador.getUsuarioCrupier());
                
                for (TipoApuesta tipo : items) {
                    mesa.agregarTipoApuesta(tipo);
                }
                    
                mesa.setDisponible(true);
                new OperarMesaCrupier().setVisible(true);
                //ToDo:completar ahora la parte de OperarMesaCrupier()
            }
           });*/

    }

    private void cerrar() {
        controlador.cerrar();
    }
}
