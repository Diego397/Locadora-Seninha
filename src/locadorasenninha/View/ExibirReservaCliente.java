package locadorasenninha.View;
import locadorasenninha.Model.Main;
import javax.swing.JOptionPane;

public class ExibirReservaCliente extends javax.swing.JFrame {

    String[] dados = new String[15];
    public ExibirReservaCliente() {
        initComponents();
        dados = Main.controller.exibirReserva(Main.numeroView);

        labelPainelModeloCarroExibirReservaCliente.setText(dados[0]);
        labelPainelPlacaExibirReservaCliente.setText(dados[1]);
        labelPainelCorExibirReservaCliente.setText(dados[2]);
        labelPainelCapacidadePassageirosExibirReservaCliente.setText(dados[5]);
        labelPainelCapacidadeBagagensExibirReservaCliente.setText(dados[6]);
        labelPainelTaxaDiariaExibirReservaCliente.setText(dados[3]);
        labelPainelTaxaDiariaAtrasoExibirReservaCliente.setText(dados[4]);
        labelPainelValorTotalDiariasExibirReservasCliente.setText(dados[7]);
        labelPainelTaxaTotalAtrasoExibirReservaCliente.setText(dados[8]);
        labelPainelValorTotalAluguelExibirReservaCliente.setText(dados[9]);
        labelPainelDataRetiradaExibirReservaCliente.setText(dados[10]);
        labelPainelDataDevolucaoExibirReservaCliente.setText(dados[12]);
        labelPainelStatusExibirReservaCliente.setText(dados[11]);
        labelPainelDevolvidoEmExibirReservaCliente.setText(dados[14]);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelExibirReservaCliente = new javax.swing.JLabel();
        painelSuporteExibirReservaCliente = new javax.swing.JPanel();
        labelModeloCarroCliente = new javax.swing.JLabel();
        painelModeloCarroCliente = new javax.swing.JPanel();
        labelPainelModeloCarroExibirReservaCliente = new javax.swing.JLabel();
        painelCorCliente = new javax.swing.JPanel();
        labelPainelCorExibirReservaCliente = new javax.swing.JLabel();
        labelPlacaCliente = new javax.swing.JLabel();
        painelPlacaCliente1 = new javax.swing.JPanel();
        labelPainelPlacaExibirReservaCliente = new javax.swing.JLabel();
        labelCorCliente = new javax.swing.JLabel();
        painelTaxaDiariaCliente = new javax.swing.JPanel();
        labelPainelTaxaDiariaExibirReservaCliente = new javax.swing.JLabel();
        painelTaxaDiariaAtrasoCliente = new javax.swing.JPanel();
        labelPainelTaxaDiariaAtrasoExibirReservaCliente = new javax.swing.JLabel();
        labelTaxaDiariaCliente = new javax.swing.JLabel();
        labelTaxaDiariaAtrasoCliente = new javax.swing.JLabel();
        labelTaxaTotalAtrasoCliente = new javax.swing.JLabel();
        painelStatusCliente = new javax.swing.JPanel();
        labelPainelStatusExibirReservaCliente = new javax.swing.JLabel();
        painelValorTotalDiariasCliente = new javax.swing.JPanel();
        labelPainelValorTotalDiariasExibirReservasCliente = new javax.swing.JLabel();
        labelValorTotalDiariasCliente = new javax.swing.JLabel();
        labelValorTotalAluguelCliente = new javax.swing.JLabel();
        painelValorTotalCliente = new javax.swing.JPanel();
        labelPainelValorTotalAluguelExibirReservaCliente = new javax.swing.JLabel();
        painelTaxaTotalAtrasoCliente = new javax.swing.JPanel();
        labelPainelTaxaTotalAtrasoExibirReservaCliente = new javax.swing.JLabel();
        labelStatusCliente = new javax.swing.JLabel();
        painelDataRetiradaCliente = new javax.swing.JPanel();
        labelPainelDataRetiradaExibirReservaCliente = new javax.swing.JLabel();
        painelDevolvidoEmCliente = new javax.swing.JPanel();
        labelPainelDevolvidoEmExibirReservaCliente = new javax.swing.JLabel();
        painelDataDevolucaoCliente = new javax.swing.JPanel();
        labelPainelDataDevolucaoExibirReservaCliente = new javax.swing.JLabel();
        labelDataDevolucaoCliente = new javax.swing.JLabel();
        labelDataRetiradaCliente = new javax.swing.JLabel();
        labelDevolvidoEmCliente = new javax.swing.JLabel();
        painelCapacidadePassageirosCliente = new javax.swing.JPanel();
        labelPainelCapacidadePassageirosExibirReservaCliente = new javax.swing.JLabel();
        painelCapacidadeBagagemCliente = new javax.swing.JPanel();
        labelPainelCapacidadeBagagensExibirReservaCliente = new javax.swing.JLabel();
        labelCapadidadePassageirosCliente = new javax.swing.JLabel();
        labelCapacidadeBagagemCliente = new javax.swing.JLabel();
        buttonRetornarExibirReservaCliente = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        labelExibirReservaCliente.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelExibirReservaCliente.setText("Exibindo sua reserva:");

        painelSuporteExibirReservaCliente.setBackground(new java.awt.Color(192, 2, 0));

        labelModeloCarroCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelModeloCarroCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelModeloCarroCliente.setText("Modelo do Carro:");

        painelModeloCarroCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelModeloCarroCliente.setPreferredSize(new java.awt.Dimension(230, 25));

        labelPainelModeloCarroExibirReservaCliente.setText("Modelo do Carro");

        javax.swing.GroupLayout painelModeloCarroClienteLayout = new javax.swing.GroupLayout(painelModeloCarroCliente);
        painelModeloCarroCliente.setLayout(painelModeloCarroClienteLayout);
        painelModeloCarroClienteLayout.setHorizontalGroup(
            painelModeloCarroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModeloCarroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelModeloCarroExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelModeloCarroClienteLayout.setVerticalGroup(
            painelModeloCarroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelModeloCarroExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCorCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCorExibirReservaCliente.setText("Cor");

        javax.swing.GroupLayout painelCorClienteLayout = new javax.swing.GroupLayout(painelCorCliente);
        painelCorCliente.setLayout(painelCorClienteLayout);
        painelCorClienteLayout.setHorizontalGroup(
            painelCorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCorExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCorClienteLayout.setVerticalGroup(
            painelCorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCorExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelPlacaCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPlacaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelPlacaCliente.setText("Placa:");

        painelPlacaCliente1.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelPlacaExibirReservaCliente.setText("Placa");

        javax.swing.GroupLayout painelPlacaCliente1Layout = new javax.swing.GroupLayout(painelPlacaCliente1);
        painelPlacaCliente1.setLayout(painelPlacaCliente1Layout);
        painelPlacaCliente1Layout.setHorizontalGroup(
            painelPlacaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlacaCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelPlacaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPlacaCliente1Layout.setVerticalGroup(
            painelPlacaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelPlacaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelCorCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCorCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCorCliente.setText("Cor:");

        painelTaxaDiariaCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaDiariaExibirReservaCliente.setText("Taxa Diária");

        javax.swing.GroupLayout painelTaxaDiariaClienteLayout = new javax.swing.GroupLayout(painelTaxaDiariaCliente);
        painelTaxaDiariaCliente.setLayout(painelTaxaDiariaClienteLayout);
        painelTaxaDiariaClienteLayout.setHorizontalGroup(
            painelTaxaDiariaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaDiariaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaDiariaClienteLayout.setVerticalGroup(
            painelTaxaDiariaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaDiariaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelTaxaDiariaAtrasoCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaDiariaAtrasoExibirReservaCliente.setText("Taxa Diária Atraso");

        javax.swing.GroupLayout painelTaxaDiariaAtrasoClienteLayout = new javax.swing.GroupLayout(painelTaxaDiariaAtrasoCliente);
        painelTaxaDiariaAtrasoCliente.setLayout(painelTaxaDiariaAtrasoClienteLayout);
        painelTaxaDiariaAtrasoClienteLayout.setHorizontalGroup(
            painelTaxaDiariaAtrasoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaDiariaAtrasoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelTaxaDiariaAtrasoClienteLayout.setVerticalGroup(
            painelTaxaDiariaAtrasoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTaxaDiariaAtrasoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaDiariaAtrasoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTaxaDiariaCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaCliente.setText("Taxa Diária:");

        labelTaxaDiariaAtrasoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaAtrasoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaAtrasoCliente.setText("Taxa Diária Atraso:");

        labelTaxaTotalAtrasoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaTotalAtrasoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaTotalAtrasoCliente.setText("Taxa Total de Atraso:");

        painelStatusCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelStatusExibirReservaCliente.setText("Status da Reserva");

        javax.swing.GroupLayout painelStatusClienteLayout = new javax.swing.GroupLayout(painelStatusCliente);
        painelStatusCliente.setLayout(painelStatusClienteLayout);
        painelStatusClienteLayout.setHorizontalGroup(
            painelStatusClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelStatusClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelStatusExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelStatusClienteLayout.setVerticalGroup(
            painelStatusClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelStatusExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelValorTotalDiariasCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelValorTotalDiariasExibirReservasCliente.setText("Valor total Diárias");

        javax.swing.GroupLayout painelValorTotalDiariasClienteLayout = new javax.swing.GroupLayout(painelValorTotalDiariasCliente);
        painelValorTotalDiariasCliente.setLayout(painelValorTotalDiariasClienteLayout);
        painelValorTotalDiariasClienteLayout.setHorizontalGroup(
            painelValorTotalDiariasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalDiariasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelValorTotalDiariasExibirReservasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelValorTotalDiariasClienteLayout.setVerticalGroup(
            painelValorTotalDiariasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelValorTotalDiariasExibirReservasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelValorTotalDiariasCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalDiariasCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalDiariasCliente.setText("Valor Total Diárias:");

        labelValorTotalAluguelCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalAluguelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalAluguelCliente.setText("Valor Total do Aluguel:");

        painelValorTotalCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelValorTotalAluguelExibirReservaCliente.setText("Total do Aluguel");

        javax.swing.GroupLayout painelValorTotalClienteLayout = new javax.swing.GroupLayout(painelValorTotalCliente);
        painelValorTotalCliente.setLayout(painelValorTotalClienteLayout);
        painelValorTotalClienteLayout.setHorizontalGroup(
            painelValorTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelValorTotalAluguelExibirReservaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelValorTotalClienteLayout.setVerticalGroup(
            painelValorTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelValorTotalAluguelExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelTaxaTotalAtrasoCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaTotalAtrasoExibirReservaCliente.setText("Taca Total de Atraso");

        javax.swing.GroupLayout painelTaxaTotalAtrasoClienteLayout = new javax.swing.GroupLayout(painelTaxaTotalAtrasoCliente);
        painelTaxaTotalAtrasoCliente.setLayout(painelTaxaTotalAtrasoClienteLayout);
        painelTaxaTotalAtrasoClienteLayout.setHorizontalGroup(
            painelTaxaTotalAtrasoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaTotalAtrasoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaTotalAtrasoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaTotalAtrasoClienteLayout.setVerticalGroup(
            painelTaxaTotalAtrasoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaTotalAtrasoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelStatusCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelStatusCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelStatusCliente.setText("Status:");

        painelDataRetiradaCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDataRetiradaExibirReservaCliente.setText("Data de Retirada");

        javax.swing.GroupLayout painelDataRetiradaClienteLayout = new javax.swing.GroupLayout(painelDataRetiradaCliente);
        painelDataRetiradaCliente.setLayout(painelDataRetiradaClienteLayout);
        painelDataRetiradaClienteLayout.setHorizontalGroup(
            painelDataRetiradaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataRetiradaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataRetiradaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataRetiradaClienteLayout.setVerticalGroup(
            painelDataRetiradaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataRetiradaExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelDevolvidoEmCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDevolvidoEmExibirReservaCliente.setText("Data da Devolução");

        javax.swing.GroupLayout painelDevolvidoEmClienteLayout = new javax.swing.GroupLayout(painelDevolvidoEmCliente);
        painelDevolvidoEmCliente.setLayout(painelDevolvidoEmClienteLayout);
        painelDevolvidoEmClienteLayout.setHorizontalGroup(
            painelDevolvidoEmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDevolvidoEmClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDevolvidoEmExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDevolvidoEmClienteLayout.setVerticalGroup(
            painelDevolvidoEmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDevolvidoEmExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelDataDevolucaoCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDataDevolucaoExibirReservaCliente.setText("Data de Devolução");

        javax.swing.GroupLayout painelDataDevolucaoClienteLayout = new javax.swing.GroupLayout(painelDataDevolucaoCliente);
        painelDataDevolucaoCliente.setLayout(painelDataDevolucaoClienteLayout);
        painelDataDevolucaoClienteLayout.setHorizontalGroup(
            painelDataDevolucaoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataDevolucaoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataDevolucaoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataDevolucaoClienteLayout.setVerticalGroup(
            painelDataDevolucaoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataDevolucaoExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelDataDevolucaoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDevolucaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataDevolucaoCliente.setText("Data para Devolução:");

        labelDataRetiradaCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataRetiradaCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataRetiradaCliente.setText("Data de Retirada:");

        labelDevolvidoEmCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDevolvidoEmCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDevolvidoEmCliente.setText("Devolvido em:");

        painelCapacidadePassageirosCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapacidadePassageirosExibirReservaCliente.setText("Capacidade de Passageiros");

        javax.swing.GroupLayout painelCapacidadePassageirosClienteLayout = new javax.swing.GroupLayout(painelCapacidadePassageirosCliente);
        painelCapacidadePassageirosCliente.setLayout(painelCapacidadePassageirosClienteLayout);
        painelCapacidadePassageirosClienteLayout.setHorizontalGroup(
            painelCapacidadePassageirosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapacidadePassageirosExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCapacidadePassageirosClienteLayout.setVerticalGroup(
            painelCapacidadePassageirosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCapacidadePassageirosExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelCapacidadeBagagemCliente.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapacidadeBagagensExibirReservaCliente.setText("Capacidade de Bagagens");

        javax.swing.GroupLayout painelCapacidadeBagagemClienteLayout = new javax.swing.GroupLayout(painelCapacidadeBagagemCliente);
        painelCapacidadeBagagemCliente.setLayout(painelCapacidadeBagagemClienteLayout);
        painelCapacidadeBagagemClienteLayout.setHorizontalGroup(
            painelCapacidadeBagagemClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeBagagemClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapacidadeBagagensExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCapacidadeBagagemClienteLayout.setVerticalGroup(
            painelCapacidadeBagagemClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCapacidadeBagagensExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelCapadidadePassageirosCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapadidadePassageirosCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCapadidadePassageirosCliente.setText("Capacidade de Passageiros:");

        labelCapacidadeBagagemCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeBagagemCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCapacidadeBagagemCliente.setText("Capacidade de Bagagens:");

        javax.swing.GroupLayout painelSuporteExibirReservaClienteLayout = new javax.swing.GroupLayout(painelSuporteExibirReservaCliente);
        painelSuporteExibirReservaCliente.setLayout(painelSuporteExibirReservaClienteLayout);
        painelSuporteExibirReservaClienteLayout.setHorizontalGroup(
            painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelModeloCarroCliente)
                                    .addComponent(painelModeloCarroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelPlacaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPlacaCliente)
                                    .addComponent(labelCapacidadeBagagemCliente)
                                    .addComponent(painelCapacidadeBagagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(painelDataDevolucaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataDevolucaoCliente)
                            .addComponent(painelCapacidadePassageirosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataRetiradaCliente)
                            .addComponent(painelDataRetiradaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDevolvidoEmCliente)
                            .addComponent(painelDevolvidoEmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(painelTaxaTotalAtrasoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(painelValorTotalDiariasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(22, 22, 22)
                                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                                                .addComponent(labelTaxaDiariaAtrasoCliente)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                            .addComponent(painelTaxaDiariaAtrasoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(116, 116, 116))
                                                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(labelTaxaDiariaCliente)
                                                            .addComponent(painelTaxaDiariaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(painelCorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelValorTotalDiariasCliente)
                                                    .addComponent(labelTaxaTotalAtrasoCliente))
                                                .addGap(56, 56, 56)
                                                .addComponent(painelStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addContainerGap())
                                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                        .addComponent(labelCorCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelStatusCliente)
                                        .addGap(149, 149, 149))))
                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(painelValorTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addComponent(labelCapadidadePassageirosCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelValorTotalAluguelCliente)
                        .addGap(230, 230, 230))))
        );
        painelSuporteExibirReservaClienteLayout.setVerticalGroup(
            painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModeloCarroCliente)
                    .addComponent(labelPlacaCliente)
                    .addComponent(labelCorCliente)
                    .addComponent(labelStatusCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelPlacaCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelCorCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelModeloCarroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapadidadePassageirosCliente)
                    .addComponent(labelCapacidadeBagagemCliente)
                    .addComponent(labelValorTotalAluguelCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCapacidadePassageirosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelCapacidadeBagagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDataRetiradaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDataRetiradaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(labelDataDevolucaoCliente))
                    .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addComponent(painelValorTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelValorTotalDiariasCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(painelValorTotalDiariasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelTaxaDiariaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(painelTaxaDiariaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addComponent(painelDataDevolucaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDevolvidoEmCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteExibirReservaClienteLayout.createSequentialGroup()
                        .addGroup(painelSuporteExibirReservaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTaxaTotalAtrasoCliente)
                            .addComponent(labelTaxaDiariaAtrasoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTaxaTotalAtrasoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelTaxaDiariaAtrasoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDevolvidoEmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        buttonRetornarExibirReservaCliente.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarExibirReservaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarExibirReservaCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarExibirReservaCliente.setText("RETORNAR");
        buttonRetornarExibirReservaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarExibirReservaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelSuporteExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelExibirReservaCliente)
                            .addComponent(buttonRetornarExibirReservaCliente))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(labelExibirReservaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporteExibirReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(buttonRetornarExibirReservaCliente)
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

    private void buttonRetornarExibirReservaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarExibirReservaClienteActionPerformed
        ReservasCliente novatela = new ReservasCliente();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarExibirReservaClienteActionPerformed


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
            java.util.logging.Logger.getLogger(ExibirReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirReservaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRetornarExibirReservaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelCapacidadeBagagemCliente;
    private javax.swing.JLabel labelCapadidadePassageirosCliente;
    private javax.swing.JLabel labelCorCliente;
    private javax.swing.JLabel labelDataDevolucaoCliente;
    private javax.swing.JLabel labelDataRetiradaCliente;
    private javax.swing.JLabel labelDevolvidoEmCliente;
    private javax.swing.JLabel labelExibirReservaCliente;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelModeloCarroCliente;
    private javax.swing.JLabel labelPainelCapacidadeBagagensExibirReservaCliente;
    private javax.swing.JLabel labelPainelCapacidadePassageirosExibirReservaCliente;
    private javax.swing.JLabel labelPainelCorExibirReservaCliente;
    private javax.swing.JLabel labelPainelDataDevolucaoExibirReservaCliente;
    private javax.swing.JLabel labelPainelDataRetiradaExibirReservaCliente;
    private javax.swing.JLabel labelPainelDevolvidoEmExibirReservaCliente;
    private javax.swing.JLabel labelPainelModeloCarroExibirReservaCliente;
    private javax.swing.JLabel labelPainelPlacaExibirReservaCliente;
    private javax.swing.JLabel labelPainelStatusExibirReservaCliente;
    private javax.swing.JLabel labelPainelTaxaDiariaAtrasoExibirReservaCliente;
    private javax.swing.JLabel labelPainelTaxaDiariaExibirReservaCliente;
    private javax.swing.JLabel labelPainelTaxaTotalAtrasoExibirReservaCliente;
    private javax.swing.JLabel labelPainelValorTotalAluguelExibirReservaCliente;
    private javax.swing.JLabel labelPainelValorTotalDiariasExibirReservasCliente;
    private javax.swing.JLabel labelPlacaCliente;
    private javax.swing.JLabel labelStatusCliente;
    private javax.swing.JLabel labelTaxaDiariaAtrasoCliente;
    private javax.swing.JLabel labelTaxaDiariaCliente;
    private javax.swing.JLabel labelTaxaTotalAtrasoCliente;
    private javax.swing.JLabel labelValorTotalAluguelCliente;
    private javax.swing.JLabel labelValorTotalDiariasCliente;
    private javax.swing.JPanel painelCapacidadeBagagemCliente;
    private javax.swing.JPanel painelCapacidadePassageirosCliente;
    private javax.swing.JPanel painelCorCliente;
    private javax.swing.JPanel painelDataDevolucaoCliente;
    private javax.swing.JPanel painelDataRetiradaCliente;
    private javax.swing.JPanel painelDevolvidoEmCliente;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelModeloCarroCliente;
    private javax.swing.JPanel painelPlacaCliente1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelStatusCliente;
    private javax.swing.JPanel painelSuporteExibirReservaCliente;
    private javax.swing.JPanel painelTaxaDiariaAtrasoCliente;
    private javax.swing.JPanel painelTaxaDiariaCliente;
    private javax.swing.JPanel painelTaxaTotalAtrasoCliente;
    private javax.swing.JPanel painelValorTotalCliente;
    private javax.swing.JPanel painelValorTotalDiariasCliente;
    // End of variables declaration//GEN-END:variables
}
