//Model
package locadorasenninha.View;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ListaClientesAdmin extends javax.swing.JFrame {

    DefaultTableModel dm;
    
    public ListaClientesAdmin() {
        initComponents();
        CreateColumns();
    }
    
    //Método que cria as colunas
    private void CreateColumns(){
        //Pegando o model
        dm =(DefaultTableModel) tableListaClientesAdmin.getModel();
        
        //Adicionando colunas
        dm.addColumn("Nome do Cliente");
        dm.addColumn("CPF");
    }

    //Método que faz uma busca na tabela
    private void filter(String busca){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        
        tableListaClientesAdmin.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(busca.substring(0,1).toUpperCase().concat(busca.substring(1))));
    }
    
    //Método que adiciona os dados nas linhas da tabela
    private void AdicionarDados(String nome,String cpf){
        String[] rowData = {nome,cpf};
        dm.addRow(rowData);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelListaClientesAdmin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaClientesAdmin = new javax.swing.JTable();
        buttonVoltarMenuListaClientesAdmin = new javax.swing.JButton();
        buttonCarregarDadosListaClientesAdmin = new javax.swing.JButton();
        textFieldFacaBuscaListaClientesAdmin = new javax.swing.JTextField();
        labelFacaBuscaListaClientesAdmin = new javax.swing.JLabel();
        buttonCadastrarClienteListaClientesAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(192, 2, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOCADORA SENNINHA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelListaClientesAdmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelListaClientesAdmin.setText("Lista de Clientes");

        tableListaClientesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListaClientesAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaClientesAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaClientesAdmin);

        buttonVoltarMenuListaClientesAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonVoltarMenuListaClientesAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonVoltarMenuListaClientesAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltarMenuListaClientesAdmin.setText("VOLTAR AO MENU");
        buttonVoltarMenuListaClientesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarMenuListaClientesAdminActionPerformed(evt);
            }
        });

        buttonCarregarDadosListaClientesAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonCarregarDadosListaClientesAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonCarregarDadosListaClientesAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonCarregarDadosListaClientesAdmin.setText("CARREGAR DADOS");
        buttonCarregarDadosListaClientesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarregarDadosListaClientesAdminActionPerformed(evt);
            }
        });

        textFieldFacaBuscaListaClientesAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldFacaBuscaListaClientesAdminKeyReleased(evt);
            }
        });

        labelFacaBuscaListaClientesAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelFacaBuscaListaClientesAdmin.setText("Faça sua busca!");

        buttonCadastrarClienteListaClientesAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonCadastrarClienteListaClientesAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonCadastrarClienteListaClientesAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarClienteListaClientesAdmin.setText("CADASTRAR CLIENTE");
        buttonCadastrarClienteListaClientesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarClienteListaClientesAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelListaClientesAdmin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 149, Short.MAX_VALUE)
                        .addComponent(buttonVoltarMenuListaClientesAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(buttonCarregarDadosListaClientesAdmin)
                        .addGap(50, 50, 50)
                        .addComponent(buttonCadastrarClienteListaClientesAdmin)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFacaBuscaListaClientesAdmin)
                                    .addComponent(textFieldFacaBuscaListaClientesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(247, 247, 247))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelListaClientesAdmin)
                .addGap(18, 18, 18)
                .addComponent(labelFacaBuscaListaClientesAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldFacaBuscaListaClientesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltarMenuListaClientesAdmin)
                    .addComponent(buttonCarregarDadosListaClientesAdmin)
                    .addComponent(buttonCadastrarClienteListaClientesAdmin))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void buttonVoltarMenuListaClientesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarMenuListaClientesAdminActionPerformed
        MenuAdmin novatela = new MenuAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonVoltarMenuListaClientesAdminActionPerformed

    private void tableListaClientesAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaClientesAdminMouseClicked
        JOptionPane.showMessageDialog(null, "Cliente Selecionado!");
        ExibirClienteAdmin novatela = new ExibirClienteAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tableListaClientesAdminMouseClicked

    private void textFieldFacaBuscaListaClientesAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldFacaBuscaListaClientesAdminKeyReleased
        String busca = textFieldFacaBuscaListaClientesAdmin.getText().toLowerCase(); //convertendo para minúsculo
        filter(busca); //realizando a busca
    }//GEN-LAST:event_textFieldFacaBuscaListaClientesAdminKeyReleased

    private void buttonCarregarDadosListaClientesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarregarDadosListaClientesAdminActionPerformed
        AdicionarDados("Marcão","222.333.555-77");
        AdicionarDados("Rei Sergio","123.456.789-00");
    }//GEN-LAST:event_buttonCarregarDadosListaClientesAdminActionPerformed

    private void buttonCadastrarClienteListaClientesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarClienteListaClientesAdminActionPerformed
        CadastrarClienteAdmin novatela = new CadastrarClienteAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCadastrarClienteListaClientesAdminActionPerformed


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
            java.util.logging.Logger.getLogger(ListaClientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarClienteListaClientesAdmin;
    private javax.swing.JButton buttonCarregarDadosListaClientesAdmin;
    private javax.swing.JButton buttonVoltarMenuListaClientesAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFacaBuscaListaClientesAdmin;
    private javax.swing.JLabel labelListaClientesAdmin;
    private javax.swing.JTable tableListaClientesAdmin;
    private javax.swing.JTextField textFieldFacaBuscaListaClientesAdmin;
    // End of variables declaration//GEN-END:variables
}
