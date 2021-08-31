//Model
package locadorasenninha.View;

import javax.swing.JOptionPane;
import locadorasenninha.Model.Main;

public class ExibirFuncionario extends javax.swing.JFrame {
    String[] dados = new String[8];


    public ExibirFuncionario() {
        initComponents();
        dados = Main.controller.exibirFuncionario(Main.cpfView);
        labelPainelNomeFuncionario.setText(dados[0]);
        labelPainelDataNascimentoFuncionario.setText(dados[1]);
        labelPainelCPFFuncionario.setText(dados[2]);
        labelPainelTelefoneFuncionario.setText(dados[3]);
        labelPainelEnderecoFuncionario.setText(dados[4]);
        labelPainelCEPFuncionario.setText(dados[5]);
        labelPainelEmailFuncionario.setText(dados[6]);
        labelPainelSenhaFuncionario.setText(dados[7]);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelExibirFuncionario = new javax.swing.JLabel();
        painelSuporteExibirFuncionario = new javax.swing.JPanel();
        labelNomeFuncionario = new javax.swing.JLabel();
        painelNomeFuncionario = new javax.swing.JPanel();
        labelPainelNomeFuncionario = new javax.swing.JLabel();
        labelDataNascimentoFuncionario = new javax.swing.JLabel();
        painelDataNascimentoFuncionario = new javax.swing.JPanel();
        labelPainelDataNascimentoFuncionario = new javax.swing.JLabel();
        painelCPFFuncionario = new javax.swing.JPanel();
        labelPainelCPFFuncionario = new javax.swing.JLabel();
        labelCPFFuncionario = new javax.swing.JLabel();
        painelTelefoneFuncionario = new javax.swing.JPanel();
        labelPainelTelefoneFuncionario = new javax.swing.JLabel();
        labelTelefoneFuncionario = new javax.swing.JLabel();
        labelEnderecoFuncionario = new javax.swing.JLabel();
        painelEnderecoFuncionario = new javax.swing.JPanel();
        labelPainelEnderecoFuncionario = new javax.swing.JLabel();
        painelCEPFuncionario = new javax.swing.JPanel();
        labelPainelCEPFuncionario = new javax.swing.JLabel();
        labelCEPFuncionario = new javax.swing.JLabel();
        labelEmailFuncionario = new javax.swing.JLabel();
        painelEmailFuncionario = new javax.swing.JPanel();
        labelPainelEmailFuncionario = new javax.swing.JLabel();
        painelSenhaFuncionario = new javax.swing.JPanel();
        labelPainelSenhaFuncionario = new javax.swing.JLabel();
        labelSenhaFuncionario = new javax.swing.JLabel();
        buttonRetornarExibirFuncionario = new javax.swing.JButton();
        buttonRemoverFuncionario = new javax.swing.JButton();

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
                .addContainerGap(558, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        labelExibirFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelExibirFuncionario.setText("Exibindo Funcionario:");

        painelSuporteExibirFuncionario.setBackground(new java.awt.Color(192, 2, 0));

        labelNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeFuncionario.setText("Nome:");

        painelNomeFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelNomeFuncionario.setPreferredSize(new java.awt.Dimension(100, 30));

        labelPainelNomeFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelNomeFuncionario.setText("Nome do Funcionario");

        javax.swing.GroupLayout painelNomeFuncionarioLayout = new javax.swing.GroupLayout(painelNomeFuncionario);
        painelNomeFuncionario.setLayout(painelNomeFuncionarioLayout);
        painelNomeFuncionarioLayout.setHorizontalGroup(
            painelNomeFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelNomeFuncionarioLayout.setVerticalGroup(
            painelNomeFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelDataNascimentoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataNascimentoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascimentoFuncionario.setText("Data de Nascimento:");

        painelDataNascimentoFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelDataNascimentoFuncionario.setPreferredSize(new java.awt.Dimension(100, 30));

        labelPainelDataNascimentoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelDataNascimentoFuncionario.setText("Data Funcionario");

        javax.swing.GroupLayout painelDataNascimentoFuncionarioLayout = new javax.swing.GroupLayout(painelDataNascimentoFuncionario);
        painelDataNascimentoFuncionario.setLayout(painelDataNascimentoFuncionarioLayout);
        painelDataNascimentoFuncionarioLayout.setHorizontalGroup(
            painelDataNascimentoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascimentoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataNascimentoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataNascimentoFuncionarioLayout.setVerticalGroup(
            painelDataNascimentoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataNascimentoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCPFFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCPFFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCPFFuncionario.setText("CPF do Funcionário");

        javax.swing.GroupLayout painelCPFFuncionarioLayout = new javax.swing.GroupLayout(painelCPFFuncionario);
        painelCPFFuncionario.setLayout(painelCPFFuncionarioLayout);
        painelCPFFuncionarioLayout.setHorizontalGroup(
            painelCPFFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCPFFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCPFFuncionarioLayout.setVerticalGroup(
            painelCPFFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCPFFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelCPFFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCPFFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCPFFuncionario.setText("CPF:");

        painelTelefoneFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTelefoneFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelTelefoneFuncionario.setText("Telefone do Funcionário");

        javax.swing.GroupLayout painelTelefoneFuncionarioLayout = new javax.swing.GroupLayout(painelTelefoneFuncionario);
        painelTelefoneFuncionario.setLayout(painelTelefoneFuncionarioLayout);
        painelTelefoneFuncionarioLayout.setHorizontalGroup(
            painelTelefoneFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefoneFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTelefoneFuncionarioLayout.setVerticalGroup(
            painelTelefoneFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelTelefoneFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefoneFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneFuncionario.setText("Telefone:");

        labelEnderecoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnderecoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoFuncionario.setText("Endereço:");

        painelEnderecoFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelEnderecoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelEnderecoFuncionario.setText("Endereço do Funcionário");

        javax.swing.GroupLayout painelEnderecoFuncionarioLayout = new javax.swing.GroupLayout(painelEnderecoFuncionario);
        painelEnderecoFuncionario.setLayout(painelEnderecoFuncionarioLayout);
        painelEnderecoFuncionarioLayout.setHorizontalGroup(
            painelEnderecoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelEnderecoFuncionarioLayout.setVerticalGroup(
            painelEnderecoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCEPFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCEPFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCEPFuncionario.setText("CEP do Funcionário");

        javax.swing.GroupLayout painelCEPFuncionarioLayout = new javax.swing.GroupLayout(painelCEPFuncionario);
        painelCEPFuncionario.setLayout(painelCEPFuncionarioLayout);
        painelCEPFuncionarioLayout.setHorizontalGroup(
            painelCEPFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCEPFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCEPFuncionarioLayout.setVerticalGroup(
            painelCEPFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCEPFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelCEPFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCEPFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCEPFuncionario.setText("CEP:");

        labelEmailFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmailFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailFuncionario.setText("Email:");

        painelEmailFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelEmailFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelEmailFuncionario.setText("Email do Funcionário");

        javax.swing.GroupLayout painelEmailFuncionarioLayout = new javax.swing.GroupLayout(painelEmailFuncionario);
        painelEmailFuncionario.setLayout(painelEmailFuncionarioLayout);
        painelEmailFuncionarioLayout.setHorizontalGroup(
            painelEmailFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelEmailFuncionarioLayout.setVerticalGroup(
            painelEmailFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelSenhaFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelSenhaFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelSenhaFuncionario.setText("Senha do Funcionário");

        javax.swing.GroupLayout painelSenhaFuncionarioLayout = new javax.swing.GroupLayout(painelSenhaFuncionario);
        painelSenhaFuncionario.setLayout(painelSenhaFuncionarioLayout);
        painelSenhaFuncionarioLayout.setHorizontalGroup(
            painelSenhaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelSenhaFuncionarioLayout.setVerticalGroup(
            painelSenhaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelSenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaFuncionario.setText("Senha de Acesso:");

        javax.swing.GroupLayout painelSuporteExibirFuncionarioLayout = new javax.swing.GroupLayout(painelSuporteExibirFuncionario);
        painelSuporteExibirFuncionario.setLayout(painelSuporteExibirFuncionarioLayout);
        painelSuporteExibirFuncionarioLayout.setHorizontalGroup(
            painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeFuncionario)
                                    .addComponent(labelDataNascimentoFuncionario)
                                    .addComponent(painelDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCPFFuncionario))
                                .addGap(118, 118, 118))
                            .addGroup(painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEnderecoFuncionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCEPFuncionario)
                            .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelTelefoneFuncionario)
                                .addComponent(painelCEPFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelTelefoneFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelEmailFuncionario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(painelEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenhaFuncionario)
                            .addComponent(painelSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelSuporteExibirFuncionarioLayout.setVerticalGroup(
            painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteExibirFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimentoFuncionario)
                    .addComponent(labelCPFFuncionario)
                    .addComponent(labelTelefoneFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCPFFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDataNascimentoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoFuncionario)
                    .addComponent(labelCEPFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCEPFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailFuncionario)
                    .addComponent(labelSenhaFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        buttonRetornarExibirFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarExibirFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarExibirFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarExibirFuncionario.setText("RETORNAR");
        buttonRetornarExibirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarExibirFuncionarioActionPerformed(evt);
            }
        });

        buttonRemoverFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRemoverFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRemoverFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoverFuncionario.setText("TELA INICIAL");
        buttonRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelExibirFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelSuporteExibirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(buttonRetornarExibirFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRemoverFuncionario)))
                        .addContainerGap())))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(labelExibirFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteExibirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarExibirFuncionario)
                    .addComponent(buttonRemoverFuncionario))
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



    private void buttonRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
        TelaInicial novatela = new TelaInicial();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    private void buttonRetornarExibirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
        ListaFuncionarios novatela = new ListaFuncionarios();
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
            java.util.logging.Logger.getLogger(ExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirFuncionario().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonRemoverFuncionario;
    private javax.swing.JButton buttonRetornarExibirFuncionario;
    private javax.swing.JLabel labelCEPFuncionario;
    private javax.swing.JLabel labelCPFFuncionario;
    private javax.swing.JLabel labelDataNascimentoFuncionario;
    private javax.swing.JLabel labelEmailFuncionario;
    private javax.swing.JLabel labelEnderecoFuncionario;
    private javax.swing.JLabel labelExibirFuncionario;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelPainelCEPFuncionario;
    private javax.swing.JLabel labelPainelCPFFuncionario;
    private javax.swing.JLabel labelPainelDataNascimentoFuncionario;
    private javax.swing.JLabel labelPainelEmailFuncionario;
    private javax.swing.JLabel labelPainelEnderecoFuncionario;
    private javax.swing.JLabel labelPainelNomeFuncionario;
    private javax.swing.JLabel labelPainelSenhaFuncionario;
    private javax.swing.JLabel labelPainelTelefoneFuncionario;
    private javax.swing.JLabel labelSenhaFuncionario;
    private javax.swing.JLabel labelTelefoneFuncionario;
    private javax.swing.JPanel painelCEPFuncionario;
    private javax.swing.JPanel painelCPFFuncionario;
    private javax.swing.JPanel painelDataNascimentoFuncionario;
    private javax.swing.JPanel painelEmailFuncionario;
    private javax.swing.JPanel painelEnderecoFuncionario;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelNomeFuncionario;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSenhaFuncionario;
    private javax.swing.JPanel painelSuporteExibirFuncionario;
    private javax.swing.JPanel painelTelefoneFuncionario;
}
