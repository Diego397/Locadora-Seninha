//falta
package locadorasenninha.View;

import javax.swing.JOptionPane;
import locadorasenninha.Model.Main;

public class CadastrarVeiculo extends javax.swing.JFrame {

    public CadastrarVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonRetornarCadastrarCarro = new javax.swing.JButton();
        buttonCadastrarCarro = new javax.swing.JButton();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelCadastraCarro = new javax.swing.JLabel();
        painelSuporteCadastrarCliente = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        labelChassi = new javax.swing.JLabel();
        textFielModelo = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        textFielChassi = new javax.swing.JTextField();
        textFielCor = new javax.swing.JTextField();
        labelCor = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        textFielPassageiros = new javax.swing.JTextField();
        labelPassageiros = new javax.swing.JLabel();
        textFielBagagem = new javax.swing.JTextField();
        labelBagagem = new javax.swing.JLabel();
        textFielDiaria = new javax.swing.JTextField();
        labelDiaria = new javax.swing.JLabel();
        labelAtraso = new javax.swing.JLabel();
        textFielAtraso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonRetornarCadastrarCarro.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarCadastrarCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarCadastrarCarro.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarCadastrarCarro.setText("RETORNAR");
        buttonRetornarCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarCadastrarCarroActionPerformed(evt);
            }
        });

        buttonCadastrarCarro.setBackground(new java.awt.Color(192, 2, 0));
        buttonCadastrarCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCadastrarCarro.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCarro.setText("CADASTRAR CARRO");
        buttonCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCarroActionPerformed(evt);
            }
        });

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

        labelCadastraCarro.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelCadastraCarro.setText("Cadastrar Carro:");

        painelSuporteCadastrarCliente.setBackground(new java.awt.Color(192, 2, 0));

        labelModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 255, 255));
        labelModelo.setText("Modelo:");

        labelChassi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelChassi.setForeground(new java.awt.Color(255, 255, 255));
        labelChassi.setText("Chassi");

        labelPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(255, 255, 255));
        labelPlaca.setText("Placa");

        labelCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCor.setForeground(new java.awt.Color(255, 255, 255));
        labelCor.setText("Cor");

        labelPassageiros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPassageiros.setForeground(new java.awt.Color(255, 255, 255));
        labelPassageiros.setText("Nº Passageiros");

        labelBagagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBagagem.setForeground(new java.awt.Color(255, 255, 255));
        labelBagagem.setText("Bagagem");

        labelDiaria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDiaria.setForeground(new java.awt.Color(255, 255, 255));
        labelDiaria.setText("Taxa Diária");

        labelAtraso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAtraso.setForeground(new java.awt.Color(255, 255, 255));
        labelAtraso.setText("Taxa Atraso");

        javax.swing.GroupLayout painelSuporteCadastrarClienteLayout = new javax.swing.GroupLayout(painelSuporteCadastrarCliente);
        painelSuporteCadastrarCliente.setLayout(painelSuporteCadastrarClienteLayout);
        painelSuporteCadastrarClienteLayout.setHorizontalGroup(
            painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFielModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModelo))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelChassi)
                                    .addComponent(textFielChassi, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(labelPlaca)
                                    .addComponent(textPlaca))
                                .addGap(28, 28, 28)
                                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCor)
                                    .addComponent(textFielCor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPassageiros)
                                            .addComponent(textFielPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelBagagem)
                                            .addComponent(textFielBagagem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDiaria)
                                    .addComponent(textFielDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAtraso)
                                    .addComponent(textFielAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelSuporteCadastrarClienteLayout.setVerticalGroup(
            painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(textFielModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelPlaca)
                                .addGap(36, 36, 36))
                            .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(labelCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFielCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                            .addComponent(labelChassi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textFielChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarClienteLayout.createSequentialGroup()
                            .addComponent(labelPassageiros)
                            .addGap(36, 36, 36))
                        .addComponent(textFielPassageiros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(labelBagagem)
                        .addGap(36, 36, 36))
                    .addComponent(textFielBagagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFielDiaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielAtraso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiaria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAtraso, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCadastraCarro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRetornarCadastrarCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarCarro)
                        .addContainerGap())))
            .addComponent(painelLocadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addComponent(painelSuporteCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(labelCadastraCarro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarCadastrarCarro)
                    .addComponent(buttonCadastrarCarro))
                .addContainerGap())
        );

        pack();
    }

    private void buttonRetornarCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {
        MenuAdmin novatela = new MenuAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    private void buttonCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {
        //Funcao Cadastrar Cliente.
        String modelo = textFielModelo.getText();
        String placa = textPlaca.getText();
        String cor = textFielCor.getText();
        String chassi = textFielChassi.getText();
        String passageiros = textFielPassageiros.getText();
        String bagagem = textFielBagagem.getText();
        double diaria = Double.parseDouble(textFielDiaria.getText());
        double atraso = Double.parseDouble(textFielAtraso.getText());

        if (Main.controller.verificaCadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, diaria,atraso))
        {
            JOptionPane.showMessageDialog(null, "Carro Cadastrado!");
            MenuAdmin novatela = new MenuAdmin();
            novatela.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cadastro inválido!");
        }

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
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarVeiculo().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonCadastrarCarro;
    private javax.swing.JButton buttonRetornarCadastrarCarro;
    private javax.swing.JLabel labelAtraso;
    private javax.swing.JLabel labelBagagem;
    private javax.swing.JLabel labelCadastraCarro;
    private javax.swing.JLabel labelChassi;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelDiaria;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPassageiros;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelSuporteCadastrarCliente;
    private javax.swing.JTextField textFielAtraso;
    private javax.swing.JTextField textFielBagagem;
    private javax.swing.JTextField textFielChassi;
    private javax.swing.JTextField textFielCor;
    private javax.swing.JTextField textFielDiaria;
    private javax.swing.JTextField textFielModelo;
    private javax.swing.JTextField textFielPassageiros;
    private javax.swing.JTextField textPlaca;
}