package locadorasenninha.Model;

import java.util.ArrayList;
import java.util.Date;

public class Carro {
    
    //Atributos:
    private String modelo;
    private String placa;
    private String cor;
    private String chassi;
    private boolean Status; //True = Disponível e False = Indisponível
    private int passageiros;
    private double bagagem;
    private double taxaDiaria;
    private double taxaAtraso;
    //private static Locadora locadora;

    //private imagem;

    //Lista de Reservas do Carro:
    private ArrayList<Reserva> reservasCarro = new ArrayList<Reserva>();

    //Método Construtor:

    public Carro(String modelo, String placa, String cor, String chassi, 
                  int passageiros, double bagagem, double taxaDiaria, 
                  double taxaAtraso) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.chassi = chassi;
        this.Status = true; //Um carro, ao ser cadastrado já é disponível
        this.passageiros = passageiros;
        this.bagagem = bagagem;
        this.taxaDiaria = taxaDiaria;
        this.taxaAtraso = taxaAtraso;
        //this.locadora = locadora;
    }
    

    //Métodos Getters e Setters:
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getBagagem() {
        return bagagem;
    }

    public void setBagagem(double bagagem) {
        this.bagagem = bagagem;
    }

    public double getTaxaDiaria() {
        return taxaDiaria;
    }

    public void setTaxaDiaria(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    public ArrayList<Reserva> getReservasCarro() {
        return reservasCarro;
    }


    public void setReservasCarro(ArrayList<Reserva> reservasCarro) {
        this.reservasCarro = reservasCarro;
    }
    
    //Métodos Operacionais
/*
    public boolean cadastrarCarro(Carro carro) {

        if(verificarPlaca(carro.placa)){
            locadora.listaCarros.add(carro);
            return true;
        }
        return false;
    }    
    
    public boolean verificarPlaca (String placa){

        for(int i=0;i<locadora.listaCarros.size();i++){
            if((locadora.listaCarros).get(i).getPlaca() == placa){
                return false;
            }
        }
        return true;
    }

    public static boolean removerCarro(String placa){ 
        for (int i = 0; i < locadora.listaCarros.size(); i++)
        {
            if (((locadora.listaCarros.get(i)).getPlaca() == placa))
            {
                Carro carro = locadora.listaCarros.get(i);
                if (locadora.analisarReservasCarro(carro))
                {
                    (locadora.listaCarros).remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean devolverCarro(Carro carro){
        for(int i = 0; i < locadora.reservasLocadora.size();i++){
            if(locadora.reservasLocadora.get(i).getCarro() == carro){
                locadora.reservasLocadora.remove(carro);
                return true;
            }
        }
        return false;

    }

   */
    
}
