package locadorasenninha.Controller;

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
<<<<<<< Updated upstream
                                return Locadora.cadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso);
=======
                                Carro carro = new Carro (modelo, placa, cor, chassi,
                                        passageiros, bagagem, taxaDiaria, taxaAtraso); //chama cadastrarCarro da model (nao sei porque esta reclamando que precisa ser static)
                                return carro.cadastrarCarro(carro);
                                /*cadastrarCarro(String modelo, String placa, String cor, String chassi, int passageiros, double bagagem, double taxaDiaria, double taxaAtraso)*/
>>>>>>> Stashed changes
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean VerificaRemoverCarro(String placa)
    {
        if (placa != null && placa.length() == 7)
        {
            return Carro.removerCarro(placa); //Pede static
        }
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
        return false;
    }

    public boolean VerificaDevolverCarro(Carro carro)
    {
        if (carro != null)
        {
            return Carro.devolverCarro(carro); ////Pede static
        }
        return false;
    }
}
