/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorasenninha.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
    
    //Atributos:
    private String nome;
    private String cpf;
    private Calendar dataDeNascimento;
    private String email;
    private String endereco;
    private String cep;
    private String telefone;
    private String senha;
    private Locadora locadora;
    
    //Lista de Reservas do Cliente:
    private ArrayList<Reserva> reservasCliente = new ArrayList<Reserva>();

    //Método Construtor:
    public Cliente(String nome, String cpf, Calendar dataDeNascimento, String email,
            String endereco, String cep, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    //Métodos Getters e Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Reserva> getReservas() {
        return reservasCliente;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservasCliente = reservas;
    }

    public boolean cadastrarCliente(Cliente cliente) {

        if(verificarCPF_Cliente(cliente.getCpf()) && verificarIdade(cliente.getDataDeNascimento())){
            locadora.listaClientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean verificarCPF_Cliente(String cpf){

        for(int i=0;i<locadora.listaClientes.size();i++){
            if((locadora.listaClientes).get(i).getCpf() == cpf){
                return false;
            }
        }
        return true;
    }

    public boolean verificarIdade (Calendar dataDeNascimento){
//        LocalDateTime now = LocalDateTime.now();
        /*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        dateFormat.format(cal.getTime())

        Calendar calendar.add(Calendar.YEAR,18);
        DataNascimento.before(dataAtual)*/

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        dateFormat.format(cal.getTime());

        cal.add(Calendar.YEAR,18);
        if (dataDeNascimento.before(cal))
            return true;
        return false;
    }
    
}
