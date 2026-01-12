package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemasReservasHotelCOMPOSICAO;

public class Quarto {
    private int numero;
    private int capacidade;
    private float preco;
    private Hotel hotel;

    public Quarto(int numero, int capacidade, float preco, Hotel hotel) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.preco = preco;
        this.hotel = hotel;
    }

    public float getPreco() {
        return preco;
    }

    public void infoQuarto(){
        System.out.println("Número : "+this.numero+" | capacidade : "+this.capacidade+" | Preço diária : "+this.preco);
        System.out.println("______________________________________________________________________________________");
    }
}
