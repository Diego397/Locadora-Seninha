package locadorasenninha.View;
import locadorasenninha.Model.Main;
import javax.swing.JOptionPane;

public class ExibirReservaAdmin extends javax.swing.JFrame {
    int num = Main.numeroView;
    String[] dados = new String[14];
    public ExibirReservaAdmin() {
        initComponents();
        dados = Main.controller.exibirReserva(Main.numeroView);

        labelPainelModeloCarroExibirReservaAdmin.setText(dados[0]);
        labelPainelPlacaAdminExibirReservaAdmin.setText(dados[1]);
        labelPainelCorExibirReservaAdmin.setText(dados[2]);
        labelPainelCapaceidadePassageirosExibirReservaAdmin.setText(dados[5]);
        labelPainelCapacidadeBagagensExibirReservaAdmin.setText(dados[6]);
        labelPainelTaxaDiariaExibirReservaAdmin.setText(dados[3]);
        labelPainelTaxaDiariaAtrasoExibirReservaAdmin.setText(dados[4]);
        labelPainelValorTotalDiariasExibirReservaAdmin.setText(dados[7]);
        labelPainelTaxaTotalAtrasoExibirReservaAdmin.setText(dados[8]);
        labelPainelValorTotalAluguelExibirReservaAdmin.setText(dados[9]);
        labelPainelDataRetiradaExibirReservaAdmin.setText(dados[10]);
        labelPainelDataDevolucaoExibirReservaAdmin.setText(dados[12]);
        labelPainelStatusExibirReservaAdmin.setText(dados[11]);
        labelPainelNumeroReservaExibirReservaAdmin.setText(dados[13]);
        labelPainelDevolvidoEmExibirReservaAdmin.setText(dados[14]);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelExibirReservaFuncionario = new javax.swing.JLabel();
        painelExibirReservaFuncionario = new javax.swing.JPanel();
        labelModeloCarroFuncionario = new javax.swing.JLabel();
        painelModeloCarroFuncionario = new javax.swing.JPanel();
        labelPainelModeloCarroExibirReservaAdmin = new javax.swing.JLabel();
        painelCorFuncionario = new javax.swing.JPanel();
        labelPainelCorExibirReservaAdmin = new javax.swing.JLabel();
        labelPlacaFuncionario = new javax.swing.JLabel();
        painelPlacaFuncionario = new javax.swing.JPanel();
        labelPainelPlacaAdminExibirReservaAdmin = new javax.swing.JLabel();
        labelCorFuncionario = new javax.swing.JLabel();
        painelTaxaDiariaFuncionario = new javax.swing.JPanel();
        labelPainelTaxaDiariaExibirReservaAdmin = new javax.swing.JLabel();
        painelTaxaDiariaAtrasoFuncionario = new javax.swing.JPanel();
        labelPainelTaxaDiariaAtrasoExibirReservaAdmin = new javax.swing.JLabel();
        labelTaxaDiariaFuncionario = new javax.swing.JLabel();
        labelTaxaDiariaAtrasoFuncionario = new javax.swing.JLabel();
        labelTaxaTotalAtrasoFuncionario = new javax.swing.JLabel();
        painelStatusFuncionario = new javax.swing.JPanel();
        labelPainelStatusExibirReservaAdmin = new javax.swing.JLabel();
        painelValorTotalDiariasFuncionario = new javax.swing.JPanel();
        labelPainelValorTotalDiariasExibirReservaAdmin = new javax.swing.JLabel();
        labelValorTotalDiariasFuncionario = new javax.swing.JLabel();
        labelValorTotalAluguelFuncionario = new javax.swing.JLabel();
        painelValorTotalFuncionario = new javax.swing.JPanel();
        labelPainelValorTotalAluguelExibirReservaAdmin = new javax.swing.JLabel();
        painelTaxaTotalAtrasoFuncionario = new javax.swing.JPanel();
        labelPainelTaxaTotalAtrasoExibirReservaAdmin = new javax.swing.JLabel();
        labelStatusFuncionario = new javax.swing.JLabel();
        painelDataRetiradaFuncionario = new javax.swing.JPanel();
        labelPainelDataRetiradaExibirReservaAdmin = new javax.swing.JLabel();
        painelDevolvidoEmFuncionario = new javax.swing.JPanel();
        labelPainelDevolvidoEmExibirReservaAdmin = new javax.swing.JLabel();
        painelDataDevolucaoFuncionario = new javax.swing.JPanel();
        labelPainelDataDevolucaoExibirReservaAdmin = new javax.swing.JLabel();
        labelDataDevolucaoFuncionario = new javax.swing.JLabel();
        labelDataRetiradaFuncionario = new javax.swing.JLabel();
        labelDevolvidoEmFuncionario = new javax.swing.JLabel();
        painelCapacidadePassageirosFuncionario = new javax.swing.JPanel();
        labelPainelCapaceidadePassageirosExibirReservaAdmin = new javax.swing.JLabel();
        painelCapacidadeBagagemFuncionario = new javax.swing.JPanel();
        labelPainelCapacidadeBagagensExibirReservaAdmin = new javax.swing.JLabel();
        labelCapadidadePassageirosFuncionario = new javax.swing.JLabel();
        labelCapacidadeBagagemFuncionario = new javax.swing.JLabel();
        labelStatusFuncionario1 = new javax.swing.JLabel();
        labelPainelNumeroReservaExibirReservaAdmin = new javax.swing.JLabel();
        buttonRetornarExibirReservaFuncionario = new javax.swing.JButton();
        buttonCancelarReservaFuncionario = new javax.swing.JButton();
        buttonRetirarCarroFuncionario = new javax.swing.JButton();
        buttonDevolverCarroFuncionario = new javax.swing.JButton();

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

        labelExibirReservaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelExibirReservaFuncionario.setText("Exibindo reserva:");

        painelExibirReservaFuncionario.setBackground(new java.awt.Color(192, 2, 0));

        labelModeloCarroFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelModeloCarroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelModeloCarroFuncionario.setText("Modelo do Carro:");

        painelModeloCarroFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelModeloCarroFuncionario.setPreferredSize(new java.awt.Dimension(230, 25));

        labelPainelModeloCarroExibirReservaAdmin.setText("Modelo do Carro");

        javax.swing.GroupLayout painelModeloCarroFuncionarioLayout = new javax.swing.GroupLayout(painelModeloCarroFuncionario);
        painelModeloCarroFuncionario.setLayout(painelModeloCarroFuncionarioLayout);
        painelModeloCarroFuncionarioLayout.setHorizontalGroup(
            painelModeloCarroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModeloCarroFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelModeloCarroExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelModeloCarroFuncionarioLayout.setVerticalGroup(
            painelModeloCarroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelModeloCarroExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCorFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCorExibirReservaAdmin.setText("Cor");

        javax.swing.GroupLayout painelCorFuncionarioLayout = new javax.swing.GroupLayout(painelCorFuncionario);
        painelCorFuncionario.setLayout(painelCorFuncionarioLayout);
        painelCorFuncionarioLayout.setHorizontalGroup(
            painelCorFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorFuncionarioLayout.createSequentialGroup()
                .addComponent(labelPainelCorExibirReservaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        painelCorFuncionarioLayout.setVerticalGroup(
            painelCorFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCorExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelPlacaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPlacaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelPlacaFuncionario.setText("Placa:");

        painelPlacaFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelPlacaAdminExibirReservaAdmin.setText("Placa");

        javax.swing.GroupLayout painelPlacaFuncionarioLayout = new javax.swing.GroupLayout(painelPlacaFuncionario);
        painelPlacaFuncionario.setLayout(painelPlacaFuncionarioLayout);
        painelPlacaFuncionarioLayout.setHorizontalGroup(
            painelPlacaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlacaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelPlacaAdminExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPlacaFuncionarioLayout.setVerticalGroup(
            painelPlacaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelPlacaAdminExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelCorFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCorFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCorFuncionario.setText("Cor:");

        painelTaxaDiariaFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaDiariaExibirReservaAdmin.setText("Taxa Diária");

        javax.swing.GroupLayout painelTaxaDiariaFuncionarioLayout = new javax.swing.GroupLayout(painelTaxaDiariaFuncionario);
        painelTaxaDiariaFuncionario.setLayout(painelTaxaDiariaFuncionarioLayout);
        painelTaxaDiariaFuncionarioLayout.setHorizontalGroup(
            painelTaxaDiariaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaDiariaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaDiariaFuncionarioLayout.setVerticalGroup(
            painelTaxaDiariaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaDiariaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelTaxaDiariaAtrasoFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaDiariaAtrasoExibirReservaAdmin.setText("Taxa Diária Atraso");

        javax.swing.GroupLayout painelTaxaDiariaAtrasoFuncionarioLayout = new javax.swing.GroupLayout(painelTaxaDiariaAtrasoFuncionario);
        painelTaxaDiariaAtrasoFuncionario.setLayout(painelTaxaDiariaAtrasoFuncionarioLayout);
        painelTaxaDiariaAtrasoFuncionarioLayout.setHorizontalGroup(
            painelTaxaDiariaAtrasoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaAtrasoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaDiariaAtrasoExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaDiariaAtrasoFuncionarioLayout.setVerticalGroup(
            painelTaxaDiariaAtrasoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaDiariaAtrasoExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelTaxaDiariaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaFuncionario.setText("Taxa Diária:");

        labelTaxaDiariaAtrasoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaAtrasoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaAtrasoFuncionario.setText("Taxa Diária Atraso:");

        labelTaxaTotalAtrasoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaTotalAtrasoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaTotalAtrasoFuncionario.setText("Total de Atraso:");

        painelStatusFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelStatusExibirReservaAdmin.setText("Status da Reserva");

        javax.swing.GroupLayout painelStatusFuncionarioLayout = new javax.swing.GroupLayout(painelStatusFuncionario);
        painelStatusFuncionario.setLayout(painelStatusFuncionarioLayout);
        painelStatusFuncionarioLayout.setHorizontalGroup(
            painelStatusFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelStatusFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelStatusExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelStatusFuncionarioLayout.setVerticalGroup(
            painelStatusFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelStatusExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelValorTotalDiariasFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelValorTotalDiariasExibirReservaAdmin.setText("Valor Total Diárias");

        javax.swing.GroupLayout painelValorTotalDiariasFuncionarioLayout = new javax.swing.GroupLayout(painelValorTotalDiariasFuncionario);
        painelValorTotalDiariasFuncionario.setLayout(painelValorTotalDiariasFuncionarioLayout);
        painelValorTotalDiariasFuncionarioLayout.setHorizontalGroup(
            painelValorTotalDiariasFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalDiariasFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelValorTotalDiariasExibirReservaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelValorTotalDiariasFuncionarioLayout.setVerticalGroup(
            painelValorTotalDiariasFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelValorTotalDiariasExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelValorTotalDiariasFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalDiariasFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalDiariasFuncionario.setText("Valor Total Diárias:");

        labelValorTotalAluguelFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalAluguelFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalAluguelFuncionario.setText(" Total do Aluguel:");

        painelValorTotalFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelValorTotalAluguelExibirReservaAdmin.setText("Valor Total");

        javax.swing.GroupLayout painelValorTotalFuncionarioLayout = new javax.swing.GroupLayout(painelValorTotalFuncionario);
        painelValorTotalFuncionario.setLayout(painelValorTotalFuncionarioLayout);
        painelValorTotalFuncionarioLayout.setHorizontalGroup(
            painelValorTotalFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelValorTotalAluguelExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelValorTotalFuncionarioLayout.setVerticalGroup(
            painelValorTotalFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelValorTotalAluguelExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelTaxaTotalAtrasoFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaTotalAtrasoExibirReservaAdmin.setText("Taxa Total de Atraso");

        javax.swing.GroupLayout painelTaxaTotalAtrasoFuncionarioLayout = new javax.swing.GroupLayout(painelTaxaTotalAtrasoFuncionario);
        painelTaxaTotalAtrasoFuncionario.setLayout(painelTaxaTotalAtrasoFuncionarioLayout);
        painelTaxaTotalAtrasoFuncionarioLayout.setHorizontalGroup(
            painelTaxaTotalAtrasoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaTotalAtrasoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaTotalAtrasoExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaTotalAtrasoFuncionarioLayout.setVerticalGroup(
            painelTaxaTotalAtrasoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaTotalAtrasoExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelStatusFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelStatusFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelStatusFuncionario.setText("Status:");

        painelDataRetiradaFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDataRetiradaExibirReservaAdmin.setText("Data de Retirada");

        javax.swing.GroupLayout painelDataRetiradaFuncionarioLayout = new javax.swing.GroupLayout(painelDataRetiradaFuncionario);
        painelDataRetiradaFuncionario.setLayout(painelDataRetiradaFuncionarioLayout);
        painelDataRetiradaFuncionarioLayout.setHorizontalGroup(
            painelDataRetiradaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataRetiradaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataRetiradaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataRetiradaFuncionarioLayout.setVerticalGroup(
            painelDataRetiradaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataRetiradaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelDevolvidoEmFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDevolvidoEmExibirReservaAdmin.setText("------");

        javax.swing.GroupLayout painelDevolvidoEmFuncionarioLayout = new javax.swing.GroupLayout(painelDevolvidoEmFuncionario);
        painelDevolvidoEmFuncionario.setLayout(painelDevolvidoEmFuncionarioLayout);
        painelDevolvidoEmFuncionarioLayout.setHorizontalGroup(
            painelDevolvidoEmFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDevolvidoEmFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDevolvidoEmExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDevolvidoEmFuncionarioLayout.setVerticalGroup(
            painelDevolvidoEmFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDevolvidoEmExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelDataDevolucaoFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDataDevolucaoExibirReservaAdmin.setText("Data para Devolução");

        javax.swing.GroupLayout painelDataDevolucaoFuncionarioLayout = new javax.swing.GroupLayout(painelDataDevolucaoFuncionario);
        painelDataDevolucaoFuncionario.setLayout(painelDataDevolucaoFuncionarioLayout);
        painelDataDevolucaoFuncionarioLayout.setHorizontalGroup(
            painelDataDevolucaoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataDevolucaoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataDevolucaoExibirReservaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        painelDataDevolucaoFuncionarioLayout.setVerticalGroup(
            painelDataDevolucaoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataDevolucaoExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelDataDevolucaoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDevolucaoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelDataDevolucaoFuncionario.setText("Data para Devolução:");

        labelDataRetiradaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataRetiradaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelDataRetiradaFuncionario.setText("Data de Retirada:");

        labelDevolvidoEmFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDevolvidoEmFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelDevolvidoEmFuncionario.setText("Devolvido em:");

        painelCapacidadePassageirosFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapaceidadePassageirosExibirReservaAdmin.setText("Capacidade de Passageiros");

        javax.swing.GroupLayout painelCapacidadePassageirosFuncionarioLayout = new javax.swing.GroupLayout(painelCapacidadePassageirosFuncionario);
        painelCapacidadePassageirosFuncionario.setLayout(painelCapacidadePassageirosFuncionarioLayout);
        painelCapacidadePassageirosFuncionarioLayout.setHorizontalGroup(
            painelCapacidadePassageirosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapaceidadePassageirosExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCapacidadePassageirosFuncionarioLayout.setVerticalGroup(
            painelCapacidadePassageirosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCapaceidadePassageirosExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelCapacidadeBagagemFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapacidadeBagagensExibirReservaAdmin.setText("CApacidade de Bagagens");

        javax.swing.GroupLayout painelCapacidadeBagagemFuncionarioLayout = new javax.swing.GroupLayout(painelCapacidadeBagagemFuncionario);
        painelCapacidadeBagagemFuncionario.setLayout(painelCapacidadeBagagemFuncionarioLayout);
        painelCapacidadeBagagemFuncionarioLayout.setHorizontalGroup(
            painelCapacidadeBagagemFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeBagagemFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapacidadeBagagensExibirReservaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelCapacidadeBagagemFuncionarioLayout.setVerticalGroup(
            painelCapacidadeBagagemFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCapacidadeBagagemFuncionarioLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(labelPainelCapacidadeBagagensExibirReservaAdmin))
        );

        labelCapadidadePassageirosFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapadidadePassageirosFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCapadidadePassageirosFuncionario.setText("Capacidade de Passageiros:");

        labelCapacidadeBagagemFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeBagagemFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelCapacidadeBagagemFuncionario.setText("Capacidade de Bagagens:");

        labelStatusFuncionario1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelStatusFuncionario1.setForeground(new java.awt.Color(255, 255, 255));
        labelStatusFuncionario1.setText("Nº Reserva:");

        labelPainelNumeroReservaExibirReservaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelPainelNumeroReservaExibirReservaAdmin.setText("Numero da Reserva");

        javax.swing.GroupLayout painelExibirReservaFuncionarioLayout = new javax.swing.GroupLayout(painelExibirReservaFuncionario);
        painelExibirReservaFuncionario.setLayout(painelExibirReservaFuncionarioLayout);
        painelExibirReservaFuncionarioLayout.setHorizontalGroup(
            painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelExibirReservaFuncionarioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelStatusFuncionario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPainelNumeroReservaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelValorTotalFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelValorTotalAluguelFuncionario))
                        .addGap(392, 392, 392))
                    .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataRetiradaFuncionario)
                                    .addComponent(painelDataRetiradaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDevolvidoEmFuncionario)
                                    .addComponent(painelDevolvidoEmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDataDevolucaoFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelStatusFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelDataDevolucaoFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(painelStatusFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelCapadidadePassageirosFuncionario)
                                .addGap(40, 40, 40)
                                .addComponent(labelCapacidadeBagagemFuncionario))
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addComponent(painelCapacidadePassageirosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelCapacidadeBagagemFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValorTotalDiariasFuncionario)
                            .addComponent(painelValorTotalDiariasFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelTaxaDiariaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTaxaDiariaFuncionario))
                        .addGap(27, 27, 27)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTaxaDiariaAtrasoFuncionario)
                            .addComponent(painelTaxaDiariaAtrasoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTaxaTotalAtrasoFuncionario)
                            .addComponent(painelTaxaTotalAtrasoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelExibirReservaFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModeloCarroFuncionario)
                            .addComponent(painelModeloCarroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelPlacaFuncionario)
                                .addGap(81, 81, 81)
                                .addComponent(labelCorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addComponent(painelPlacaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(painelCorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelExibirReservaFuncionarioLayout.setVerticalGroup(
            painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelExibirReservaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModeloCarroFuncionario)
                    .addComponent(labelPlacaFuncionario)
                    .addComponent(labelCorFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPlacaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCorFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelModeloCarroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTaxaDiariaFuncionario)
                            .addComponent(labelTaxaDiariaAtrasoFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                        .addComponent(painelTaxaDiariaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addComponent(labelDataRetiradaFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDataDevolucaoFuncionario, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelValorTotalDiariasFuncionario)
                                            .addComponent(labelTaxaTotalAtrasoFuncionario))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(painelTaxaTotalAtrasoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))
                                    .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(painelDataDevolucaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(painelDataRetiradaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelDevolvidoEmFuncionario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(painelStatusFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(painelDevolvidoEmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelValorTotalAluguelFuncionario)
                                                .addGap(3, 3, 3)
                                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelStatusFuncionario1)
                                                        .addComponent(labelPainelNumeroReservaExibirReservaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(painelValorTotalFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelStatusFuncionario)
                                                    .addComponent(painelValorTotalDiariasFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addComponent(painelTaxaDiariaAtrasoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelExibirReservaFuncionarioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelCapacidadeBagagemFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelExibirReservaFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelExibirReservaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCapadidadePassageirosFuncionario)
                                    .addComponent(labelCapacidadeBagagemFuncionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(painelCapacidadePassageirosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        buttonRetornarExibirReservaFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarExibirReservaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarExibirReservaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarExibirReservaFuncionario.setText("RETORNAR");
        buttonRetornarExibirReservaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarExibirReservaFuncionarioActionPerformed(evt);
            }
        });

        buttonCancelarReservaFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonCancelarReservaFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCancelarReservaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelarReservaFuncionario.setText("CANCELAR RESERVA");
        buttonCancelarReservaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarReservaFuncionarioActionPerformed(evt);
            }
        });

        buttonRetirarCarroFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetirarCarroFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetirarCarroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetirarCarroFuncionario.setText("RETIRAR CARRO");
        buttonRetirarCarroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetirarCarroFuncionarioActionPerformed(evt);
            }
        });

        buttonDevolverCarroFuncionario.setBackground(new java.awt.Color(192, 2, 0));
        buttonDevolverCarroFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDevolverCarroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        buttonDevolverCarroFuncionario.setText("DEVOLVER CARRO");
        buttonDevolverCarroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverCarroFuncionarioActionPerformed(evt);
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
                        .addComponent(labelExibirReservaFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonRetornarExibirReservaFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelarReservaFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRetirarCarroFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDevolverCarroFuncionario)
                        .addGap(36, 36, 36))))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(painelExibirReservaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(labelExibirReservaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelExibirReservaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarExibirReservaFuncionario)
                    .addComponent(buttonCancelarReservaFuncionario)
                    .addComponent(buttonRetirarCarroFuncionario)
                    .addComponent(buttonDevolverCarroFuncionario))
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

    private void buttonCancelarReservaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarReservaFuncionarioActionPerformed
        JOptionPane.showMessageDialog(null, "Reserva Cancelada!");
        Main.controller.cancelarController(num);
        ListaReservasAdmin novatela = new ListaReservasAdmin();
        novatela.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_buttonCancelarReservaFuncionarioActionPerformed

    private void buttonRetirarCarroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetirarCarroFuncionarioActionPerformed
        boolean teste = Main.controller.retirarCarroController(num);
        if(teste){
            JOptionPane.showMessageDialog(null, "Carro Retirado!");
            ListaReservasAdmin novatela = new ListaReservasAdmin();
            novatela.setVisible(true);
            this.setVisible(false);   
        }

        if(!(teste)){
            JOptionPane.showMessageDialog(null, "Carro não pode ser retirado agora!");  
        }
    }//GEN-LAST:event_buttonRetirarCarroFuncionarioActionPerformed

    private void buttonDevolverCarroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverCarroFuncionarioActionPerformed
        
        boolean teste = Main.controller.devolverCarroController(num);
        if(teste){
            JOptionPane.showMessageDialog(null, "Carro Devolvido!");
            ListaReservasAdmin novatela = new ListaReservasAdmin();
            novatela.setVisible(true);
            this.setVisible(false);   
        }
        
        if(!(teste)){
            JOptionPane.showMessageDialog(null, "Carro não pode ser devolvido agora!");  
        } 

    }//GEN-LAST:event_buttonDevolverCarroFuncionarioActionPerformed

    private void buttonRetornarExibirReservaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarExibirReservaFuncionarioActionPerformed
        ListaReservasAdmin novatela = new ListaReservasAdmin();
        novatela.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_buttonRetornarExibirReservaFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ExibirReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirReservaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarReservaFuncionario;
    private javax.swing.JButton buttonDevolverCarroFuncionario;
    private javax.swing.JButton buttonRetirarCarroFuncionario;
    private javax.swing.JButton buttonRetornarExibirReservaFuncionario;
    private javax.swing.JLabel labelCapacidadeBagagemFuncionario;
    private javax.swing.JLabel labelCapadidadePassageirosFuncionario;
    private javax.swing.JLabel labelCorFuncionario;
    private javax.swing.JLabel labelDataDevolucaoFuncionario;
    private javax.swing.JLabel labelDataRetiradaFuncionario;
    private javax.swing.JLabel labelDevolvidoEmFuncionario;
    private javax.swing.JLabel labelExibirReservaFuncionario;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelModeloCarroFuncionario;
    private javax.swing.JLabel labelPainelCapaceidadePassageirosExibirReservaAdmin;
    private javax.swing.JLabel labelPainelCapacidadeBagagensExibirReservaAdmin;
    private javax.swing.JLabel labelPainelCorExibirReservaAdmin;
    private javax.swing.JLabel labelPainelDataDevolucaoExibirReservaAdmin;
    private javax.swing.JLabel labelPainelDataRetiradaExibirReservaAdmin;
    private javax.swing.JLabel labelPainelDevolvidoEmExibirReservaAdmin;
    private javax.swing.JLabel labelPainelModeloCarroExibirReservaAdmin;
    private javax.swing.JLabel labelPainelNumeroReservaExibirReservaAdmin;
    private javax.swing.JLabel labelPainelPlacaAdminExibirReservaAdmin;
    private javax.swing.JLabel labelPainelStatusExibirReservaAdmin;
    private javax.swing.JLabel labelPainelTaxaDiariaAtrasoExibirReservaAdmin;
    private javax.swing.JLabel labelPainelTaxaDiariaExibirReservaAdmin;
    private javax.swing.JLabel labelPainelTaxaTotalAtrasoExibirReservaAdmin;
    private javax.swing.JLabel labelPainelValorTotalAluguelExibirReservaAdmin;
    private javax.swing.JLabel labelPainelValorTotalDiariasExibirReservaAdmin;
    private javax.swing.JLabel labelPlacaFuncionario;
    private javax.swing.JLabel labelStatusFuncionario;
    private javax.swing.JLabel labelStatusFuncionario1;
    private javax.swing.JLabel labelTaxaDiariaAtrasoFuncionario;
    private javax.swing.JLabel labelTaxaDiariaFuncionario;
    private javax.swing.JLabel labelTaxaTotalAtrasoFuncionario;
    private javax.swing.JLabel labelValorTotalAluguelFuncionario;
    private javax.swing.JLabel labelValorTotalDiariasFuncionario;
    private javax.swing.JPanel painelCapacidadeBagagemFuncionario;
    private javax.swing.JPanel painelCapacidadePassageirosFuncionario;
    private javax.swing.JPanel painelCorFuncionario;
    private javax.swing.JPanel painelDataDevolucaoFuncionario;
    private javax.swing.JPanel painelDataRetiradaFuncionario;
    private javax.swing.JPanel painelDevolvidoEmFuncionario;
    private javax.swing.JPanel painelExibirReservaFuncionario;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelModeloCarroFuncionario;
    private javax.swing.JPanel painelPlacaFuncionario;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelStatusFuncionario;
    private javax.swing.JPanel painelTaxaDiariaAtrasoFuncionario;
    private javax.swing.JPanel painelTaxaDiariaFuncionario;
    private javax.swing.JPanel painelTaxaTotalAtrasoFuncionario;
    private javax.swing.JPanel painelValorTotalDiariasFuncionario;
    private javax.swing.JPanel painelValorTotalFuncionario;
    // End of variables declaration//GEN-END:variables
}
