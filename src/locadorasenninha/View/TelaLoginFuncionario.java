//OK
package locadorasenninha.View;

import locadorasenninha.Controller.LocadoraController;
import locadorasenninha.Model.Locadora;
import locadorasenninha.Model.Main;

import javax.swing.*;

public class TelaLoginFuncionario extends javax.swing.JFrame {


    public TelaLoginFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora10 = new javax.swing.JPanel();
        labelLocadora10 = new javax.swing.JLabel();
        painelSuporteFuncionario = new javax.swing.JPanel();
        labelUsuarioFuncionario = new javax.swing.JLabel();
        labelSenhaFuncionario = new javax.swing.JLabel();
        textFieldUsuarioFuncionario = new javax.swing.JFormattedTextField();
        buttonEntrarFuncionario = new javax.swing.JButton();
        passwordFieldLoginFuncionario = new javax.swing.JPasswordField();
        IntroLogFuncionario = new javax.swing.JLabel();
        retornarLoginFuncionario = new javax.swing.JButton();

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

        painelSuporteFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        painelSuporteFuncionario.setPreferredSize(new java.awt.Dimension(300, 200));

        labelUsuarioFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUsuarioFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuarioFuncionario.setText("USUÁRIO:");

        labelSenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaFuncionario.setText("SENHA:");

        textFieldUsuarioFuncionario.setForeground(new java.awt.Color(192, 2, 0));

        buttonEntrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEntrarFuncionario.setForeground(new java.awt.Color(192, 2, 0));
        buttonEntrarFuncionario.setText("ENTRAR");
        buttonEntrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarFuncionarioActionPerformed(evt);
            }
        });

        passwordFieldLoginFuncionario.setForeground(new java.awt.Color(192, 2, 0));

        try {
            textFieldUsuarioFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldUsuarioFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout painelSuporteFuncionarioLayout = new javax.swing.GroupLayout(painelSuporteFuncionario);
        painelSuporteFuncionario.setLayout(painelSuporteFuncionarioLayout);
        painelSuporteFuncionarioLayout.setHorizontalGroup(
            painelSuporteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteFuncionarioLayout.createSequentialGroup()
                .addGroup(painelSuporteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuporteFuncionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordFieldLoginFuncionario))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelSuporteFuncionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelSuporteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldUsuarioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(painelSuporteFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelSuporteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsuarioFuncionario)
                                    .addComponent(labelSenhaFuncionario))
                                .addGap(0, 214, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteFuncionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonEntrarFuncionario)
                .addGap(101, 101, 101))
        );
        painelSuporteFuncionarioLayout.setVerticalGroup(
            painelSuporteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteFuncionarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelUsuarioFuncionario)
                .addGap(18, 18, 18)
                .addComponent(textFieldUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenhaFuncionario)
                .addGap(18, 18, 18)
                .addComponent(passwordFieldLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEntrarFuncionario)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        IntroLogFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IntroLogFuncionario.setText("Login como Funcionário!");

        retornarLoginFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        retornarLoginFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        retornarLoginFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        retornarLoginFuncionario.setText("RETORNAR");
        retornarLoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarLoginFuncionarioActionPerformed(evt);
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
                            .addComponent(IntroLogFuncionario)
                            .addComponent(painelSuporteFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(retornarLoginFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(IntroLogFuncionario)
                .addGap(18, 18, 18)
                .addComponent(painelSuporteFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(retornarLoginFuncionario)
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

    private void buttonEntrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarFuncionarioActionPerformed
        String usuario = textFieldUsuarioFuncionario.getText();
        String senha = String.valueOf(passwordFieldLoginFuncionario.getPassword());

        System.out.println(usuario);
        System.out.println(senha);

        if (Main.controller.verificaLoginFuncionario(usuario, senha))
        {
            JOptionPane.showMessageDialog(null, "Login Efetuado!");
            MenuFuncionario novatela = new MenuFuncionario();
            novatela.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Inválido!");
        }
    }//GEN-LAST:event_buttonEntrarFuncionarioActionPerformed

    private void retornarLoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarLoginFuncionarioActionPerformed
        TelaInicial novatela = new TelaInicial();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retornarLoginFuncionarioActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntroLogFuncionario;
    private javax.swing.JButton buttonEntrarFuncionario;
    private javax.swing.JLabel labelLocadora10;
    private javax.swing.JLabel labelSenhaFuncionario;
    private javax.swing.JLabel labelUsuarioFuncionario;
    private javax.swing.JPanel painelLocadora10;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteFuncionario;
    private javax.swing.JPasswordField passwordFieldLoginFuncionario;
    private javax.swing.JButton retornarLoginFuncionario;
    private javax.swing.JFormattedTextField textFieldUsuarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
