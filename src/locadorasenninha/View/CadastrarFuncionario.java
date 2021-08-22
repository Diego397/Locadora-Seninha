package locadorasenninha.View;

import locadorasenninha.Controller.LocadoraController;

import javax.swing.JOptionPane;

public class CadastrarFuncionario extends javax.swing.JFrame {

    public CadastrarFuncionario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelCadastrarFuncionario = new javax.swing.JLabel();
        painelSuporteCadastrarFuncionario = new javax.swing.JPanel();
        labelNomeFuncionario = new javax.swing.JLabel();
        labelDataNascimentoFuncionario = new javax.swing.JLabel();
        labelCPFFuncionario = new javax.swing.JLabel();
        labelTelefoneFuncionario = new javax.swing.JLabel();
        labelEnderecoFuncionario = new javax.swing.JLabel();
        labelCEPFuncionario = new javax.swing.JLabel();
        labelEmailFuncionario = new javax.swing.JLabel();
        labelSenhaFuncionario = new javax.swing.JLabel();
        textFielNomeFuncionario = new javax.swing.JTextField();
        textFieldEnderecoFuncionario = new javax.swing.JTextField();
        textFieldEmailFuncionario = new javax.swing.JTextField();
        textFieldSenhaFuncionario = new javax.swing.JTextField();
        textFieldDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        textFieldCPFFuncionario = new javax.swing.JFormattedTextField();
        textFieldTelefoneFuncionario = new javax.swing.JFormattedTextField();
        textFieldCEPFuncionario = new javax.swing.JFormattedTextField();
        buttonRetornarCadastrarFuncionario = new javax.swing.JButton();
        buttonCadastrarFuncionario = new javax.swing.JButton();

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

        labelCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelCadastrarFuncionario.setText("Cadastrar Funcionário:");

        painelSuporteCadastrarFuncionario.setBackground(new java.awt.Color(192, 2, 0));

        labelNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeFuncionario.setText("Nome:");

        labelDataNascimentoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataNascimentoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascimentoFuncionario.setText("Data de Nascimento:");

        labelCPFFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCPFFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCPFFuncionario.setText("CPF:");

        labelTelefoneFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefoneFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneFuncionario.setText("Telefone:");

        labelEnderecoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnderecoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoFuncionario.setText("Endereço:");

        labelCEPFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCEPFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCEPFuncionario.setText("CEP:");

        labelEmailFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmailFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailFuncionario.setText("Email:");

        labelSenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaFuncionario.setText("Senha de Acesso:");

        try {
            textFieldDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataNascimentoFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textFieldCPFFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldCPFFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textFieldTelefoneFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textFieldCEPFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldCEPFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout painelSuporteCadastrarFuncionarioLayout = new javax.swing.GroupLayout(painelSuporteCadastrarFuncionario);
        painelSuporteCadastrarFuncionario.setLayout(painelSuporteCadastrarFuncionarioLayout);
        painelSuporteCadastrarFuncionarioLayout.setHorizontalGroup(
            painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFielNomeFuncionario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelEnderecoFuncionario)
                                .addGap(279, 279, 279))
                            .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                    .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNomeFuncionario)
                                        .addComponent(labelDataNascimentoFuncionario)
                                        .addComponent(textFieldDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(108, 108, 108)
                                    .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelCPFFuncionario)
                                        .addComponent(textFieldCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(115, 115, 115))
                                .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                    .addComponent(textFieldEnderecoFuncionario)
                                    .addGap(18, 18, 18))))
                        .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCEPFuncionario)
                            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelTelefoneFuncionario))
                            .addComponent(textFieldTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(textFieldCEPFuncionario)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelEmailFuncionario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textFieldEmailFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelSenhaFuncionario)
                                .addGap(145, 145, 145))
                            .addComponent(textFieldSenhaFuncionario))))
                .addContainerGap())
        );
        painelSuporteCadastrarFuncionarioLayout.setVerticalGroup(
            painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFielNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimentoFuncionario)
                    .addComponent(labelCPFFuncionario)
                    .addComponent(labelTelefoneFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTelefoneFuncionario)
                    .addComponent(textFieldCPFFuncionario)
                    .addComponent(textFieldDataNascimentoFuncionario))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoFuncionario)
                    .addComponent(labelCEPFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldCEPFuncionario)
                    .addComponent(textFieldEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailFuncionario)
                    .addComponent(labelSenhaFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(textFieldEmailFuncionario))
                .addGap(40, 40, 40))
        );

        buttonRetornarCadastrarFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarCadastrarFuncionario.setText("RETORNAR");
        buttonRetornarCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarCadastrarFuncionarioActionPerformed(evt);
            }
        });

        buttonCadastrarFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
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
                        .addComponent(labelCadastrarFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelSuporteCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonRetornarCadastrarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarFuncionario)
                        .addGap(19, 19, 19))))
            .addComponent(painelLocadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(labelCadastrarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarCadastrarFuncionario)
                    .addComponent(buttonCadastrarFuncionario))
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

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        String nome = textFielNomeFuncionario.getText();
        String dataNascimento = textFieldDataNascimentoFuncionario.getText();
        String cpf = textFieldCPFFuncionario.getText();
        String telefone = textFieldTelefoneFuncionario.getText();
        String endereco = textFieldEnderecoFuncionario.getText();
        String cep = textFieldCEPFuncionario.getText();
        String email = textFieldEmailFuncionario.getText();
        String senha = textFieldSenhaFuncionario.getText();

        if (new LocadoraController().verificaCadastrarFuncionario(nome, cpf, dataNascimento, email, endereco,  cep, telefone, senha))
        {
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!");
            ListaFuncionarios novatela = new ListaFuncionarios();
            novatela.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cadastro inválido!");
        }
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed

    private void buttonRetornarCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarCadastrarFuncionarioActionPerformed
        ListaFuncionarios novatela = new ListaFuncionarios();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarCadastrarFuncionarioActionPerformed


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
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonRetornarCadastrarFuncionario;
    private javax.swing.JLabel labelCEPFuncionario;
    private javax.swing.JLabel labelCPFFuncionario;
    private javax.swing.JLabel labelCadastrarFuncionario;
    private javax.swing.JLabel labelDataNascimentoFuncionario;
    private javax.swing.JLabel labelEmailFuncionario;
    private javax.swing.JLabel labelEnderecoFuncionario;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelSenhaFuncionario;
    private javax.swing.JLabel labelTelefoneFuncionario;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteCadastrarFuncionario;
    private javax.swing.JTextField textFielNomeFuncionario;
    private javax.swing.JFormattedTextField textFieldCEPFuncionario;
    private javax.swing.JFormattedTextField textFieldCPFFuncionario;
    private javax.swing.JFormattedTextField textFieldDataNascimentoFuncionario;
    private javax.swing.JTextField textFieldEmailFuncionario;
    private javax.swing.JTextField textFieldEnderecoFuncionario;
    private javax.swing.JTextField textFieldSenhaFuncionario;
    private javax.swing.JFormattedTextField textFieldTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
