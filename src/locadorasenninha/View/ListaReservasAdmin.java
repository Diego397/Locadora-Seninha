//Model
package locadorasenninha.View;
import locadorasenninha.Model.Main;


import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

public class ListaReservasAdmin extends javax.swing.JFrame {
    
    DefaultTableModel dm;
    
    //Método construtor
    public ListaReservasAdmin(){
        initComponents();
        CreateColumns();
        String dados[][] = Main.controller.atualizaTabelaReservas();

        for(int i = 0; i< Main.controller.qtdeReservas(); i++){
            AdicionarDados(dados[i][0],dados[i][1], dados[i][2], dados[i][3], dados[i][14]);
        }
    }
    
    //Método que cria as colunas
    private void CreateColumns(){
        //Pegando o model
        dm =(DefaultTableModel) tableListaReservasAdmin.getModel();
        
        //Adicionando colunas
        dm.addColumn("Modelo do Carro");
        dm.addColumn("Retirada Prevista");
        dm.addColumn("Devolução Prevista");
        dm.addColumn("Nome do Cliente");
        dm.addColumn("Nº Reserva");
    }
    
    //Método que faz uma busca na tabela
    private void filter(String busca){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        tableListaReservasAdmin.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(busca.substring(0,1).toUpperCase().concat(busca.substring(1))));
    }
    
    //Método que adiciona os dados nas linhas da tabela
    private void AdicionarDados(String modelo,String retirada, String devolucao, String cliente, String numero){
        String[] rowData = {modelo,retirada,devolucao,cliente,numero};
        dm.addRow(rowData);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        labelLocadora = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaReservasAdmin = new javax.swing.JTable();
        textFieldListaReservasAdmin = new javax.swing.JTextField();
        buttonVoltarMenuListaReservasAdmin = new javax.swing.JButton();
        buttonNovaReservaListaReservasAdmin = new javax.swing.JButton();
        buttonCarregarDadosListaReservasAdmin = new javax.swing.JButton();
        labelListaReservasAdmin = new javax.swing.JLabel();
        labelFacaBuscaListaReservasAdmin = new javax.swing.JLabel();

        labelLocadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLocadora.setForeground(new java.awt.Color(255, 255, 255));
        labelLocadora.setText("LOCADORA SENNINHA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        painelLocadora.setBackground(new java.awt.Color(192, 2, 0));
        painelLocadora.setPreferredSize(new java.awt.Dimension(800, 40));

        labelLocadora1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLocadora1.setForeground(new java.awt.Color(255, 255, 255));
        labelLocadora1.setText("LOCADORA SENNINHA");

        javax.swing.GroupLayout painelLocadoraLayout = new javax.swing.GroupLayout(painelLocadora);
        painelLocadora.setLayout(painelLocadoraLayout);
        painelLocadoraLayout.setHorizontalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLocadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        tableListaReservasAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListaReservasAdmin.getTableHeader().setReorderingAllowed(false);
        tableListaReservasAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaReservasAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaReservasAdmin);

        textFieldListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        textFieldListaReservasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldListaReservasAdminActionPerformed(evt);
            }
        });
        textFieldListaReservasAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldListaReservasAdminKeyReleased(evt);
            }
        });

        buttonVoltarMenuListaReservasAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonVoltarMenuListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonVoltarMenuListaReservasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltarMenuListaReservasAdmin.setText("VOLTAR AO MENU");
        buttonVoltarMenuListaReservasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarMenuListaReservasAdminActionPerformed(evt);
            }
        });

        buttonNovaReservaListaReservasAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonNovaReservaListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonNovaReservaListaReservasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonNovaReservaListaReservasAdmin.setText("NOVA RESERVA");
        buttonNovaReservaListaReservasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaReservaListaReservasAdminActionPerformed(evt);
            }
        });

        buttonCarregarDadosListaReservasAdmin.setBackground(new java.awt.Color(192, 2, 0));
        buttonCarregarDadosListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        buttonCarregarDadosListaReservasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonCarregarDadosListaReservasAdmin.setText("CARREGAR DADOS");
        buttonCarregarDadosListaReservasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarregarDadosListaReservasAdminActionPerformed(evt);
            }
        });

        labelListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelListaReservasAdmin.setText("Lista de Reservas");

        labelFacaBuscaListaReservasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelFacaBuscaListaReservasAdmin.setText("Faça sua busca!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelListaReservasAdmin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonVoltarMenuListaReservasAdmin)
                                .addGap(85, 85, 85)
                                .addComponent(buttonCarregarDadosListaReservasAdmin)
                                .addGap(85, 85, 85)
                                .addComponent(buttonNovaReservaListaReservasAdmin)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFacaBuscaListaReservasAdmin)
                                    .addComponent(textFieldListaReservasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(214, 214, 214))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelListaReservasAdmin)
                .addGap(10, 10, 10)
                .addComponent(labelFacaBuscaListaReservasAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldListaReservasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovaReservaListaReservasAdmin)
                    .addComponent(buttonVoltarMenuListaReservasAdmin)
                    .addComponent(buttonCarregarDadosListaReservasAdmin))
                .addGap(28, 28, 28))
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
    }

    private void textFieldListaReservasAdminActionPerformed(java.awt.event.ActionEvent evt) {
    }

    //Método que faz a busca na tabela pelo texto digitado no textField
    private void textFieldListaReservasAdminKeyReleased(java.awt.event.KeyEvent evt) {
        String busca = textFieldListaReservasAdmin.getText().toLowerCase(); //convertendo para minúsculo
        filter(busca); //realizando a busca
    }

    //Botão que volta ao menu da Locadora
    private void buttonVoltarMenuListaReservasAdminActionPerformed(java.awt.event.ActionEvent evt) {
        MenuAdmin novatela = new MenuAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    //Botão que vai pra área de Nova Reserva
    private void buttonNovaReservaListaReservasAdminActionPerformed(java.awt.event.ActionEvent evt) {
        SelecioneClienteAdmin novatela = new SelecioneClienteAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    private void buttonCarregarDadosListaReservasAdminActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void tableListaReservasAdminMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Reserva Selecionada!");

        int index = tableListaReservasAdmin.getSelectedRow();
        TableModel model = tableListaReservasAdmin.getModel();
        Main.numeroView = (int)model.getValueAt(index,4);

        ExibirReservaAdmin novatela = new ExibirReservaAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaReservasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaReservasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaReservasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaReservasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaReservasAdmin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonCarregarDadosListaReservasAdmin;
    private javax.swing.JButton buttonNovaReservaListaReservasAdmin;
    private javax.swing.JButton buttonVoltarMenuListaReservasAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFacaBuscaListaReservasAdmin;
    private javax.swing.JLabel labelListaReservasAdmin;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelLocadora1;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JTable tableListaReservasAdmin;
    private javax.swing.JTextField textFieldListaReservasAdmin;
}
