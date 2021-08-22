//Model
package locadorasenninha.View;

import javax.swing.JOptionPane;

public class ExibirCliente extends javax.swing.JFrame {


    public ExibirCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelExibirCliente = new javax.swing.JLabel();
        painelSuporteExibirCliente = new javax.swing.JPanel();
        labelNomeCliente = new javax.swing.JLabel();
        painelNomeCliente = new javax.swing.JPanel();
        labelPainelNomeClienteExibirClienteFuncionario = new javax.swing.JLabel();
        labelDataNascimentoCliente = new javax.swing.JLabel();
        painelDataNascimentoCliente = new javax.swing.JPanel();
        labelPainelDataNascimentoClienteExibirClienteFuncionario = new javax.swing.JLabel();
        painelCPFCliente = new javax.swing.JPanel();
        labelPainelCPFClienteExibirClienteFuncionario = new javax.swing.JLabel();
        labelCPFCliente = new javax.swing.JLabel();
        painelTelefoneCliente = new javax.swing.JPanel();
        labelPainelTelefoneClienteExibirClienteFuncionario = new javax.swing.JLabel();
        labelTelefoneCliente = new javax.swing.JLabel();
        labelEnderecoCliente = new javax.swing.JLabel();
        painelEnderecoCliente = new javax.swing.JPanel();
        labelPainelEnderecoClienteExibirClienteFuncionario = new javax.swing.JLabel();
        painelCEPCliente = new javax.swing.JPanel();
        labelPainelCEPClienteExibirClienteFuncionario = new javax.swing.JLabel();
        labelCEPCliente = new javax.swing.JLabel();
        labelEmailCliente = new javax.swing.JLabel();
        painelEmailCliente = new javax.swing.JPanel();
        labelPainelEmailClienteExibirClienteFuncionario = new javax.swing.JLabel();
        painelSenhaCliente = new javax.swing.JPanel();
        labelPainelSenhaClienteExibirClienteFuncionario = new javax.swing.JLabel();
        labelSenhaCliente = new javax.swing.JLabel();
        buttonRetornarExibirCliente = new javax.swing.JButton();
        buttonRemoverCliente = new javax.swing.JButton();

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

        labelExibirCliente.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelExibirCliente.setText("Exibindo Cliente:");

        painelSuporteExibirCliente.setBackground(new java.awt.Color(192, 2, 0));

        labelNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeCliente.setText("Nome:");

        painelNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelNomeCliente.setPreferredSize(new java.awt.Dimension(100, 30));

        labelPainelNomeClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelNomeClienteExibirClienteFuncionario.setText("Nome do Cliente");

        javax.swing.GroupLayout painelNomeClienteLayout = new javax.swing.GroupLayout(painelNomeCliente);
        painelNomeCliente.setLayout(painelNomeClienteLayout);
        painelNomeClienteLayout.setHorizontalGroup(
            painelNomeClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelNomeClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelNomeClienteLayout.setVerticalGroup(
            painelNomeClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelNomeClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelDataNascimentoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataNascimentoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascimentoCliente.setText("Data de Nascimento:");

        painelDataNascimentoCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelDataNascimentoCliente.setPreferredSize(new java.awt.Dimension(100, 30));

        labelPainelDataNascimentoClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelDataNascimentoClienteExibirClienteFuncionario.setText("Data de Nascimento do Cliente");

        javax.swing.GroupLayout painelDataNascimentoClienteLayout = new javax.swing.GroupLayout(painelDataNascimentoCliente);
        painelDataNascimentoCliente.setLayout(painelDataNascimentoClienteLayout);
        painelDataNascimentoClienteLayout.setHorizontalGroup(
            painelDataNascimentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascimentoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataNascimentoClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataNascimentoClienteLayout.setVerticalGroup(
            painelDataNascimentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataNascimentoClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCPFCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCPFClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCPFClienteExibirClienteFuncionario.setText("CPF do Cliente");

        javax.swing.GroupLayout painelCPFClienteLayout = new javax.swing.GroupLayout(painelCPFCliente);
        painelCPFCliente.setLayout(painelCPFClienteLayout);
        painelCPFClienteLayout.setHorizontalGroup(
            painelCPFClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCPFClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCPFClienteLayout.setVerticalGroup(
            painelCPFClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCPFClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelCPFCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCPFCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCPFCliente.setText("CPF:");

        painelTelefoneCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTelefoneClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelTelefoneClienteExibirClienteFuncionario.setText("jLabel1");

        javax.swing.GroupLayout painelTelefoneClienteLayout = new javax.swing.GroupLayout(painelTelefoneCliente);
        painelTelefoneCliente.setLayout(painelTelefoneClienteLayout);
        painelTelefoneClienteLayout.setHorizontalGroup(
            painelTelefoneClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefoneClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTelefoneClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTelefoneClienteLayout.setVerticalGroup(
            painelTelefoneClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTelefoneClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneCliente.setText("Telefone:");

        labelEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoCliente.setText("Endereço:");

        painelEnderecoCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelEnderecoClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelEnderecoClienteExibirClienteFuncionario.setText("Endereço do Cliente");

        javax.swing.GroupLayout painelEnderecoClienteLayout = new javax.swing.GroupLayout(painelEnderecoCliente);
        painelEnderecoCliente.setLayout(painelEnderecoClienteLayout);
        painelEnderecoClienteLayout.setHorizontalGroup(
            painelEnderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelEnderecoClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelEnderecoClienteLayout.setVerticalGroup(
            painelEnderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelEnderecoClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCEPCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCEPClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCEPClienteExibirClienteFuncionario.setText("CEP do Cliente");

        javax.swing.GroupLayout painelCEPClienteLayout = new javax.swing.GroupLayout(painelCEPCliente);
        painelCEPCliente.setLayout(painelCEPClienteLayout);
        painelCEPClienteLayout.setHorizontalGroup(
            painelCEPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCEPClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCEPClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCEPClienteLayout.setVerticalGroup(
            painelCEPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCEPClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelCEPCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCEPCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCEPCliente.setText("CEP:");

        labelEmailCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmailCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailCliente.setText("Email:");

        painelEmailCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelEmailClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelEmailClienteExibirClienteFuncionario.setText("Email do Cliente");

        javax.swing.GroupLayout painelEmailClienteLayout = new javax.swing.GroupLayout(painelEmailCliente);
        painelEmailCliente.setLayout(painelEmailClienteLayout);
        painelEmailClienteLayout.setHorizontalGroup(
            painelEmailClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelEmailClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelEmailClienteLayout.setVerticalGroup(
            painelEmailClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelEmailClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelSenhaCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelSenhaClienteExibirClienteFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelSenhaClienteExibirClienteFuncionario.setText("Senha do Cliente");

        javax.swing.GroupLayout painelSenhaClienteLayout = new javax.swing.GroupLayout(painelSenhaCliente);
        painelSenhaCliente.setLayout(painelSenhaClienteLayout);
        painelSenhaClienteLayout.setHorizontalGroup(
            painelSenhaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelSenhaClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelSenhaClienteLayout.setVerticalGroup(
            painelSenhaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelSenhaClienteExibirClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        labelSenhaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenhaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaCliente.setText("Senha de Acesso:");

        javax.swing.GroupLayout painelSuporteExibirClienteLayout = new javax.swing.GroupLayout(painelSuporteExibirCliente);
        painelSuporteExibirCliente.setLayout(painelSuporteExibirClienteLayout);
        painelSuporteExibirClienteLayout.setHorizontalGroup(
            painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEnderecoCliente)
                                    .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDataNascimentoCliente)
                                            .addComponent(labelNomeCliente)
                                            .addComponent(painelDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(126, 126, 126)
                                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(painelCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCPFCliente))))
                                .addGap(67, 67, 67))
                            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                                .addComponent(painelEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(71, 71, 71)))
                        .addGap(13, 13, 13)
                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCEPCliente)
                                    .addComponent(labelTelefoneCliente))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(painelCEPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                                .addComponent(labelEmailCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(painelEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenhaCliente)
                            .addComponent(painelSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelSuporteExibirClienteLayout.setVerticalGroup(
            painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteExibirClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimentoCliente)
                    .addComponent(labelCPFCliente)
                    .addComponent(labelTelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDataNascimentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoCliente)
                    .addComponent(labelCEPCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCEPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailCliente)
                    .addComponent(labelSenhaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelSenhaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        buttonRetornarExibirCliente.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarExibirCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarExibirCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarExibirCliente.setText("RETORNAR");
        buttonRetornarExibirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarExibirClienteActionPerformed(evt);
            }
        });

        buttonRemoverCliente.setBackground(new java.awt.Color(192, 2, 0));
        buttonRemoverCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRemoverCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoverCliente.setText("REMOVER CLIENTE");
        buttonRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverClienteActionPerformed(evt);
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
                        .addComponent(labelExibirCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelSuporteExibirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(buttonRetornarExibirCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRemoverCliente)))
                        .addContainerGap())))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(labelExibirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteExibirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarExibirCliente)
                    .addComponent(buttonRemoverCliente))
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

    private void buttonRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverClienteActionPerformed
        JOptionPane.showMessageDialog(null, "Cliente Removido!");
        ListaClientes novatela = new ListaClientes();
        novatela.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_buttonRemoverClienteActionPerformed

    private void buttonRetornarExibirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarExibirClienteActionPerformed
        ListaClientes novatela = new ListaClientes();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarExibirClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRemoverCliente;
    private javax.swing.JButton buttonRetornarExibirCliente;
    private javax.swing.JLabel labelCEPCliente;
    private javax.swing.JLabel labelCPFCliente;
    private javax.swing.JLabel labelDataNascimentoCliente;
    private javax.swing.JLabel labelEmailCliente;
    private javax.swing.JLabel labelEnderecoCliente;
    private javax.swing.JLabel labelExibirCliente;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelPainelCEPClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelCPFClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelDataNascimentoClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelEmailClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelEnderecoClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelNomeClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelSenhaClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelPainelTelefoneClienteExibirClienteFuncionario;
    private javax.swing.JLabel labelSenhaCliente;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JPanel painelCEPCliente;
    private javax.swing.JPanel painelCPFCliente;
    private javax.swing.JPanel painelDataNascimentoCliente;
    private javax.swing.JPanel painelEmailCliente;
    private javax.swing.JPanel painelEnderecoCliente;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelNomeCliente;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSenhaCliente;
    private javax.swing.JPanel painelSuporteExibirCliente;
    private javax.swing.JPanel painelTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
