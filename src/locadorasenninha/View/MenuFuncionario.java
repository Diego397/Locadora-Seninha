package locadorasenninha.View;

public class MenuFuncionario extends javax.swing.JFrame {

    public MenuFuncionario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        painelSuporteMenuFuncionarios = new javax.swing.JPanel();
        buttonGerenciarReservas = new javax.swing.JButton();
        buttonGerenciarClientes = new javax.swing.JButton();
        labelMenuFuncionarios = new javax.swing.JLabel();
        buttonRetornarMenuFuncionario = new javax.swing.JButton();

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

        painelSuporteMenuFuncionarios.setBackground(new java.awt.Color(192, 2, 0));
        painelSuporteMenuFuncionarios.setPreferredSize(new java.awt.Dimension(300, 200));

        buttonGerenciarReservas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGerenciarReservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGerenciarReservas.setForeground(new java.awt.Color(192, 2, 0));
        buttonGerenciarReservas.setText("Gerenciar Reservas");
        buttonGerenciarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciarReservasActionPerformed(evt);
            }
        });

        buttonGerenciarClientes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGerenciarClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGerenciarClientes.setForeground(new java.awt.Color(192, 2, 0));
        buttonGerenciarClientes.setText("Gerenciar Clientes");
        buttonGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuporteMenuFuncionariosLayout = new javax.swing.GroupLayout(painelSuporteMenuFuncionarios);
        painelSuporteMenuFuncionarios.setLayout(painelSuporteMenuFuncionariosLayout);
        painelSuporteMenuFuncionariosLayout.setHorizontalGroup(
            painelSuporteMenuFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteMenuFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteMenuFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonGerenciarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGerenciarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelSuporteMenuFuncionariosLayout.setVerticalGroup(
            painelSuporteMenuFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteMenuFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGerenciarReservas)
                .addGap(18, 18, 18)
                .addComponent(buttonGerenciarClientes)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        labelMenuFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMenuFuncionarios.setText("Menu de Funcionários");

        buttonRetornarMenuFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarMenuFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarMenuFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarMenuFuncionario.setText("SAIR");
        buttonRetornarMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarMenuFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMenuFuncionarios)
                            .addComponent(painelSuporteMenuFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonRetornarMenuFuncionario)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(labelMenuFuncionarios)
                .addGap(18, 18, 18)
                .addComponent(painelSuporteMenuFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(buttonRetornarMenuFuncionario)
                .addContainerGap())
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

    private void buttonGerenciarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarReservasActionPerformed
        ListaReservas novatela = new ListaReservas();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGerenciarReservasActionPerformed

    private void buttonRetornarMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarMenuFuncionarioActionPerformed
        TelaLoginFuncionario novatela = new TelaLoginFuncionario();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarMenuFuncionarioActionPerformed

    private void buttonGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarClientesActionPerformed
        ListaClientes novatela = new ListaClientes();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGerenciarClientesActionPerformed


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
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerenciarClientes;
    private javax.swing.JButton buttonGerenciarReservas;
    private javax.swing.JButton buttonRetornarMenuFuncionario;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelMenuFuncionarios;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteMenuFuncionarios;
    // End of variables declaration//GEN-END:variables
}
