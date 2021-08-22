
package locadorasenninha.View;

import javax.swing.JOptionPane;


public class CadastrarCliente extends javax.swing.JFrame {


    public CadastrarCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelCadastrarCliente = new javax.swing.JLabel();
        painelSuporteCadastrarCliente = new javax.swing.JPanel();
        labelNomeCliente = new javax.swing.JLabel();
        labelDataNascimentoCliente = new javax.swing.JLabel();
        labelCPFCliente = new javax.swing.JLabel();
        labelTelefoneCliente = new javax.swing.JLabel();
        labelEnderecoCliente = new javax.swing.JLabel();
        labelCEPCliente = new javax.swing.JLabel();
        labelEmailCliente = new javax.swing.JLabel();
        labelSenhaCliente = new javax.swing.JLabel();
        textFielNomeCliente = new javax.swing.JTextField();
        textFieldEnderecoCliente = new javax.swing.JTextField();
        textFieldEmailCliente = new javax.swing.JTextField();
        textFieldSenhaCliente = new javax.swing.JTextField();
        textFieldDataNascimentoCliente = new javax.swing.JFormattedTextField();
        textFieldCPFCLiente = new javax.swing.JFormattedTextField();
        textFieldTelefoneCliente = new javax.swing.JFormattedTextField();
        textFieldCEPCliente = new javax.swing.JFormattedTextField();
        buttonRetornarCadastrarCliente = new javax.swing.JButton();
        buttonCadastrarCliente = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        labelCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelCadastrarCliente.setText("Cadastrar Cliente:");

        painelSuporteCadastrarCliente.setBackground(new java.awt.Color(192, 2, 0));

        labelNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeCliente.setText("Nome:");

        labelDataNascimentoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataNascimentoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascimentoCliente.setText("Data de Nascimento:");

        labelCPFCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCPFCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCPFCliente.setText("CPF:");

        labelTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneCliente.setText("Telefone:");

        labelEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoCliente.setText("Endereço:");

        labelCEPCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCEPCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCEPCliente.setText("CEP:");

        labelEmailCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmailCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailCliente.setText("Email:");

        labelSenhaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaCliente.setText("Senha de Acesso:");

        try {
            textFieldDataNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataNascimentoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textFieldCPFCLiente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldCPFCLiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textFieldTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textFieldCEPCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldCEPCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout painelSuporteCadastrarClienteLayout = new javax.swing.GroupLayout(painelSuporteCadastrarCliente);
        painelSuporteCadastrarCliente.setLayout(painelSuporteCadastrarClienteLayout);
        painelSuporteCadastrarClienteLayout.setHorizontalGroup(
            painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFielNomeCliente)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelEnderecoCliente)
                                .addGap(279, 279, 279))
                            .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                    .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNomeCliente)
                                        .addComponent(labelDataNascimentoCliente)
                                        .addComponent(textFieldDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(108, 108, 108)
                                    .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelCPFCliente)
                                        .addComponent(textFieldCPFCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(115, 115, 115))
                                .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                    .addComponent(textFieldEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))))
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCEPCliente)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelTelefoneCliente))
                            .addComponent(textFieldTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(textFieldCEPCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelEmailCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textFieldEmailCliente))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelSenhaCliente)
                                .addGap(145, 145, 145))
                            .addComponent(textFieldSenhaCliente))))
                .addContainerGap())
        );
        painelSuporteCadastrarClienteLayout.setVerticalGroup(
            painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFielNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimentoCliente)
                    .addComponent(labelCPFCliente)
                    .addComponent(labelTelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTelefoneCliente)
                    .addComponent(textFieldCPFCLiente)
                    .addComponent(textFieldDataNascimentoCliente))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoCliente)
                    .addComponent(labelCEPCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldCEPCliente)
                    .addComponent(textFieldEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailCliente)
                    .addComponent(labelSenhaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldSenhaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(textFieldEmailCliente))
                .addGap(40, 40, 40))
        );

        buttonRetornarCadastrarCliente.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarCadastrarCliente.setText("RETORNAR");
        buttonRetornarCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarCadastrarClienteActionPerformed(evt);
            }
        });

        buttonCadastrarCliente.setBackground(new java.awt.Color(192, 2, 0));
        buttonCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCliente.setText("CADASTRAR CLIENTE");
        buttonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelCadastrarCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonRetornarCadastrarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarCliente)
                        .addContainerGap())))
            .addComponent(painelLocadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelSuporteCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(labelCadastrarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarCadastrarCliente)
                    .addComponent(buttonCadastrarCliente))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarClienteActionPerformed
        //Funcao Cadastrar Cliente.
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
        ListaClientes novatela = new ListaClientes();
        novatela.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_buttonCadastrarClienteActionPerformed

    private void buttonRetornarCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarCadastrarClienteActionPerformed
        ListaClientes novatela = new ListaClientes();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarCadastrarClienteActionPerformed


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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarCliente;
    private javax.swing.JButton buttonRetornarCadastrarCliente;
    private javax.swing.JLabel labelCEPCliente;
    private javax.swing.JLabel labelCPFCliente;
    private javax.swing.JLabel labelCadastrarCliente;
    private javax.swing.JLabel labelDataNascimentoCliente;
    private javax.swing.JLabel labelEmailCliente;
    private javax.swing.JLabel labelEnderecoCliente;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelSenhaCliente;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteCadastrarCliente;
    private javax.swing.JTextField textFielNomeCliente;
    private javax.swing.JFormattedTextField textFieldCEPCliente;
    private javax.swing.JFormattedTextField textFieldCPFCLiente;
    private javax.swing.JFormattedTextField textFieldDataNascimentoCliente;
    private javax.swing.JTextField textFieldEmailCliente;
    private javax.swing.JTextField textFieldEnderecoCliente;
    private javax.swing.JTextField textFieldSenhaCliente;
    private javax.swing.JFormattedTextField textFieldTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
