//Receber os dados da Model
package locadorasenninha.View;

public class MenuAdmin extends javax.swing.JFrame {


    public MenuAdmin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        painelInicial = new javax.swing.JPanel();
        buttonGerenciarReservas = new javax.swing.JButton();
        buttonGerenciarClientes = new javax.swing.JButton();
        buttonGerenciarFuncionarios = new javax.swing.JButton();
        buttonCadastrarCarro = new javax.swing.JButton();
        labelMenuAdmin = new javax.swing.JLabel();
        buttonRetornarMenuAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

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

        buttonGerenciarFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGerenciarFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGerenciarFuncionarios.setForeground(new java.awt.Color(192, 2, 0));
        buttonGerenciarFuncionarios.setText("Gerenciar Funcionários");
        buttonGerenciarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciarFuncionariosActionPerformed(evt);
            }
        });

        buttonCadastrarCarro.setBackground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCadastrarCarro.setForeground(new java.awt.Color(192, 2, 0));
        buttonCadastrarCarro.setText("Cadastrar Carro");
        buttonCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGerenciarFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(buttonGerenciarClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGerenciarReservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCadastrarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGerenciarReservas)
                .addGap(18, 18, 18)
                .addComponent(buttonGerenciarClientes)
                .addGap(18, 18, 18)
                .addComponent(buttonGerenciarFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(buttonCadastrarCarro)
                .addContainerGap())
        );

        labelMenuAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMenuAdmin.setText("Menu da Administração");

        buttonRetornarMenuAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarMenuAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarMenuAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarMenuAdmin.setText("SAIR");
        buttonRetornarMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarMenuAdminActionPerformed(evt);
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
                            .addComponent(labelMenuAdmin)
                            .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonRetornarMenuAdmin)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(labelMenuAdmin)
                .addGap(18, 18, 18)
                .addComponent(painelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(buttonRetornarMenuAdmin)
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
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGerenciarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarReservasActionPerformed
        ListaReservasAdmin novatela = new ListaReservasAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGerenciarReservasActionPerformed

    private void buttonRetornarMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarMenuAdminActionPerformed
        TelaLoginAdmin novatela = new TelaLoginAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarMenuAdminActionPerformed

    private void buttonGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarClientesActionPerformed
        ListaClientesAdmin novatela = new ListaClientesAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGerenciarClientesActionPerformed

    private void buttonGerenciarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarFuncionariosActionPerformed
        ListaFuncionarios novatela = new ListaFuncionarios();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGerenciarFuncionariosActionPerformed

    private void buttonCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarCarroActionPerformed
        CadastrarVeiculo novatela = new CadastrarVeiculo();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCadastrarCarroActionPerformed


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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarCarro;
    private javax.swing.JButton buttonGerenciarClientes;
    private javax.swing.JButton buttonGerenciarFuncionarios;
    private javax.swing.JButton buttonGerenciarReservas;
    private javax.swing.JButton buttonRetornarMenuAdmin;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelMenuAdmin;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
