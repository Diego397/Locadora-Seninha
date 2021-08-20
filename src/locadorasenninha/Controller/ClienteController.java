package locadorasenninha.Controller;
import locadorasenninha.Model.Cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClienteController {

    public boolean cadastrarCliente(String nome, String cpf, String dataDeNascimentoString, String email, String endereco,
                                    String cep, String telefone, String senha) throws ParseException {
        // cpf.lenght é 11 ? (mesmo questionamento abaixo)
        // dataDeNascimentoString.length é 10 ou 8 ? (considera a / ou não?)
        // senha precisa de limite inferior ?
        if (nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 11
                && dataDeNascimentoString != null && dataDeNascimentoString.length() == 10 && email != null
                && email.length() > 0 && email.length() < 100 && endereco != null && endereco.length() > 0
                && endereco.length() < 300 && cep != null && cep.length() == 8 && telefone!= null
                && telefone.length()>10 && telefone.length() < 15 &&  senha != null && senha.length() < 30)
        {
            Calendar dataDeNascimento = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{ dataDeNascimento.setTime(sdf.parse(dataDeNascimentoString)); }
            catch (ParseException e) { e.printStackTrace(); }

            Cliente cliente = new Cliente(nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
            return cliente.cadastrarCliente(cliente);
        }
        return false;
    }

    public boolean removerCliente(String cpf){
        if (cpf != null && cpf.length() == 11 ) {
            //return removerCliente(cpf);
        }
        return false;
    }

    public boolean loginCliente(String cpf, String senha){
        if(cpf != null && cpf.length() == 11 && senha != null && senha.length() < 30){
            //return loginCliente(cpf, senha);
        }
        return false;
    }
}
