package locadorasenninha.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Funcionario {
    private String nome;
    private String cpf;
    private String dataDeNascimento; 
    private String endereco;
    private String email;
    private String cep;
    private String telefone;
    private String senha;
    
    //Funcionário precisa ter lista de reservas?
    private ArrayList<Reserva> reservas_funcionario = new ArrayList<Reserva>(); //não sabemos se precisa

    //Método Construtor:
    public Funcionario(String nome, String cpf, String dataDeNascimento, String endereco, String email, String cep, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.email = email;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public ArrayList<Reserva> getReservas_funcionario() {
        return reservas_funcionario;
    }

    public void setReservas_funcionario(ArrayList<Reserva> reservas_funcionario) {
        this.reservas_funcionario = reservas_funcionario;
    }


    //Métodos Operacionais

    /*
    public boolean cadastrarFuncionario(Funcionario funcionario) {

        if(verificarCPF_Funcionario(cpf) && verificarIdade(dataDeNascimento)){
            locadora.listaFuncionarios.add(this);
            return true;
        }
        return false;
    }

    public boolean verificarCPF_Funcionario(String cpf){

        for(int i=0;i<locadora.listaFuncionarios.size();i++){
            if((locadora.listaFuncionarios).get(i).getCpf() == cpf){
                return false;
            }
        }
        return true;
    }

    public boolean verificarIdade (Calendar dataDeNascimento){
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
    }

    public static boolean removerFuncionario(String cpf){
        for (int i = 0; i < locadora.listaFuncionarios.size(); i++)
            if ((locadora.listaFuncionarios.get(i)).getCpf() == cpf) {
                locadora.listaFuncionarios.remove(i);
                return true;
            }
        return false;
    }

    public static boolean loginFuncionario(String cpf, String senha){
        for(int i=0;i<locadora.listaFuncionarios.size();i++){
            if((locadora.listaFuncionarios).get(i).getCpf() == cpf && (locadora.listaFuncionarios).get(i).getSenha() == senha){
                return true; // Login efetuado com sucesso
            }
        }
        return false; // Não existe usuário ou senha incorreta
    }

    */

}
