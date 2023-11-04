/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Controladores.ControladorIniciarMesaCrupier;
import dominio.Crupier;
import dominio.Mesa;
import dominio.TipoApuesta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class IniciarMesaCrupier extends javax.swing.JDialog implements VistaIniciarMesaCrupier{

    private ControladorIniciarMesaCrupier controlador;
    
    public IniciarMesaCrupier() {
        initComponents();
    }

    public IniciarMesaCrupier(java.awt.Frame parent, boolean modal, Crupier crupier) {
        super(parent, modal);

        initComponents();
        this.controlador = new ControladorIniciarMesaCrupier(this, crupier);
        inicializar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        IListTipoApuesta = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(IListTipoApuesta);

        jTextField1.setText("Tipo de Apuesta:");

        jTextField2.setText("Aplicacion Crupier - Iniciar Mesa");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnIniciar)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciar();
    }//GEN-LAST:event_btnIniciarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<TipoApuesta> IListTipoApuesta;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        controlador.listarTipoApuestas();
    }
    
    @Override
    public void listarTiposDeApuestas(ArrayList<TipoApuesta> tipoApuestas) {
        DefaultListModel<TipoApuesta> list = new DefaultListModel<>();
        
        for(TipoApuesta t: tipoApuestas){
            list.addElement(t);
        }
        IListTipoApuesta.setModel(list);
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
        });
        
    }



}
