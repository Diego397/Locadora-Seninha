/*
package locadorasenninha.Controller;

import locadorasenninha.Model.Carro;
import locadorasenninha.Model.Locadora;


public class CarroController {
    public boolean verificaCadastrarCarro(String modelo, String placa, String cor, String chassi, int passageiros, double bagagem, double taxaDiaria, double taxaAtraso)
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
                                Carro carro = new Carro (modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso); //chama cadastrarCarro da model
                                return carro.cadastrarCarro(carro);
                                
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
*/
