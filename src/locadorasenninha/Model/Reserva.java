package locadorasenninha.Model;

import java.util.ArrayList;
import java.util.Calendar;

public class Reserva {
    private int numeroReserva; // identificador da reserva
  
    private Calendar dataRetirada;
    private Calendar dataDevolucao;
    private String status; //reservado, retirado, devolvido, cancelado

    private Carro carro;
    private Cliente cliente;

    private double valorTotalDiaria; //tipo dinheiro
    private double valorTotalAtraso; //tipo dinheiro
    private double valorTotalGeral; //tipo dinheiro
    
    //Método Construtor:
    public Reserva(int numeroReserva, Calendar dataRetirada, 
            Calendar dataDevolucao, Carro carro, Cliente cliente, double valorTotalDiaria, double valorTotalAtraso, 
            double valorTotalGeral) {
        this.numeroReserva = numeroReserva;
        //this.dataEmissao = dataEmissao;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.status = "RESERVADA";
        this.carro = carro;
        this.cliente = cliente;
        this.valorTotalDiaria = valorTotalDiaria;
        this.valorTotalAtraso = valorTotalAtraso;
        this.valorTotalGeral = valorTotalGeral;
    }
    
    //Métodos Getters e Setters:
    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    /*
    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
*/
    public Calendar getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Calendar dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotalDiaria() {
        return valorTotalDiaria;
    }

    public void setValorTotalDiaria(double valorTotalDiaria) {
        this.valorTotalDiaria = valorTotalDiaria;
    }

    public double getValorTotalAtraso() {
        return valorTotalAtraso;
    }

    public void setValorTotalAtraso(double valorTotalAtraso) {
        this.valorTotalAtraso = valorTotalAtraso;
    }

    public double getValorTotalGeral() {
        return valorTotalGeral;
    }

    public void setValorTotalGeral(double valorTotalGeral) {
        this.valorTotalGeral = valorTotalGeral;
    }
}
