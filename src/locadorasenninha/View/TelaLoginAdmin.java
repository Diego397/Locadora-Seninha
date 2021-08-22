//OK
package locadorasenninha.View;

import locadorasenninha.Controller.LocadoraController;

import javax.swing.*;
import java.util.Objects;

public class TelaLoginAdmin extends javax.swing.JFrame {


    public TelaLoginAdmin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora10 = new javax.swing.JPanel();
        labelLocadora10 = new javax.swing.JLabel();
        painelSuporteAdmin = new javax.swing.JPanel();
        labelUsuarioAdmin = new javax.swing.JLabel();
        labelSenhaAdmin = new javax.swing.JLabel();
        textFieldUsuarioAdmin = new javax.swing.JTextField();
        buttonEntrarAdmin = new javax.swing.JButton();
        passwordFieldLoginAdmin = new javax.swing.JPasswordField();
        IntroLogAdmin = new javax.swing.JLabel();
        retornarLoginAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        painelLocadora10.setBackground(new java.awt.Color(192, 2, 0));
        painelLocadora10.setPreferredSize(new java.awt.Dimension(800, 40));

        labelLocadora10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLocadora10.setForeground(new java.awt.Color(255, 255, 255));
        labelLocadora10.setText("LOCADORA SENNINHA");

        javax.swing.GroupLayout painelLocadora10Layout = new javax.swing.GroupLayout(painelLocadora10);
        painelLocadora10.setLayout(painelLocadora10Layout);
        painelLocadora10Layout.setHorizontalGroup(
            painelLocadora10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadora10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLocadora10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        painelLocadora10Layout.setVerticalGroup(
            painelLocadora10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        painelSuporteAdmin.setBackground(new java.awt.Color(192, 2, 0));
        painelSuporteAdmin.setPreferredSize(new java.awt.Dimension(300, 200));

        labelUsuarioAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUsuarioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuarioAdmin.setText("USUÁRIO:");

        labelSenhaAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaAdmin.setText("SENHA:");

        textFieldUsuarioAdmin.setForeground(new java.awt.Color(192, 2, 0));

        buttonEntrarAdmin.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrarAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEntrarAdmin.setForeground(new java.awt.Color(192, 2, 0));
        buttonEntrarAdmin.setText("ENTRAR");
        buttonEntrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarAdminActionPerformed(evt);
            }
        });

        passwordFieldLoginAdmin.setForeground(new java.awt.Color(192, 2, 0));

        javax.swing.GroupLayout painelSuporteAdminLayout = new javax.swing.GroupLayout(painelSuporteAdmin);
        painelSuporteAdmin.setLayout(painelSuporteAdminLayout);
        painelSuporteAdminLayout.setHorizontalGroup(
            painelSuporteAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteAdminLayout.createSequentialGroup()
                .addGroup(painelSuporteAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuporteAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordFieldLoginAdmin))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelSuporteAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelSuporteAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldUsuarioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(painelSuporteAdminLayout.createSequentialGroup()
                                .addGroup(painelSuporteAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsuarioAdmin)
                                    .addComponent(labelSenhaAdmin))
                                .addGap(0, 214, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonEntrarAdmin)
                .addGap(104, 104, 104))
        );
        painelSuporteAdminLayout.setVerticalGroup(
            painelSuporteAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteAdminLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelUsuarioAdmin)
                .addGap(18, 18, 18)
                .addComponent(textFieldUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenhaAdmin)
                .addGap(18, 18, 18)
                .addComponent(passwordFieldLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEntrarAdmin)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        IntroLogAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IntroLogAdmin.setText("Login como Administrador!");

        retornarLoginAdmin.setBackground(new java.awt.Color(192, 2, 0));
        retornarLoginAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        retornarLoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        retornarLoginAdmin.setText("RETORNAR");
        retornarLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarLoginAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IntroLogAdmin)
                            .addComponent(painelSuporteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(retornarLoginAdmin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(IntroLogAdmin)
                .addGap(18, 18, 18)
                .addComponent(painelSuporteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(retornarLoginAdmin)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarAdminActionPerformed
        String usuario = textFieldUsuarioAdmin.getText();
        String senha = String.valueOf(passwordFieldLoginAdmin.getPassword());

        if (usuario.equals("admin") && senha.equals("admin"))
        {
            JOptionPane.showMessageDialog(null, "Login Efetuado!");
            MenuAdmin novatela = new MenuAdmin();
            novatela.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Inválido!");
        }
    }//GEN-LAST:event_buttonEntrarAdminActionPerformed

    private void retornarLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarLoginAdminActionPerformed
        TelaInicial novatela = new TelaInicial();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retornarLoginAdminActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntroLogAdmin;
    private javax.swing.JButton buttonEntrarAdmin;
    private javax.swing.JLabel labelLocadora10;
    private javax.swing.JLabel labelSenhaAdmin;
    private javax.swing.JLabel labelUsuarioAdmin;
    private javax.swing.JPanel painelLocadora10;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteAdmin;
    private javax.swing.JPasswordField passwordFieldLoginAdmin;
    private javax.swing.JButton retornarLoginAdmin;
    private javax.swing.JTextField textFieldUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
