package locadorasenninha.Controller;

import locadorasenninha.Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LocadoraController {
//Carro
    public boolean verificaCadastrarCarro(String modelo, String placa, String cor, String chassi, int passageiros,
                                          int bagagem, double taxaDiaria, double taxaAtraso)
    {
        if (modelo != null && modelo.length() > 0 && modelo.length() < 30)
        {
            if (placa != null && placa.length() == 7)
            {
                if (cor != null && cor.length() > 0 && cor.length() < 30)
                {
                    if (bagagem > 0 && bagagem <= 9999)
                    {
                        if (taxaDiaria > 0 && taxaDiaria <= 9999)
                        {
                            if (taxaAtraso > 0 && taxaAtraso <= 9999)
                            {
                                return Locadora.cadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean verificaDevolverCarro(Carro carro, Reserva reserva, Cliente cliente)
    {
        if (carro != null && reserva != null && cliente != null)
        {
            Locadora.devolverCarro(carro, reserva, cliente);
            return true;
        }
        return false;
    }

//Cliente
    public boolean verificaCadastrarCliente(String nome, String cpf, String dataDeNascimento, String email,
                                    String endereco, String cep, String telefone, String senha){

        if (nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 14
                && dataDeNascimento != null && dataDeNascimento.length() == 10 && email != null
                && email.length() > 0 && email.length() < 100 && endereco != null && endereco.length() > 0
                && endereco.length() < 300 && cep != null && cep.length() == 9 && telefone!= null
                && telefone.length() == 16 &&  senha != null && senha.length() < 30)
        {
            return Locadora.cadastrarCliente(nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
        }
        return false;
    }

    public boolean verificaLoginCliente(String cpf, String senha){
        if(cpf != null && cpf.length() == 14 && senha != null && senha.length() < 30){
            return Locadora.loginCliente(cpf, senha);
        }
    return false;
}

//Reserva
    public boolean verificaFazerReserva(int numeroReserva, Calendar dataEmissao, Calendar dataRetirada,
                                        Calendar dataDevolucao, Carro carro, Cliente cliente,
                                        Funcionario funcionario, double valorTotalDiaria, double valorTotalAtraso,
                                        double valorTotalGeral) throws Exception {
        if (numeroReserva > 1 && numeroReserva < 99999)
        {
            if (dataEmissao != null && dataRetirada != null && dataDevolucao != null)
            {
                if (carro != null)
                {
                    if (cliente != null)
                    {
                        if (funcionario != null)
                        {
                            Locadora.fazerReserva(numeroReserva, dataEmissao, dataRetirada, dataDevolucao, carro, cliente, funcionario, valorTotalDiaria, valorTotalAtraso, valorTotalGeral);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean verificaCancelarReserva(Carro carro, Reserva reserva, Cliente cliente){
        if (carro != null && reserva != null && cliente != null)
        {
            Locadora.cancelarReserva(carro, reserva, cliente);
            return true;
        }
        return false;
    }

//Funcionario
    public boolean verificaCadastrarFuncionario(String nome, String cpf, String dataDeNascimento,
                                        String endereco, String email, String cep, String telefone, String senha){
        if(nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 11 && dataDeNascimento != null &&
                dataDeNascimento.length() == 8 && endereco != null && endereco.length() > 0 && endereco.length() < 300 && email != null && email.length() > 0 &&
                email.length() < 100 && cep != null && cep.length() == 8 && telefone!= null && telefone.length()>=11 && telefone.length() < 15
                && senha != null && senha.length() < 30)
        {
            Funcionario funcionario = new Funcionario (nome, cpf, dataDeNascimento, endereco, email, cep, telefone, senha);
            return Locadora.cadastrarFuncionario(funcionario);

        }
        return false;
    }

    public boolean verificaLoginFuncionario(String cpf, String senha){
        if(cpf != null && cpf.length() == 11 && senha != null && senha.length() < 30){
            return Locadora.loginFuncionario(cpf,senha);
        }
        return false;
    }

//    public boolean removerFuncionario(String cpf){
//        if (cpf != null && cpf.length() == 11 ){
//            return Locadora.removerFuncionario(cpf);
//        }
//        return false;
//    }
}