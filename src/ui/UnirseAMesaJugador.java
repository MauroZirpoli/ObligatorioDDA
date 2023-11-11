/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;

import interfaces.VistaUnirseAMesaJugador;
import Controladores.ControladorUnirseAMesaJugador;
import Controladores.ControladorVentanaMesaJugador;
import Exceptions.UsuariosExceptions;

import dominio.Jugador;
import dominio.Mesa;
import interfaces.VistaVentanaMesaJugador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauro
 */
public class UnirseAMesaJugador extends javax.swing.JDialog implements VistaUnirseAMesaJugador {

    private ControladorUnirseAMesaJugador controlador;
    private Jugador jugador;

    public UnirseAMesaJugador(java.awt.Frame parent, boolean modal, Jugador jugador) {
        super(parent, modal);

        initComponents();
        this.controlador = new ControladorUnirseAMesaJugador(this, jugador);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        IListMesa = new javax.swing.JList<>();
        titulo = new javax.swing.JTextField();
        subTitulo = new javax.swing.JTextField();
        btnUnirse = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(IListMesa);

        titulo.setText("Aplicacion Jugador - Unirse a una Mesa");

        subTitulo.setText("Mesas Abiertas:");

        btnUnirse.setText("Unirse");
        btnUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseActionPerformed(evt);
            }
        });

        btnLogOff.setText("Log Off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnUnirse)
                        .addGap(31, 31, 31)
                        .addComponent(btnLogOff)))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnirse)
                    .addComponent(btnLogOff))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseActionPerformed
        unirse();
    }//GEN-LAST:event_btnUnirseActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        salir();
    }//GEN-LAST:event_btnLogOffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Mesa> IListMesa;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnUnirse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField subTitulo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
    
    private void inicializar() {
        controlador.listarMesasDisponibles();
    }
    
    @Override
    public void listarMesasDisponibles(ArrayList<Mesa> mesasDisponibles) {

        DefaultListModel<Mesa> list = new DefaultListModel<>();

        for (Mesa m : mesasDisponibles) {
            list.addElement(m);
        }
        IListMesa.setModel(list);
    }

    private void unirse() {
        Mesa mesaSeleccionada = IListMesa.getSelectedValue();
        if (mesaSeleccionada != null) {
            boolean ok = controlador.agregarJugadorAMesa(mesaSeleccionada, jugador);
            if(ok){
                new VentanaMesaJugador(jugador, mesaSeleccionada).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Algo salio mal.", "", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        jugador.setLogueado(false);
        dispose();
    }

    /*@Override
    public void agregarJugadorAMesa(Mesa mesa, Jugador jugador) {
        
        Mesa mesaSeleccionada = IListMesa.getSelectedValue();
        if (mesaSeleccionada != null) {
            if (!mesaSeleccionada.jugadorEstaEnMesa(jugador)) {
                mesaSeleccionada.agregarJugador(jugador);
                //new ControladorVentanaMesaJugador(new VistaVentanaMesaJugador,jugador, mesaSeleccionada);
                new VentanaMesaJugador(jugador, mesaSeleccionada).setVisible(true);
            }
            //ToDo: El jugador ya se ha unido a la mesa. Mensaje “El jugador ya participa de esta mesa.”  
            throw new UsuariosExceptions("El jugador ya participa de esta mesa.");
        }
        
    }*/

    @Override
    public void mostrarError(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
