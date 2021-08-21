/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorasenninha.Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Locadora {
    
    public ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	
    public ArrayList<Reserva> reservasLocadora = new ArrayList<Reserva>();

    public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
    public ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    private Admin admin = new Admin("admin", "admin");
    
    private int numeroReservas; // Regista o numero total de reservas da locadora;
    
    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public ArrayList<Carro> getCarros() {
        return listaCarros;
    }
    
    //Método que devolve um carro
    public boolean devolverCarro(Carro carro){
      for(int i = 0; i < reservasLocadora.size();i++){
        if(reservasLocadora.get(i).getCarro() == carro){
          reservasLocadora.remove(carro);
          return true;
        }
      }
      return false;
      
    }

    //Método que gera uma NOVA RESERVA
    public boolean gerarReserva(Calendar dataEmissao, Calendar dataRetirada, Calendar dataDevolucao, 
            String status, Carro carro, Cliente cliente, Funcionario funcionario, 
            double valorTotalDiaria, double valorTotalAtraso, double valorTotalGeral, 
            int numeroReserva) throws Exception{
        
      Reserva reserva = new Reserva(numeroReserva,dataEmissao,dataRetirada, 
             dataDevolucao, status, carro, cliente, 
             funcionario,valorTotalDiaria,valorTotalAtraso, 
            valorTotalGeral);

      for (int i = 0; i < reservasLocadora.size(); i++)
      {
        if (reserva.getDataRetirada() == reservasLocadora.get(i).getDataRetirada() || reserva.getDataDevolucao() == reservasLocadora.get(i).getDataDevolucao() || reserva.getDataRetirada().before(reservasLocadora.get(i).getDataDevolucao()) || reserva.getDataDevolucao().after(reservasLocadora.get(i).getDataRetirada()))
        {
            System.out.println("Data indisponivel");
            return false;
        }
      }

      reservasLocadora.add(reserva);
      return true;
      //this.notifyObservers(); é necessario ?
    }

    public ArrayList<Reserva> getReservas() {
        return reservasLocadora;
    }

    public boolean verificarReserva (String cpf) {
        for (int i = 0; i < reservasLocadora.size(); i++){
            if ( ((reservasLocadora.get(i)).getCliente()).getCpf() == cpf )
                return true; // cliente possui uma reserva ativa
        }

        return false; // Não há reservas ativas
    }

    //Método que CANCELA uma reserva
    public void cancelarReserva (int numeroReserva) {
        for (int i = 0; i < reservasLocadora.size(); i++){
            if ((reservasLocadora.get(i)).getNumeroReserva() == numeroReserva){
                    reservasLocadora.remove(i);
            }
        }
    }


    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }


    //Método auxiliar que verifica se um CPF de cliente já está cadastrado

    public ArrayList<Funcionario> getFuncionarios(){
        return listaFuncionarios;
    }
    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    
    //Métodos de Login:------------------------------------------------------------------------------
    public boolean loginAdmin(String usuario, String senha){

        if(usuario == "admin" && senha == "admin"){
            return true;
        }
        return false;
    }

/*    public boolean loginCliente(String cpf, String senha){
        for(int i=0;i<listaClientes.size();i++){ 
            if((listaClientes).get(i).getCpf() == cpf && (listaClientes).get(i).getSenha() == senha){
                return true; // Login efetuado com sucesso
            }
        }		
        return false; // Não existe o usuário ou senha incorreta
    }	
*/
//    public boolean loginFuncionario(String cpf, String senha){
//        for(int i=0;i<listaFuncionarios.size();i++){
//            if((listaFuncionarios).get(i).getCpf() == cpf && (listaFuncionarios).get(i).getSenha() == senha){
//                return true; // Login efetuado com sucesso
//            }
//        }
//        return false; // Não existe o usuário ou senha incorreta
//    }
    
    //Métodos para verificação de repetições:--------------------------------------------------------
//    public boolean verificarCPF_Funcionario(String cpf){
//
//        for(int i=0;i<listaFuncionarios.size();i++){
//            if((listaFuncionarios).get(i).getCpf() == cpf){
//                return false;
//            }
//        }
//        return true;
//    }
    
//    public boolean verificarCPF_Cliente(String cpf){
//
//     for(int i=0;i<listaClientes.size();i++){
//         if((listaClientes).get(i).getCpf() == cpf){
//             return false;
//         }
//     }
//     return true;
// }
public boolean verificarPlaca (String placa){

        for(int i=0;i<listaCarros.size();i++){ 
            if((listaCarros).get(i).getPlaca() == placa){
                return false;
            }
        }		
        return true;
    }
    
    //Métodos para verificar se uma pessoa é maior de idade------------------------------------------
    //(Precisa ser implementada!!!!!!!!!)------------------------------------------------------------
 /*   public boolean verificarIdade (Calendar dataDeNascimento){
        LocalDateTime now = LocalDateTime.now();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        dateFormat.format(cal.getTime())

        Calendar calendar.add(Calendar.YEAR,18);
        DataNascimento.before(dataAtual)

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        dateFormat.format(cal.getTime());

        cal.add(Calendar.YEAR,18);
        if (dataDeNascimento.before(cal))
            return true;
        return false;
    } */

    //Métodos de cadastro:---------------------------------------------------------------------------
/*    public boolean cadastrarCliente(String nome, String cpf, Calendar dataDeNascimento,
            String email, String endereco, String cep, String telefone, String senha) {

        if(verificarCPF_Cliente(cpf) && verificarIdade(dataDeNascimento)){
            Cliente cliente = new Cliente (nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }
*/
//    public boolean cadastrarFuncionario(String nome, String cpf, Calendar dataDeNascimento,
//            String endereco, String email, String cep, String telefone, String senha) {
//
//        if(verificarCPF_Funcionario(cpf) && verificarIdade(dataDeNascimento)){
//            listaFuncionarios.add(this);
//            return true;
//        }
//        return false;
//    }

    public boolean cadastrarCarro(String modelo, String placa, String cor, String chassi,
                  int passageiros, double bagagem, double taxaDiaria, double taxaAtraso) {

        if(verificarPlaca(placa)){
            Carro carro = new Carro (modelo, placa, cor, chassi, 
                  passageiros, bagagem, taxaDiaria, taxaAtraso);
            listaCarros.add(carro);
            return true;
        }
        return false;
    }

    //Métodos para verificar se há reservas ativas no Cliente e no Carro:----------------------------
    //(PRECISAM SER FEITAS!!!!!!!!!!)----------------------------------------------------------------
    public boolean analisarReservasCliente(Cliente cliente){
        //Ideia: rodar a lista de reservas do cliente, se encontrar alguma reserva que não tem os status
        //Finalizada (devolvido) ou  Cancelada, retornar false.
        return true;
    }
    
    public boolean analisarReservasCarro(Carro carro){
        //Rodar a lista de reservas do carro, se encontrar alguma reserva que não
        //tem os status Finalizada ou Cancelada, retornar false.
        return true;
    }
    
    //Método para verificar se um carro está disponível em um intervalo de datas:
    //(Precisa ser implementada!!!!!!!!!)------------------------------------------------------------
    public boolean verificarDisponibilidadeCarro(Calendar dataRetirada, Calendar dataDevolucao){
        return true;
    }
    
    //Métodos de Remoção:----------------------------------------------------------------------------
//    public void removerCliente(String cpf, Cliente cliente){
//     for (int i = 0; i < listaClientes.size(); i++)
//         if ((listaClientes.get(i)).getCpf() == cpf && analisarReservasCliente(cliente))
//             listaClientes.remove(i);
// }
//    public void removerFuncionario(String cpf){
//        for (int i = 0; i < listaFuncionarios.size(); i++)
//            if ((listaFuncionarios.get(i)).getCpf() == cpf)
//                listaFuncionarios.remove(i);
//    }
    
    public void removerCarro(String placa, Carro carro){
        for (int i = 0; i < listaCarros.size(); i++)
            if (((listaCarros.get(i)).getPlaca() == placa) && (analisarReservasCarro(carro)))
                listaCarros.remove(i);    
    }
    
    //Método para gerenciar uma reserva:-----------------------------------------------------------------
    //(PRECISAM SER FEITAS!!!!!!!!!!)--------------------------------------------------------------------
    public void fazerReserva(){
        //Nesse método, acho que é só jogar no construtor;
    }
    //Essa não sei se precisa
    public boolean verificarStatusReserva(Reserva reserva){
        return true;
    }
    
    public void cancelarReserva(){
        //Uma reserva não pode ser cancelada quando o carro foi retirado;
        //Devolução
    }
}