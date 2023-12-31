/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauro
 */
public class InicioVentana extends javax.swing.JFrame {

    /**
     * Creates new form InicioVentana
     */
    public InicioVentana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginJugador = new javax.swing.JButton();
        btnLoginCrupier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoginJugador.setText("Iniciar como Jugador");
        btnLoginJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginJugadorActionPerformed(evt);
            }
        });

        btnLoginCrupier.setText("Iniciar con Crupier");
        btnLoginCrupier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCrupierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLoginJugador)
                .addGap(38, 38, 38)
                .addComponent(btnLoginCrupier)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginJugador)
                    .addComponent(btnLoginCrupier))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginJugadorActionPerformed
        loginJugador();
    }//GEN-LAST:event_btnLoginJugadorActionPerformed

    private void btnLoginCrupierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCrupierActionPerformed
        loginCrupier();
    }//GEN-LAST:event_btnLoginCrupierActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginCrupier;
    private javax.swing.JButton btnLoginJugador;
    // End of variables declaration//GEN-END:variables

    private void loginCrupier() {
        new DialogoLoginCrupier(this, false).setVisible(true);
    }

    private void loginJugador() {
        new DialogoLoginJugador(this, false).setVisible(true);
    }
    
    /*private void cerrar() {
        if(JOptionPane.showConfirmDialog(this, "Confirma que desea salir", "Salir del sistema", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0); //salir completamente del sistema
        }
    }*/
}
