package locadorasenninha.Model;

import locadorasenninha.Controller.LocadoraController;

import java.io.*;
import java.util.ArrayList;

public class ManipuladorArquivo {
    //Ler dados do arquivo e salva na locadora
    public static void leitor(String path, Locadora locadora, LocadoraController controller) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

        //Ler Clientes e salvar no ArrayList
        try{
            linha = buffRead.readLine();
            //System.out.println(linha);
            int tam = Integer.parseInt(linha);
            //System.out.println(tam);
            for (int i = 0; i < tam; i++) {
                linha = buffRead.readLine();
                String nome = linha;
                //System.out.println(nome);

                linha = buffRead.readLine();
                String cpf = linha;
                //System.out.println(cpf);

                linha = buffRead.readLine();
                String dataDeNascimento = linha;

                linha = buffRead.readLine();
                String email = linha;

                linha = buffRead.readLine();
                String endereco = linha;

                linha = buffRead.readLine();
                String cep = linha;

                linha = buffRead.readLine();
                String telefone = linha;

                linha = buffRead.readLine();
                String senha = linha;
                //System.out.println(linha);

                locadora.cadastrarCliente(nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        //Ler carros e gravar no arraylist
        try{
            linha = buffRead.readLine();
            int tam = Integer.parseInt(linha);
            //System.out.println(tam);
            for (int i = 0; i < tam; i++) {

                linha = buffRead.readLine();
                String modelo = linha;

                linha = buffRead.readLine();
                String placa = linha;

                linha = buffRead.readLine();
                String cor = linha;

                linha = buffRead.readLine();
                String chassi = linha;

                linha = buffRead.readLine();
                String passageiros = linha;

                linha = buffRead.readLine();
                String bagagem = linha;

                linha = buffRead.readLine();
                double taxaDiaria = Double.parseDouble(linha);

                linha = buffRead.readLine();
                double taxaAtraso = Double.parseDouble(linha);

                locadora.cadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso);
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        //Ler funcionarios e gravar no ArrayList
        try{
            linha = buffRead.readLine();
            int tam = Integer.parseInt(linha);
            //System.out.println(tam);
            for (int i = 0; i < tam; i++) {

                linha = buffRead.readLine();
                String nome = linha;

                linha = buffRead.readLine();
                String cpf = linha;

                linha = buffRead.readLine();
                String dataDeNascimento = linha;

                linha = buffRead.readLine();
                String endereco = linha;

                linha = buffRead.readLine();
                String email = linha;

                linha = buffRead.readLine();
                String cep = linha;

                linha = buffRead.readLine();
                String telefone = linha;

                linha = buffRead.readLine();
                String senha = linha;

                controller.verificaCadastrarFuncionario(nome, cpf, dataDeNascimento, endereco, email, cep, telefone, senha);
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        buffRead.close();

        /* //Ler reservas e gravar no ArrayList
        try{
            linha = buffRead.readLine();
            int tam = Integer.parseInt(linha);
            for (int i = 0; i < tam; i++) {

                linha = buffRead.readLine();
                String modelo = linha;

                linha = buffRead.readLine();
                String placa = linha;
                linha = buffRead.readLine();
                String cor = linha;

                linha = buffRead.readLine();
                String chassi = linha;

                linha = buffRead.readLine();
                String passageiros = linha;

                linha = buffRead.readLine();
                String bagagem = linha;

                linha = buffRead.readLine();
                double taxaDiaria = Double.parseDouble(linha);

                linha = buffRead.readLine();
                double taxaAtraso = Double.parseDouble(linha);

                //controller.verificaFazerReserva(numeroReserva, dataEmissao, dataRetirada, dataDevolucao, Carro carro, Cliente cliente, funcionario, valorTotalDiaria, valorTotalAtraso, valorTotalGeral)
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }*/
    }

    // Escreve dados da locadora no arquivo
    public static void escritor(String path, Locadora locadora) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";

        ArrayList<Cliente> clientes= locadora.getClientes();
        buffWrite.append(String.valueOf(clientes.size()));
        buffWrite.append("\n");

        for (int i = 0; i < clientes.size(); i++){

            buffWrite.append( clientes.get(i).getNome() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getCpf() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getDataDeNascimento() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getEmail() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getEndereco() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getCep() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getTelefone() );
            buffWrite.append("\n");
            buffWrite.append( clientes.get(i).getSenha() );
            buffWrite.append("\n");

        }

        ArrayList<Carro> carros = locadora.getCarros();
        buffWrite.append(String.valueOf(carros.size()));
        buffWrite.append("\n");

        for (int i = 0; i < carros.size(); i++){

            buffWrite.append( carros.get(i).getModelo() );
            buffWrite.append("\n");
            buffWrite.append( carros.get(i).getPlaca() );
            buffWrite.append("\n");
            buffWrite.append( carros.get(i).getCor() );
            buffWrite.append("\n");
            buffWrite.append( carros.get(i).getChassi() );
            buffWrite.append("\n");
            buffWrite.append( carros.get(i).getPassageiros() );
            buffWrite.append("\n");
            buffWrite.append( carros.get(i).getBagagem() );
            buffWrite.append("\n");
            buffWrite.append( String.valueOf(carros.get(i).getTaxaDiaria()) );
            buffWrite.append("\n");
            buffWrite.append( String.valueOf(carros.get(i).getTaxaAtraso()) );
            buffWrite.append("\n");

        }

        ArrayList<Funcionario> funcionarios = locadora.getFuncionarios();
        buffWrite.append(String.valueOf(funcionarios.size()));
        buffWrite.append("\n");

        for (int i = 0; i < funcionarios.size(); i++){

            buffWrite.append( funcionarios.get(i).getNome() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getCpf() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getDataDeNascimento() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getEndereco() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getEmail() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getCep() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getTelefone() );
            buffWrite.append("\n");
            buffWrite.append( funcionarios.get(i).getSenha() );
            buffWrite.append("\n");

        }

        buffWrite.close();
    }

    public static void main(String[] args) {
        ManipuladorArquivo arq = new ManipuladorArquivo();
        Locadora locadora = new Locadora();
        LocadoraController controller = new LocadoraController(locadora);

        try {
            arq.leitor("src/locadorasenninha/Model/Dados.txt", locadora, controller);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            arq.escritor("src/locadorasenninha/Model/Dados.txt", locadora);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
