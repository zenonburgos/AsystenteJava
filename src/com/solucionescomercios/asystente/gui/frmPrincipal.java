/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionescomercios.asystente.gui;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btUsuarios = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JLabel();
        btNuevoUsuario = new javax.swing.JPanel();
        btnNuevoUsuario = new javax.swing.JLabel();
        btInicio = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlUsuarios = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlNuevoUsuario = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(242, 230, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 100));

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCerrar.setText("  Cerrar Sesi??n");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 40));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("  Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 210, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, -1));

        btUsuarios.setBackground(new java.awt.Color(242, 230, 255));
        btUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btUsuariosMouseMoved(evt);
            }
        });
        btUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btUsuariosMouseExited(evt);
            }
        });
        btUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        btUsuarios.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 20));

        jPanel2.add(btUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 50));

        btNuevoUsuario.setBackground(new java.awt.Color(242, 230, 255));
        btNuevoUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btNuevoUsuarioMouseMoved(evt);
            }
        });
        btNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNuevoUsuarioMouseExited(evt);
            }
        });
        btNuevoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoUsuarioMouseClicked(evt);
            }
        });
        btNuevoUsuario.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, 20));

        jPanel2.add(btNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 50));

        btInicio.setBackground(new java.awt.Color(242, 230, 255));
        btInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btInicioMouseMoved(evt);
            }
        });
        btInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInicioMouseExited(evt);
            }
        });
        btInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btInicio.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 60, 20));

        jPanel2.add(btInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        jPanel3.setBackground(new java.awt.Color(31, 174, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Asystente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        jPanel4.setLayout(new java.awt.CardLayout());

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inicio");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(jPanel5, gridBagConstraints);

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.add(pnlInicio, "card2");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuarios");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel7.add(jPanel8, gridBagConstraints);

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.add(pnlUsuarios, "card3");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuevo usuario");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel9.add(jPanel10, gridBagConstraints);

        javax.swing.GroupLayout pnlNuevoUsuarioLayout = new javax.swing.GroupLayout(pnlNuevoUsuario);
        pnlNuevoUsuario.setLayout(pnlNuevoUsuarioLayout);
        pnlNuevoUsuarioLayout.setHorizontalGroup(
            pnlNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNuevoUsuarioLayout.setVerticalGroup(
            pnlNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
        );

        jPanel4.add(pnlNuevoUsuario, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        pnlInicio.setVisible(false);
        pnlUsuarios.setVisible(true);
        pnlNuevoUsuario.setVisible(false);
        
        btnUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        btnUsuarios.setForeground(new java.awt.Color(11, 10, 9));
        
        btnUsuarios.setBackground(new java.awt.Color(31, 174, 255));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        
        btnNuevoUsuario.setBackground(new java.awt.Color(244, 244, 244));
        btnNuevoUsuario.setForeground(new java.awt.Color(11, 10, 9));
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioMouseClicked
        pnlInicio.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlNuevoUsuario.setVisible(true);
        
        btnUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        btnUsuarios.setForeground(new java.awt.Color(11, 10, 9));
        
        btnUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        btnUsuarios.setForeground(new java.awt.Color(11, 10, 9));
        
        btnNuevoUsuario.setBackground(new java.awt.Color(31, 174, 255));
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnNuevoUsuarioMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        Acceso ir = new Acceso();
        ir.setVisible(true);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        pnlInicio.setVisible(true);
        pnlUsuarios.setVisible(false);
        pnlNuevoUsuario.setVisible(false);

        btnInicio.setBackground(new java.awt.Color(31, 174, 255));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        btnUsuarios.setForeground(new java.awt.Color(11, 10, 9));

        btnNuevoUsuario.setBackground(new java.awt.Color(244, 244, 244));
        btnNuevoUsuario.setForeground(new java.awt.Color(11, 10, 9));
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btInicioMouseClicked

    private void btInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInicioMouseMoved
        btInicio.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_btInicioMouseMoved

    private void btInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInicioMouseExited
        btInicio.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_btInicioMouseExited

    private void btUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuariosMouseMoved
        btUsuarios.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_btUsuariosMouseMoved

    private void btUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuariosMouseExited
        btUsuarios.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_btUsuariosMouseExited

    private void btNuevoUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoUsuarioMouseMoved
        btNuevoUsuario.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_btNuevoUsuarioMouseMoved

    private void btNuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoUsuarioMouseExited
        btNuevoUsuario.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_btNuevoUsuarioMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btInicio;
    private javax.swing.JPanel btNuevoUsuario;
    private javax.swing.JPanel btUsuarios;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnNuevoUsuario;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlNuevoUsuario;
    private javax.swing.JPanel pnlUsuarios;
    // End of variables declaration//GEN-END:variables
}
