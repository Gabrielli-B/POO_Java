package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemasReservasHotelCOMPOSICAO;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> quartosHotel;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartosHotel =new ArrayList<>();
    }
    public void adicionarQuartos(Quarto quarto){
        quartosHotel.add(quarto);
    }
    public float reservarCustoHospedagem(int dias, Quarto quarto){
        float precoTotalDias=0;
        if(this.quartosHotel.contains(quarto)){
            precoTotalDias=quarto.getPreco();
            precoTotalDias*=dias;
        }
        return  precoTotalDias;
    }
    public void exibirPrecoReserva(float valorTotal){
        System.out.println("Valor total a ser pago ---> " +valorTotal+" R$");
    }
    public void infoQuartosHotel(){
        for(Quarto quarto: quartosHotel){
            quarto.infoQuarto();
        }
    }
}
