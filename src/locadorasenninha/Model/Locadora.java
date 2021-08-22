//String Comparator ta errado na linha 146
package locadorasenninha.Model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Objects;


public class Locadora {

    public static ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	
    public static ArrayList<Reserva> reservasLocadora = new ArrayList<Reserva>();

    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    private Admin admin = new Admin("admin", "admin");
    
    private int numeroReservas; // Regista o numero total de reservas da locadora;
    
    public ArrayList<Carro> getCarros() {
        return listaCarros;
    }

    public ArrayList<Reserva> getReservas() {
        return reservasLocadora;
    }

    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return listaFuncionarios;
    }
    

//MÉTODO OPERACIONAL ADMIN
    public boolean loginAdmin(String usuario, String senha){

        if(usuario == "admin" && senha == "admin"){
            return true;
        }
        return false;
    }
       

//MÉTODOS OPERACIONAIS ENVOLVENDO CARRO

    public static boolean cadastrarCarro(String modelo, String placa, String cor,
                                    String chassi, String passageiros, String bagagem, 
                                    double taxaDiaria, double taxaAtraso) {
        if(verificarPlaca(placa)){
            //Instanciar um carro usando o construtor;
            Carro carro = new Carro (modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso);
            //Adicionar o carro na lista de carros:
            listaCarros.add(carro);
            return true; //Indica que o carro foi cadastrado no sistema;
        }
        return false; //Indica que o carro não foi cadastrado no sistema;
    }

    private static boolean verificarPlaca(String placa){

        for(int i=0;i<listaCarros.size();i++){
            if((listaCarros).get(i).getPlaca() == placa){
                return false;
            }
        }
        return true;
    }    

    public void retirarCarro (Carro carro, Reserva reserva, Cliente cliente){
        reserva.setStatus("ATIVA");
        
        //Percorrer a lista de reservas do cliente para modificar o status da reserva em questão:
        for (int i = 0; i < cliente.getReservasCliente().size(); i++){
            if (cliente.getReservasCliente().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                cliente.getReservasCliente().get(i).setStatus("ATIVA");
            }
        }
        
        //Percorrer a lista de reservas do carro mudar seu status para "ATIVA":
        for (int i = 0; i < carro.getReservasCarro().size(); i++){
            if (carro.getReservasCarro().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                cliente.getReservasCliente().get(i).setStatus("ATIVA");
            }
        }
      //Tornar o carro indisponível:
      carro.setStatus(false);
    }


    public static void devolverCarro(Carro carro, Reserva reserva, Cliente cliente){
        reserva.setStatus("FINALIZADA");
        
        //Percorrer a lista de reservas do cliente para modificar o status da reserva em questão:
          for (int i = 0; i < cliente.getReservasCliente().size(); i++){
              if (cliente.getReservasCliente().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                  cliente.getReservasCliente().get(i).setStatus("FINALIZADA");
              }
          }
          
        //Percorrer a lista de reservas do carro para remover a reserva em questão:
        for (int i = 0; i < carro.getReservasCarro().size(); i++){
            if (carro.getReservasCarro().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                  carro.getReservasCarro().remove(i);
              }
          }
        //Tornar o carro disponível novamente:
        carro.setStatus(true);
      } 


//MÉTODOS OPERACIONAIS ENVOLVENDO CLIENTE

    public static boolean cadastrarCliente(String nome, String cpf, String dataDeNascimento,
            String email, String endereco, String cep, String telefone, String senha) {

        if(verificarCPF_Cliente(cpf)){
            //Instancia um Cliente utilizando o Construtor
            Cliente cliente = new Cliente (nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
            //Adiciona o cliente na lista de clientes:
            listaClientes.add(cliente); 
            return true; //Indica que o cliente foi cadastrado no sistema;
        }
        return false; //Indica que o cliente não foi cadastrado no sistema;
    }

    private static boolean verificarCPF_Cliente(String cpf){
        for(int i=0;i<listaClientes.size();i++){ 
            if((listaClientes).get(i).getCpf() == cpf){
                return false;
            }
        }		
        return true;
    }

    public static boolean loginCliente(String cpf, String senha){
        for(int i=0;i<listaClientes.size();i++){ 
            if(Objects.equals((listaClientes).get(i).getCpf(), cpf) && Objects.equals((listaClientes).get(i).getSenha(), senha)){
                return true; // Login efetuado com sucesso
            }
        }
        return false; // Não existe o usuário ou senha incorreta
    }		

//MÉTODOS OPERACIONAIS ENVOLVENDO FUNCIONÁRIO

    public static boolean cadastrarFuncionario(Funcionario funcionario) {
        if (verificarCPF_Funcionario(funcionario.getCpf())){
            listaFuncionarios.add(funcionario);
            return true; //indica que o funcionário foi cadastrado no sistema;
        }
    return false;//Indica que o funionário não foi cadastrado no sistema;
    }

    public static boolean verificarCPF_Funcionario(String cpf){
        for(int i=0;i<listaFuncionarios.size();i++){ 
            if((listaFuncionarios).get(i).getCpf() == cpf){
                return false;
            }
        }		
        return true;
    }

    public static boolean loginFuncionario(String cpf, String senha){
        for(int i=0;i<listaFuncionarios.size();i++){ 
            if(Objects.equals((listaFuncionarios).get(i).getCpf(), cpf) && Objects.equals((listaFuncionarios).get(i).getSenha(), senha)){
                return true; // Login efetuado com sucesso
            }
        }		
        return false; // Não existe o usuário ou senha incorreta
    }

//    public static boolean removerFuncionario(String cpf){
//        for (int i = 0; i < listaFuncionarios.size(); i++)
//            if ((listaFuncionarios.get(i)).getCpf() == cpf) {
//                listaFuncionarios.remove(i);
//                return true;
//            }
//        return false;
//    }


//MÉTODOS OPERACIONAIS ENVOLVENDO RESERVA    

    public boolean verificarDisponibilidadeCarro(Calendar dataRetiradaCliente, Calendar dataDevolucaoCliente, Calendar dataRetiradaCarro, Calendar dataDevolucaoCarro){
        return (dataDevolucaoCliente.before(dataRetiradaCarro) || dataDevolucaoCarro.before(dataRetiradaCliente));
    }

    public static void fazerReserva(int numeroReserva, Calendar dataEmissao, Calendar dataRetirada,
                                    Calendar dataDevolucao, Carro carro, Cliente cliente,
                                    Funcionario funcionario, double valorTotalDiaria, double valorTotalAtraso,
                                    double valorTotalGeral){
        //Incrementar o numero da reserva;
        numeroReserva = numeroReserva + 1;
        Reserva reserva = new Reserva(numeroReserva, dataEmissao, dataRetirada, dataDevolucao, carro, cliente, 
                                    funcionario, valorTotalDiaria, valorTotalAtraso, valorTotalGeral);
        //Adicionar nas listas de reserva de cada objeto;
        reservasLocadora.add(reserva);
        cliente.getReservasCliente().add(reserva);
        carro.getReservasCarro().add(reserva);
    }
    
    public static void cancelarReserva(Carro carro, Reserva reserva, Cliente cliente){
        reserva.setStatus("CANCELADA");
        
        //Percorrer a lista de reservas do cliente para modificar o status da reserva em questão:
        for (int i = 0; i < cliente.getReservasCliente().size(); i++){
            if (cliente.getReservasCliente().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                cliente.getReservasCliente().get(i).setStatus("CANCELADA");
            }
        }
        //Percorrer a lista de reservas do carro para remover a reserva em questão:
        for (int i = 0; i < carro.getReservasCarro().size(); i++){
            if (carro.getReservasCarro().get(i).getNumeroReserva() == reserva.getNumeroReserva()){
                carro.getReservasCarro().remove(i);
            }
        }
    }

    //Métodos para calcular valor de uma reserva:-----------------------------------------------------------------
    public double calcularValorReserva (Calendar dataRetirada, Calendar dataDevolucao, double taxaDiaria) throws ParseException {
        //Formato da data:
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        //Converter de Calendar para String:
        String dataRetiradaString = formato.format(dataRetirada.getTime());
        String dataDevolucaoString = formato.format(dataDevolucao.getTime());
        
        //Declarar variáveis do tipo Date para armazenar essas datas:
        Date dataRetiradaDate;
        Date dataDevolucaoDate;
        
        //Atribuir as strings às variáveis do tipo Date:
        dataRetiradaDate = formato.parse(dataRetiradaString);
        dataDevolucaoDate = formato.parse(dataDevolucaoString);
        
        //Calcular a diferença entre as datas em milissegundos:
        long diferenca = dataDevolucaoDate.getTime() - dataRetiradaDate.getTime();
        
        //Converter a diferença para double para possibilitar o trabalho com numeros reais:
        double doubleDiferenca = diferenca;
        
        //Converter de milissegundos para dias:
        double dias = doubleDiferenca/(24 * 60 * 60 * 1000);
        
        //Arredondar a diferença para cima:
        dias = Math.ceil(dias);
        
        //Multiplicar pelo valor da taxa diária:
        double valorDiarias = dias*taxaDiaria;
        
        //Retornar o valor total das diárias:
        return valorDiarias;
    }
    
    public double calcularTaxaTotalAtraso (Calendar dataDevolucao, Calendar dataDevolvidoEm, double taxaDiariaAtraso) throws ParseException{
      //Formato da data:
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        //Criar variável para armazenar o valor do atraso:
        double valorAtraso;

        //Analisar a data atual:
        Calendar dataAtual = Calendar.getInstance();
        
        //Adicionar 10 minutos de tolerância à data de entrega:
        dataDevolucao.add(Calendar.MINUTE, 10);
        if(dataAtual.before(dataDevolucao)){ //Se o cliente não tiver extrapolado essa tolerância, não tem taxa de atraso.
            valorAtraso = 0.0;
        } else { //Caso tenha extrapolado, calcula-se o valor do atraso.
            //Converter de Calendar para String:
            String dataDevolucaoString = formato.format(dataDevolucao.getTime());
            String dataDevolvidoEmString = formato.format(dataDevolvidoEm.getTime());

            //Declarar variáveis do tipo Date para armazenar essas datas:
            Date dataDevolucaoDate;
            Date dataDevolvidoEmDate;

            //Atribuir as strings às variáveis do tipo Date:
            dataDevolucaoDate = formato.parse(dataDevolucaoString);
            dataDevolvidoEmDate = formato.parse(dataDevolvidoEmString);

            //Calcular a diferença entre as datas em milissegundos:
            long diferenca = dataDevolvidoEmDate.getTime() - dataDevolucaoDate.getTime();

            //Converter a diferença para double para possibilitar o trabalho com numeros reais:
            double doubleDiferenca = diferenca;

            //Converter de milissegundos para dias:
            double dias = doubleDiferenca/(24 * 60 * 60 * 1000);

            //Arredondar a diferença para cima:
            dias = Math.ceil(dias);

            //Multiplicar pelo valor da taxa diária de atraso:
            valorAtraso = dias*taxaDiariaAtraso;
        }
        
        //Retornar o valor total do atraso:
        return valorAtraso;
    }

    public double calcularValorTotalReserva (double ValorTotalDiarias, double ValorTotalAtraso){
      return (ValorTotalDiarias + ValorTotalAtraso);
    }
    
    //Método para cancelar reservas no caso em que um cliente atrasa a ponto de chocar com a retirada de outro cliente:
    public void cancelarPorChoqueHorarios(){
        //Instanciar a data e hora atuais (momento):
        Calendar agora = Calendar.getInstance();
        
        //Analisar a lista de reservas:
        for(int i = 0; i< reservasLocadora.size(); i++){
            //Se a data da retirada da reserva tiver passado e o carro ainda não foi devolvido, cancelar a reserva:
            if (reservasLocadora.get(i).getDataRetirada().before(agora) && (reservasLocadora.get(i).getCarro().getStatus() == false)){
                cancelarReserva(reservasLocadora.get(i).getCarro(), reservasLocadora.get(i), reservasLocadora.get(i).getCliente());
            }
        }
    }
    

}


