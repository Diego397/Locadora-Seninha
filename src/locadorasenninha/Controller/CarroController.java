package locadorasenninha.Controller;

import locadorasenninha.Model.Locadora;
import locadorasenninha.Model.Carro;

public class CarroController {
    public boolean VerifiCacadastrarCarro(String modelo, String placa, String cor, String chassi, int passageiros, double bagagem, double taxaDiaria, double taxaAtraso)
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
                                return Locadora.cadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso); //chama cadastrarCarro da model (nao sei porque esta reclamando que precisa ser static)
                                /*cadastrarCarro(String modelo, String placa, String cor, String chassi, int passageiros, double bagagem, double taxaDiaria, double taxaAtraso)*/
                            }
                        }
                    }
                }
            }
        }
        return false;
    }




    /*    public boolean cadastrarCarro(String modelo, String placa, String cor, String chassi,
                  int passageiros, double bagagem, double taxaDiaria, double taxaAtraso) {

        if(verificarPlaca(placa)){
            Carro carro = new Carro (modelo, placa, cor, chassi,
                  passageiros, bagagem, taxaDiaria, taxaAtraso);
            listaCarros.add(carro);
            return true;
        }
        return false;
    }*/
}
