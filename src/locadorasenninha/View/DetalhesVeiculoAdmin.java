package locadorasenninha.View;
import locadorasenninha.Model.Main;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class DetalhesVeiculoAdmin extends javax.swing.JFrame {

    String[] dados = new String[9];
    public DetalhesVeiculoAdmin() {
        initComponents();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String retirada = formato.format(Main.dataRetiradaView.getTime());
        String devolucao = formato.format(Main.dataDevolucaoView.getTime());

        dados = Main.controller.exibirCarroReserva(Main.placacarroView, retirada, devolucao);

        jLabel1.setText(dados[0]);
        jLabel2.setText(dados[1]);
        jLabel3.setText(dados[2]);
        jLabel4.setText(dados[3]);
        jLabel5.setText(dados[4]);
        jLabel6.setText(dados[5]);
        jLabel7.setText(dados[6]);
        jLabel8.setText(dados[7]);
        jLabel9.setText(dados[8]);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelDetalhesVeiculo = new javax.swing.JLabel();
        painelSuporteDetalhesVeiculo = new javax.swing.JPanel();
        labelModeloCarroDetalhesVeiculo = new javax.swing.JLabel();
        painelModeloCarroDetalhesVeiculo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        painelCorDetalhesVeiculo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelPlacaDetalhesVeiculo = new javax.swing.JLabel();
        painelPlacaDetalhesVeiculo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelCorDetalhesVeiculo = new javax.swing.JLabel();
        painelTaxaDiariaDetalhesVeiculo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        painelTaxaDiariaAtrasoDetalhesVeiculo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelTaxaDiariaDetalhesVeiculo = new javax.swing.JLabel();
        labelTaxaDiariaAtrasoDetalhesVeiculo = new javax.swing.JLabel();
        painelImagemCarroDetalhesVeiculo = new javax.swing.JPanel();
        labelImagemCarroDetalhesVeiculo = new javax.swing.JLabel();
        painelCapacidadePassageirosDetalhesVeiculo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        painelCapacidadeBagagemDetalhesVeiculo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelCapadidadePassageirosDetalhesVeiculo = new javax.swing.JLabel();
        labelCapacidadeBagagemDetalhesVeiculo = new javax.swing.JLabel();
        checkBoxConfirmarDetalhesVeiculo = new javax.swing.JCheckBox();
        buttonRetornarCatalogo = new javax.swing.JButton();
        painelDataDevolucaoDetalhesVeiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDataDevolucaoDetalhesVeiculo = new javax.swing.JLabel();
        painelDataRetiradaDetalhesVeiculo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelDataRetiradaDetalhesVeiculo = new javax.swing.JLabel();
        buttonFecharReserva = new javax.swing.JButton();

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
                .addContainerGap(554, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        labelDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelDetalhesVeiculo.setText("Detalhes do Veículo:");

        painelSuporteDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        labelModeloCarroDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelModeloCarroDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelModeloCarroDetalhesVeiculo.setText("Modelo do Carro:");

        painelModeloCarroDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        painelModeloCarroDetalhesVeiculo.setPreferredSize(new java.awt.Dimension(230, 25));

        jLabel3.setText("          ");

        javax.swing.GroupLayout painelModeloCarroDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelModeloCarroDetalhesVeiculo);
        painelModeloCarroDetalhesVeiculo.setLayout(painelModeloCarroDetalhesVeiculoLayout);
        painelModeloCarroDetalhesVeiculoLayout.setHorizontalGroup(
            painelModeloCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModeloCarroDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        painelModeloCarroDetalhesVeiculoLayout.setVerticalGroup(
            painelModeloCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelModeloCarroDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        painelCorDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("          ");

        javax.swing.GroupLayout painelCorDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCorDetalhesVeiculo);
        painelCorDetalhesVeiculo.setLayout(painelCorDetalhesVeiculoLayout);
        painelCorDetalhesVeiculoLayout.setHorizontalGroup(
            painelCorDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        painelCorDetalhesVeiculoLayout.setVerticalGroup(
            painelCorDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        labelPlacaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPlacaDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelPlacaDetalhesVeiculo.setText("Placa:");

        painelPlacaDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("            ");

        javax.swing.GroupLayout painelPlacaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelPlacaDetalhesVeiculo);
        painelPlacaDetalhesVeiculo.setLayout(painelPlacaDetalhesVeiculoLayout);
        painelPlacaDetalhesVeiculoLayout.setHorizontalGroup(
            painelPlacaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlacaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        painelPlacaDetalhesVeiculoLayout.setVerticalGroup(
            painelPlacaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPlacaDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        labelCorDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCorDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorDetalhesVeiculo.setText("Cor:");

        painelTaxaDiariaDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("           ");

        javax.swing.GroupLayout painelTaxaDiariaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelTaxaDiariaDetalhesVeiculo);
        painelTaxaDiariaDetalhesVeiculo.setLayout(painelTaxaDiariaDetalhesVeiculoLayout);
        painelTaxaDiariaDetalhesVeiculoLayout.setHorizontalGroup(
            painelTaxaDiariaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTaxaDiariaDetalhesVeiculoLayout.setVerticalGroup(
            painelTaxaDiariaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTaxaDiariaDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        painelTaxaDiariaAtrasoDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("           ");

        javax.swing.GroupLayout painelTaxaDiariaAtrasoDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelTaxaDiariaAtrasoDetalhesVeiculo);
        painelTaxaDiariaAtrasoDetalhesVeiculo.setLayout(painelTaxaDiariaAtrasoDetalhesVeiculoLayout);
        painelTaxaDiariaAtrasoDetalhesVeiculoLayout.setHorizontalGroup(
            painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTaxaDiariaAtrasoDetalhesVeiculoLayout.setVerticalGroup(
            painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        labelTaxaDiariaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaDetalhesVeiculo.setText("Taxa Diária:");

        labelTaxaDiariaAtrasoDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaAtrasoDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaAtrasoDetalhesVeiculo.setText("Taxa Diária Atraso:");

        painelImagemCarroDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelImagemCarroDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelImagemCarroDetalhesVeiculo);
        painelImagemCarroDetalhesVeiculo.setLayout(painelImagemCarroDetalhesVeiculoLayout);
        painelImagemCarroDetalhesVeiculoLayout.setHorizontalGroup(
            painelImagemCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        painelImagemCarroDetalhesVeiculoLayout.setVerticalGroup(
            painelImagemCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        labelImagemCarroDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelImagemCarroDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelImagemCarroDetalhesVeiculo.setText("Imagem do Carro:");

        painelCapacidadePassageirosDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("          ");

        javax.swing.GroupLayout painelCapacidadePassageirosDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCapacidadePassageirosDetalhesVeiculo);
        painelCapacidadePassageirosDetalhesVeiculo.setLayout(painelCapacidadePassageirosDetalhesVeiculoLayout);
        painelCapacidadePassageirosDetalhesVeiculoLayout.setHorizontalGroup(
            painelCapacidadePassageirosDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCapacidadePassageirosDetalhesVeiculoLayout.setVerticalGroup(
            painelCapacidadePassageirosDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCapacidadePassageirosDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        painelCapacidadeBagagemDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("          ");

        javax.swing.GroupLayout painelCapacidadeBagagemDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCapacidadeBagagemDetalhesVeiculo);
        painelCapacidadeBagagemDetalhesVeiculo.setLayout(painelCapacidadeBagagemDetalhesVeiculoLayout);
        painelCapacidadeBagagemDetalhesVeiculoLayout.setHorizontalGroup(
            painelCapacidadeBagagemDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeBagagemDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCapacidadeBagagemDetalhesVeiculoLayout.setVerticalGroup(
            painelCapacidadeBagagemDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCapacidadeBagagemDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        labelCapadidadePassageirosDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapadidadePassageirosDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCapadidadePassageirosDetalhesVeiculo.setText("N° Passageiros:");

        labelCapacidadeBagagemDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeBagagemDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCapacidadeBagagemDetalhesVeiculo.setText("Limite Bagagens:");

        checkBoxConfirmarDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxConfirmarDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxConfirmarDetalhesVeiculo.setText("Confirmar realização da reserva!");
        checkBoxConfirmarDetalhesVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxConfirmarDetalhesVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuporteDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelSuporteDetalhesVeiculo);
        painelSuporteDetalhesVeiculo.setLayout(painelSuporteDetalhesVeiculoLayout);
        painelSuporteDetalhesVeiculoLayout.setHorizontalGroup(
            painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModeloCarroDetalhesVeiculo)
                            .addComponent(painelModeloCarroDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlacaDetalhesVeiculo)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addComponent(painelPlacaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelImagemCarroDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelImagemCarroDetalhesVeiculo)))))
                    .addComponent(checkBoxConfirmarDetalhesVeiculo)
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addComponent(labelTaxaDiariaDetalhesVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTaxaDiariaAtrasoDetalhesVeiculo))
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(painelTaxaDiariaDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(painelCapacidadePassageirosDetalhesVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelCapadidadePassageirosDetalhesVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelCapacidadeBagagemDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(painelCapacidadeBagagemDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(painelTaxaDiariaAtrasoDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCorDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCorDetalhesVeiculo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSuporteDetalhesVeiculoLayout.setVerticalGroup(
            painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModeloCarroDetalhesVeiculo)
                    .addComponent(labelPlacaDetalhesVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelTaxaDiariaAtrasoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addComponent(painelCorDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTaxaDiariaAtrasoDetalhesVeiculo)
                            .addComponent(labelTaxaDiariaDetalhesVeiculo))
                        .addGap(3, 3, 3)
                        .addComponent(painelTaxaDiariaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelImagemCarroDetalhesVeiculo)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(painelPlacaDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelModeloCarroDetalhesVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCapacidadeBagagemDetalhesVeiculo)
                                    .addComponent(labelCapadidadePassageirosDetalhesVeiculo)
                                    .addComponent(labelCorDetalhesVeiculo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(painelCapacidadePassageirosDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(painelCapacidadeBagagemDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(painelImagemCarroDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(checkBoxConfirmarDetalhesVeiculo)
                .addContainerGap())
        );

        buttonRetornarCatalogo.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarCatalogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarCatalogo.setText("RETORNAR AO CATÁLOGO");
        buttonRetornarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarCatalogoActionPerformed(evt);
            }
        });

        painelDataDevolucaoDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("           ");

        javax.swing.GroupLayout painelDataDevolucaoDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelDataDevolucaoDetalhesVeiculo);
        painelDataDevolucaoDetalhesVeiculo.setLayout(painelDataDevolucaoDetalhesVeiculoLayout);
        painelDataDevolucaoDetalhesVeiculoLayout.setHorizontalGroup(
            painelDataDevolucaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataDevolucaoDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        painelDataDevolucaoDetalhesVeiculoLayout.setVerticalGroup(
            painelDataDevolucaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDataDevolucaoDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        labelDataDevolucaoDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDevolucaoDetalhesVeiculo.setForeground(new java.awt.Color(192, 2, 0));
        labelDataDevolucaoDetalhesVeiculo.setText("Data Retirada");

        painelDataRetiradaDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          ");

        javax.swing.GroupLayout painelDataRetiradaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelDataRetiradaDetalhesVeiculo);
        painelDataRetiradaDetalhesVeiculo.setLayout(painelDataRetiradaDetalhesVeiculoLayout);
        painelDataRetiradaDetalhesVeiculoLayout.setHorizontalGroup(
            painelDataRetiradaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataRetiradaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        painelDataRetiradaDetalhesVeiculoLayout.setVerticalGroup(
            painelDataRetiradaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDataRetiradaDetalhesVeiculoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        labelDataRetiradaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataRetiradaDetalhesVeiculo.setForeground(new java.awt.Color(192, 2, 0));
        labelDataRetiradaDetalhesVeiculo.setText("Data Devolução");

        buttonFecharReserva.setBackground(new java.awt.Color(192, 2, 0));
        buttonFecharReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonFecharReserva.setForeground(new java.awt.Color(255, 255, 255));
        buttonFecharReserva.setText("FECHAR RESERVA");
        buttonFecharReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharReservaActionPerformed(evt);
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
                    .addComponent(painelSuporteDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelDataDevolucaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataDevolucaoDetalhesVeiculo))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataRetiradaDetalhesVeiculo)
                            .addComponent(painelDataRetiradaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelDetalhesVeiculo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonRetornarCatalogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonFecharReserva)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDetalhesVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataDevolucaoDetalhesVeiculo)
                    .addComponent(labelDataRetiradaDetalhesVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelDataDevolucaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataRetiradaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSuporteDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarCatalogo)
                    .addComponent(buttonFecharReserva))
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

    private void buttonRetornarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarCatalogoActionPerformed
        SelecionarCarro novatela = new SelecionarCarro();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarCatalogoActionPerformed

    private void buttonFecharReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharReservaActionPerformed
        if (checkBoxConfirmarDetalhesVeiculo.isSelected()){
            
            if (Main.controller.fecharReserva(Main.placacarroView, Main.dataRetiradaView, Main.dataDevolucaoView));
			{
				JOptionPane.showMessageDialog(null, "Reserva Confirmada!"); 
                ListaReservasAdmin novatela = new ListaReservasAdmin();
                novatela.setVisible(true);
                this.setVisible(false); 
			}     

        }
        else{
           JOptionPane.showMessageDialog(null, "Confirme sua reserva!"); 
        }
            
    }//GEN-LAST:event_buttonFecharReservaActionPerformed

    private void checkBoxConfirmarDetalhesVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxConfirmarDetalhesVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxConfirmarDetalhesVeiculoActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesVeiculoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFecharReserva;
    private javax.swing.JButton buttonRetornarCatalogo;
    private javax.swing.JCheckBox checkBoxConfirmarDetalhesVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCapacidadeBagagemDetalhesVeiculo;
    private javax.swing.JLabel labelCapadidadePassageirosDetalhesVeiculo;
    private javax.swing.JLabel labelCorDetalhesVeiculo;
    private javax.swing.JLabel labelDataDevolucaoDetalhesVeiculo;
    private javax.swing.JLabel labelDataRetiradaDetalhesVeiculo;
    private javax.swing.JLabel labelDetalhesVeiculo;
    private javax.swing.JLabel labelImagemCarroDetalhesVeiculo;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelModeloCarroDetalhesVeiculo;
    private javax.swing.JLabel labelPlacaDetalhesVeiculo;
    private javax.swing.JLabel labelTaxaDiariaAtrasoDetalhesVeiculo;
    private javax.swing.JLabel labelTaxaDiariaDetalhesVeiculo;
    private javax.swing.JPanel painelCapacidadeBagagemDetalhesVeiculo;
    private javax.swing.JPanel painelCapacidadePassageirosDetalhesVeiculo;
    private javax.swing.JPanel painelCorDetalhesVeiculo;
    private javax.swing.JPanel painelDataDevolucaoDetalhesVeiculo;
    private javax.swing.JPanel painelDataRetiradaDetalhesVeiculo;
    private javax.swing.JPanel painelImagemCarroDetalhesVeiculo;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelModeloCarroDetalhesVeiculo;
    private javax.swing.JPanel painelPlacaDetalhesVeiculo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteDetalhesVeiculo;
    private javax.swing.JPanel painelTaxaDiariaAtrasoDetalhesVeiculo;
    private javax.swing.JPanel painelTaxaDiariaDetalhesVeiculo;
    // End of variables declaration//GEN-END:variables
}
