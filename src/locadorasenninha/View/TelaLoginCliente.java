package locadorasenninha.View;
import locadorasenninha.Controller.LocadoraController;

import javax.swing.*;

public class TelaLoginCliente extends javax.swing.JFrame {


    public TelaLoginCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        painelSuporteCliente = new javax.swing.JPanel();
        labelCpfCliente = new javax.swing.JLabel();
        labelSenhaCliente = new javax.swing.JLabel();
        textFieldCPFCliente = new javax.swing.JTextField();
        buttonEntrarCliente = new javax.swing.JButton();
        passwordFieldLoginCliente = new javax.swing.JPasswordField();
        IntroLogCliente = new javax.swing.JLabel();
        retornarLoginCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        painelLocadora.setBackground(new java.awt.Color(192, 2, 0));
        painelLocadora.setPreferredSize(new java.awt.Dimension(800, 40));

        labelLocadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLocadora.setForeground(new java.awt.Color(255, 255, 255));
        labelLocadora.setText("LOCADORA SENNINHA");

        javax.swing.GroupLayout painelLocadoraLayout = new javax.swing.GroupLayout(painelLocadora);
        painelLocadora.setLayout(painelLocadoraLayout);
        painelLocadoraLayout.setHorizontalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        painelSuporteCliente.setBackground(new java.awt.Color(192, 2, 0));
        painelSuporteCliente.setPreferredSize(new java.awt.Dimension(300, 200));

        labelCpfCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCpfCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCpfCliente.setText("CPF:");

        labelSenhaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaCliente.setText("SENHA:");

        textFieldCPFCliente.setForeground(new java.awt.Color(192, 2, 0));

        buttonEntrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEntrarCliente.setForeground(new java.awt.Color(192, 2, 0));
        buttonEntrarCliente.setText("ENTRAR");
        buttonEntrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarClienteActionPerformed(evt);
            }
        });

        passwordFieldLoginCliente.setForeground(new java.awt.Color(192, 2, 0));

        javax.swing.GroupLayout painelSuporteClienteLayout = new javax.swing.GroupLayout(painelSuporteCliente);
        painelSuporteCliente.setLayout(painelSuporteClienteLayout);
        painelSuporteClienteLayout.setHorizontalGroup(
            painelSuporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteClienteLayout.createSequentialGroup()
                .addGroup(painelSuporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuporteClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordFieldLoginCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelSuporteClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelSuporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(painelSuporteClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCpfCliente)
                                    .addComponent(labelSenhaCliente))
                                .addGap(0, 229, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonEntrarCliente)
                .addGap(103, 103, 103))
        );
        painelSuporteClienteLayout.setVerticalGroup(
            painelSuporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelCpfCliente)
                .addGap(18, 18, 18)
                .addComponent(textFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenhaCliente)
                .addGap(18, 18, 18)
                .addComponent(passwordFieldLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEntrarCliente)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        IntroLogCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IntroLogCliente.setText("Login como cliente!");

        retornarLoginCliente.setBackground(new java.awt.Color(192, 2, 0));
        retornarLoginCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        retornarLoginCliente.setForeground(new java.awt.Color(255, 255, 255));
        retornarLoginCliente.setText("RETORNAR");
        retornarLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarLoginClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IntroLogCliente)
                            .addComponent(painelSuporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(retornarLoginCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(IntroLogCliente)
                .addGap(18, 18, 18)
                .addComponent(painelSuporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(retornarLoginCliente)
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

    private void buttonEntrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarClienteActionPerformed
        String cpf = textFieldCPFCliente.getText();
        String senha = String.valueOf(passwordFieldLoginCliente.getPassword());

        System.out.println(cpf);
        System.out.println(cpf.length());
        System.out.println(senha);
        System.out.println(senha.length());

        if (new LocadoraController().verificaLoginCliente(cpf, senha))
        {
            JOptionPane.showMessageDialog(null, "Login Efetuado!");
            ReservasCliente novatela = new ReservasCliente();
            novatela.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Inválido!");
        }
    }//GEN-LAST:event_buttonEntrarClienteActionPerformed

    private void retornarLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarLoginClienteActionPerformed
        TelaInicial novatela = new TelaInicial();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retornarLoginClienteActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntroLogCliente;
    private javax.swing.JButton buttonEntrarCliente;
    private javax.swing.JLabel labelCpfCliente;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelSenhaCliente;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteCliente;
    private javax.swing.JPasswordField passwordFieldLoginCliente;
    private javax.swing.JButton retornarLoginCliente;
    private javax.swing.JTextField textFieldCPFCliente;
    // End of variables declaration//GEN-END:variables
}
