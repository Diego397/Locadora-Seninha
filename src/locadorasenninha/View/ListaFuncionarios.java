//Model
package locadorasenninha.View;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListaFuncionarios extends javax.swing.JFrame {

    DefaultTableModel dm;
    
    public ListaFuncionarios() {
        initComponents();
        CreateColumns();
    }

    //Método que cria as colunas
    private void CreateColumns(){
        //Pegando o model
        dm =(DefaultTableModel) tableListaFuncionarios.getModel();
        
        //Adicionando colunas
        dm.addColumn("Nome do Funcionario");
        dm.addColumn("CPF");
    }

    //Método que faz uma busca na tabela
    private void filter(String busca){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        
        tableListaFuncionarios.setRowSorter(tr);
        
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
        labelListaFuncionarios = new javax.swing.JLabel();
        buttonVoltarMenuListaFuncionarios = new javax.swing.JButton();
        buttonCadastrarFuncionarioListaFuncionarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaFuncionarios = new javax.swing.JTable();
        textFieldFacaBuscaListaFuncionarios = new javax.swing.JTextField();
        labelFacaBuscaListaFuncionarios = new javax.swing.JLabel();
        buttonCarregarDadosListaFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        labelListaFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelListaFuncionarios.setText("Lista de Funcionários");

        buttonVoltarMenuListaFuncionarios.setBackground(new java.awt.Color(192, 2, 0));
        buttonVoltarMenuListaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonVoltarMenuListaFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltarMenuListaFuncionarios.setText("VOLTAR AO MENU");
        buttonVoltarMenuListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarMenuListaFuncionariosActionPerformed(evt);
            }
        });

        buttonCadastrarFuncionarioListaFuncionarios.setBackground(new java.awt.Color(192, 2, 0));
        buttonCadastrarFuncionarioListaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonCadastrarFuncionarioListaFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarFuncionarioListaFuncionarios.setText("CADASTRAR FUNCIONÁRIO");
        buttonCadastrarFuncionarioListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioListaFuncionariosActionPerformed(evt);
            }
        });

        tableListaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaFuncionarios);

        textFieldFacaBuscaListaFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldFacaBuscaListaFuncionariosKeyReleased(evt);
            }
        });

        labelFacaBuscaListaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelFacaBuscaListaFuncionarios.setText("Faça sua busca!");

        buttonCarregarDadosListaFuncionarios.setBackground(new java.awt.Color(192, 2, 0));
        buttonCarregarDadosListaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonCarregarDadosListaFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        buttonCarregarDadosListaFuncionarios.setText("CARREGAR DADOS");
        buttonCarregarDadosListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarregarDadosListaFuncionariosActionPerformed(evt);
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
                        .addComponent(labelListaFuncionarios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 129, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonVoltarMenuListaFuncionarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCarregarDadosListaFuncionarios)
                                .addGap(48, 48, 48)
                                .addComponent(buttonCadastrarFuncionarioListaFuncionarios))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFacaBuscaListaFuncionarios)
                    .addComponent(textFieldFacaBuscaListaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelListaFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(labelFacaBuscaListaFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldFacaBuscaListaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltarMenuListaFuncionarios)
                    .addComponent(buttonCadastrarFuncionarioListaFuncionarios)
                    .addComponent(buttonCarregarDadosListaFuncionarios))
                .addGap(33, 33, 33))
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

    private void buttonVoltarMenuListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarMenuListaFuncionariosActionPerformed
        MenuAdmin novatela = new MenuAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonVoltarMenuListaFuncionariosActionPerformed

    private void tableListaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaFuncionariosMouseClicked
        JOptionPane.showMessageDialog(null, "Funcionário Selecionado!");
        ExibirFuncionario novatela = new ExibirFuncionario();
        novatela.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_tableListaFuncionariosMouseClicked

    private void buttonCarregarDadosListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarregarDadosListaFuncionariosActionPerformed
        AdicionarDados("Josue FODA","222.333.555-77");
        AdicionarDados("Diegao","123.456.789-00");
    }//GEN-LAST:event_buttonCarregarDadosListaFuncionariosActionPerformed

    private void textFieldFacaBuscaListaFuncionariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldFacaBuscaListaFuncionariosKeyReleased
        String busca = textFieldFacaBuscaListaFuncionarios.getText().toLowerCase(); //convertendo para minúsculo
        filter(busca); //realizando a busca
    }//GEN-LAST:event_textFieldFacaBuscaListaFuncionariosKeyReleased

    private void buttonCadastrarFuncionarioListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioListaFuncionariosActionPerformed
        CadastrarFuncionario novatela = new CadastrarFuncionario();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCadastrarFuncionarioListaFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarFuncionarioListaFuncionarios;
    private javax.swing.JButton buttonCarregarDadosListaFuncionarios;
    private javax.swing.JButton buttonVoltarMenuListaFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFacaBuscaListaFuncionarios;
    private javax.swing.JLabel labelListaFuncionarios;
    private javax.swing.JTable tableListaFuncionarios;
    private javax.swing.JTextField textFieldFacaBuscaListaFuncionarios;
    // End of variables declaration//GEN-END:variables
}
