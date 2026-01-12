package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemasReservasHotelCOMPOSICAO;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Parapalace","Rua deodoro martins, num 356");

        Quarto q1=new Quarto(1,2,50,hotel1);
        Quarto q2=new Quarto(2,4,150,hotel1);
        Quarto q3=new Quarto(3,8,250,hotel1);
        Quarto q4=new Quarto(4,16,450,hotel1);

        hotel1.adicionarQuartos(q1);
        hotel1.adicionarQuartos(q2);
        hotel1.adicionarQuartos(q3);
        hotel1.adicionarQuartos(q4);

        hotel1.infoQuartosHotel();

        float reserva1=hotel1.reservarCustoHospedagem(5,q1);
        float reserva2=hotel1.reservarCustoHospedagem(2,q4);


        hotel1.exibirPrecoReserva(reserva1);
        hotel1.exibirPrecoReserva(reserva2);

    }
}
