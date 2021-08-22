//OK
package locadorasenninha.View;

public class TelaInicial extends javax.swing.JFrame {


    public TelaInicial() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        painelInicial = new javax.swing.JPanel();
        buttonLoginCliente = new javax.swing.JButton();
        buttonLoginFuncionario = new javax.swing.JButton();
        buttonLoginAdministrador = new javax.swing.JButton();
        labelIntro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        painelLocadora.setBackground(new java.awt.Color(192, 2, 0));

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

        painelInicial.setBackground(new java.awt.Color(192, 2, 0));
        painelInicial.setPreferredSize(new java.awt.Dimension(300, 200));

        buttonLoginCliente.setBackground(new java.awt.Color(255, 255, 255));
        buttonLoginCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLoginCliente.setForeground(new java.awt.Color(192, 2, 0));
        buttonLoginCliente.setText("Login como Cliente");
        buttonLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginClienteActionPerformed(evt);
            }
        });

        buttonLoginFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        buttonLoginFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLoginFuncionario.setForeground(new java.awt.Color(192, 2, 0));
        buttonLoginFuncionario.setText("Login como Funcionário");
        buttonLoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginFuncionarioActionPerformed(evt);
            }
        });

        buttonLoginAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        buttonLoginAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLoginAdministrador.setForeground(new java.awt.Color(192, 2, 0));
        buttonLoginAdministrador.setText("Login como Administrador");
        buttonLoginAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonLoginAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(buttonLoginFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLoginCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonLoginCliente)
                .addGap(18, 18, 18)
                .addComponent(buttonLoginFuncionario)
                .addGap(18, 18, 18)
                .addComponent(buttonLoginAdministrador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelIntro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelIntro.setText("Seja bem-vindo! Escolha sua forma de Login:");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIntro)
                    .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(labelIntro)
                .addGap(18, 18, 18)
                .addComponent(painelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginClienteActionPerformed
        TelaLoginCliente novatela = new TelaLoginCliente();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLoginClienteActionPerformed

    private void buttonLoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginFuncionarioActionPerformed
        TelaLoginFuncionario novatela = new TelaLoginFuncionario();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLoginFuncionarioActionPerformed

    private void buttonLoginAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginAdministradorActionPerformed
        TelaLoginAdmin novatela = new TelaLoginAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLoginAdministradorActionPerformed


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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLoginAdministrador;
    private javax.swing.JButton buttonLoginCliente;
    private javax.swing.JButton buttonLoginFuncionario;
    private javax.swing.JLabel labelIntro;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
