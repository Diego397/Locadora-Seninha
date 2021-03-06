package locadorasenninha.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
    
    //Atributos:
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String cep;
    private String telefone;
    private String senha;
    //private static Locadora locadora;
    
    //Lista de Reservas do Cliente:
    private ArrayList<Reserva> reservasCliente = new ArrayList<Reserva>();

    //Método Construtor:
    public Cliente(String nome, String cpf, String dataDeNascimento, String email,
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
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

    public ArrayList<Reserva> getReservasCliente() {
        return reservasCliente;
    }

    public void setReservasCliente(ArrayList<Reserva> reservasCliente) {
        this.reservasCliente = reservasCliente;
    } 

    /*
    public Locadora getLocadora() { 
        return locadora; 
    }

    public void setLocadora(Locadora locadora){ 
        this.locadora = locadora; 
    }

*/

    //Métodos Operacionais

    /*
    public boolean cadastrarCliente(Cliente cliente) {

        if(verificarCPF_Cliente(cliente.getCpf()) && verificarIdade(cliente.getDataDeNascimento())){
            locadora.listaClientes.add(cliente);
            return true;
        }
        return false;
    }

    public void removerCliente(String cpf, Cliente cliente){
        for (int i = 0; i < locadora.listaClientes.size(); i++)
            if ((locadora.listaClientes.get(i)).getCpf() == cpf && locadora.analisarReservasCliente(cliente))
                locadora.listaClientes.remove(i);
    }

    public static boolean loginCliente(String cpf, String senha){
        for(int i=0;i<locadora.listaClientes.size();i++){
            if((locadora.listaClientes).get(i).getCpf() == cpf && (locadora.listaClientes).get(i).getSenha() == senha){
                return true; // Login efetuado com sucesso
            }
        }
        return false; // Não existe o usuário ou senha incorreta
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

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        dateFormat.format(cal.getTime());

        cal.add(Calendar.YEAR,18);
        return dataDeNascimento.before(cal);
    }
    */
}
