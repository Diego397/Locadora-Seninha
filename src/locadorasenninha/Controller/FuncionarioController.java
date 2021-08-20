package locadorasenninha.Controller;
import locadorasenninha.Model.Funcionario;

import java.util.Calendar;

public class FuncionarioController {
    public boolean cadastrarFuncionario(String nome, String cpf, Calendar dataDeNascimento,
                                        String endereco, String email, String cep, String telefone, String senha){
        if(nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 11 && dataDeNascimento != null &&
        endereco != null && endereco.length() > 0 && endereco.length() < 300 && email != null && email.length() > 0 &&
                email.length() < 100 && cep != null && cep.length() == 8 && telefone!= null && telefone.length()>=11 && telefone.length() < 15
        && senha != null && senha.length() < 30)
        {
            Funcionario funcionario = new Funcionario (nome, cpf, dataDeNascimento, endereco, email, cep, telefone, senha);
            boolean aux = funcionario.cadastrarFuncionario(funcionario);
            if(aux) {
                return true;
            }
        }
        return false;
    }

    public boolean removerFuncionario(String cpf){
        if (cpf != null && cpf.length() == 11 ){
            boolean aux = removerFuncionario(cpf);
            if(aux)
                return true;
        }
        return false;
    }

    public boolean loginFuncionario(String cpf, String senha){
        if(cpf != null && cpf.length() == 11 && senha != null && senha.length() < 30){
            boolean aux = loginFuncionario(cpf, senha);
            if(aux)
                return true;
        }
        return false;
    }
}
