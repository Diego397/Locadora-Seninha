//Tratar as entradas em relacao a data
package locadorasenninha.View;

import locadorasenninha.Model.Main;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SelecionarDatasReservaAdmin extends javax.swing.JFrame {


    public SelecionarDatasReservaAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        buttonRetornarSelecionarDatasReserva = new javax.swing.JButton();
        buttonConfirmarDatas = new javax.swing.JButton();
        painelSuporteSelecionarDatasReserva = new javax.swing.JPanel();
        labelDataRetiradaSelecionarReserva = new javax.swing.JLabel();
        textFieldDataRetirada = new javax.swing.JFormattedTextField();
        textFieldHoraRetiradaSelecionarDatasReserva = new javax.swing.JFormattedTextField();
        labelHoraRetiradaSelecionarDatasReserva = new javax.swing.JLabel();
        labelDataDevolucaoSelecionarDatasReserva = new javax.swing.JLabel();
        textFieldHoraDevolucaoSelecionarDatasReserva = new javax.swing.JFormattedTextField();
        textFieldDataDevolucaoSelecionarDatasReserva = new javax.swing.JFormattedTextField();
        labelHoraDevolucaoSelecionarDatasReservas = new javax.swing.JLabel();
        labelSeleciarPeriodo = new javax.swing.JLabel();

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

        buttonRetornarSelecionarDatasReserva.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarSelecionarDatasReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarSelecionarDatasReserva.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarSelecionarDatasReserva.setText("RETORNAR");
        buttonRetornarSelecionarDatasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarSelecionarDatasReservaActionPerformed(evt);
            }
        });

        buttonConfirmarDatas.setBackground(new java.awt.Color(192, 2, 0));
        buttonConfirmarDatas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConfirmarDatas.setForeground(new java.awt.Color(255, 255, 255));
        buttonConfirmarDatas.setText("PRÓXIMO");
        buttonConfirmarDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonConfirmarDatasActionPerformed(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        painelSuporteSelecionarDatasReserva.setBackground(new java.awt.Color(192, 2, 0));

        labelDataRetiradaSelecionarReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataRetiradaSelecionarReserva.setForeground(new java.awt.Color(255, 255, 255));
        labelDataRetiradaSelecionarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataRetiradaSelecionarReserva.setText("Data de Retirada:");

        try {
            textFieldDataRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataRetirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textFieldHoraRetiradaSelecionarDatasReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldHoraRetiradaSelecionarDatasReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldHoraRetiradaSelecionarDatasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHoraRetiradaSelecionarDatasReservaActionPerformed(evt);
            }
        });

        labelHoraRetiradaSelecionarDatasReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHoraRetiradaSelecionarDatasReserva.setForeground(new java.awt.Color(255, 255, 255));
        labelHoraRetiradaSelecionarDatasReserva.setText("Hora da Retirada:");

        labelDataDevolucaoSelecionarDatasReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataDevolucaoSelecionarDatasReserva.setForeground(new java.awt.Color(255, 255, 255));
        labelDataDevolucaoSelecionarDatasReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataDevolucaoSelecionarDatasReserva.setText("Data de Devolução:");

        try {
            textFieldHoraDevolucaoSelecionarDatasReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldHoraDevolucaoSelecionarDatasReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldHoraDevolucaoSelecionarDatasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHoraDevolucaoSelecionarDatasReservaActionPerformed(evt);
            }
        });

        try {
            textFieldDataDevolucaoSelecionarDatasReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataDevolucaoSelecionarDatasReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelHoraDevolucaoSelecionarDatasReservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHoraDevolucaoSelecionarDatasReservas.setForeground(new java.awt.Color(255, 255, 255));
        labelHoraDevolucaoSelecionarDatasReservas.setText("Hora da Devolução:");

        javax.swing.GroupLayout painelSuporteSelecionarDatasReservaLayout = new javax.swing.GroupLayout(painelSuporteSelecionarDatasReserva);
        painelSuporteSelecionarDatasReserva.setLayout(painelSuporteSelecionarDatasReservaLayout);
        painelSuporteSelecionarDatasReservaLayout.setHorizontalGroup(
            painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                        .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldDataRetirada)
                            .addComponent(labelDataRetiradaSelecionarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHoraRetiradaSelecionarDatasReserva)
                            .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textFieldHoraRetiradaSelecionarDatasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                        .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldDataDevolucaoSelecionarDatasReserva)
                            .addComponent(labelDataDevolucaoSelecionarDatasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHoraDevolucaoSelecionarDatasReservas)
                            .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textFieldHoraDevolucaoSelecionarDatasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSuporteSelecionarDatasReservaLayout.setVerticalGroup(
            painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteSelecionarDatasReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataRetiradaSelecionarReserva)
                    .addComponent(labelHoraRetiradaSelecionarDatasReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldDataRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(textFieldHoraRetiradaSelecionarDatasReserva))
                .addGap(18, 18, 18)
                .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataDevolucaoSelecionarDatasReserva)
                    .addComponent(labelHoraDevolucaoSelecionarDatasReservas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteSelecionarDatasReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldDataDevolucaoSelecionarDatasReserva)
                    .addComponent(textFieldHoraDevolucaoSelecionarDatasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelSeleciarPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSeleciarPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSeleciarPeriodo.setText("Selecione um período para a reserva:");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRetornarSelecionarDatasReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonConfirmarDatas)
                .addContainerGap())
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelSuporteSelecionarDatasReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSeleciarPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(labelSeleciarPeriodo)
                .addGap(18, 18, 18)
                .addComponent(painelSuporteSelecionarDatasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarSelecionarDatasReserva)
                    .addComponent(buttonConfirmarDatas))
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
    }

    private void buttonRetornarSelecionarDatasReservaActionPerformed(java.awt.event.ActionEvent evt) {
        SelecioneClienteAdmin novatela = new SelecioneClienteAdmin();
        novatela.setVisible(true);
        this.setVisible(false);
    }

    private void buttonConfirmarDatasActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_buttonConfirmarDatasActionPerformed
        //String dataRetirada = textFieldDataRetirada.getText();
        //String dataDevolucao = textFieldDataDevolucaoSelecionarDatasReserva.getText();

        try {
            String dataRetirada = (String)textFieldDataRetirada.getText();;
            String dataDevolucao = (String)textFieldDataDevolucaoSelecionarDatasReserva.getText();
            SimpleDateFormat for1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat for2 = new SimpleDateFormat("dd/MM/yyyy");

            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();

            cal1.setTime(for1.parse(dataRetirada));
            cal2.setTime(for2.parse(dataDevolucao));

            Main.dataRetiradaView = cal1;
            Main.dataDevolucaoView = cal2;

            if (Main.controller.verificaDataReserva(dataRetirada, dataDevolucao))
            {
            SelecionarCarroAdmin novatela = new SelecionarCarroAdmin();
            novatela.setVisible(true);
            this.setVisible(false);
             }
            
             else
             {
            JOptionPane.showMessageDialog(null, "Data inválida!");
             }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        
    }

    private void textFieldHoraRetiradaSelecionarDatasReservaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void textFieldHoraDevolucaoSelecionarDatasReservaActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(SelecionarDatasReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarDatasReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarDatasReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarDatasReservaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarDatasReservaAdmin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonConfirmarDatas;
    private javax.swing.JButton buttonRetornarSelecionarDatasReserva;
    private javax.swing.JLabel labelDataDevolucaoSelecionarDatasReserva;
    private javax.swing.JLabel labelDataRetiradaSelecionarReserva;
    private javax.swing.JLabel labelHoraDevolucaoSelecionarDatasReservas;
    private javax.swing.JLabel labelHoraRetiradaSelecionarDatasReserva;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelSeleciarPeriodo;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteSelecionarDatasReserva;
    private javax.swing.JFormattedTextField textFieldDataDevolucaoSelecionarDatasReserva;
    private javax.swing.JFormattedTextField textFieldDataRetirada;
    private javax.swing.JFormattedTextField textFieldHoraDevolucaoSelecionarDatasReserva;
    private javax.swing.JFormattedTextField textFieldHoraRetiradaSelecionarDatasReserva;
}
