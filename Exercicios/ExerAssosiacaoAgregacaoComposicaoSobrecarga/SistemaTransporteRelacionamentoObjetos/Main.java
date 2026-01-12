package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaTransporteRelacionamentoObjetos;

public class Main {
    public static void main(String[] args) {

        Passageiro p1 = new Passageiro("carlos","948.552.494-23");
        Passageiro p2 = new Passageiro("carolina","024.351.214-24");
        Passageiro p3 = new Passageiro("cássio","902.254.203-77");

        Motorista m1 = new Motorista("Jemerson","Gol");
        Motorista m2 = new Motorista("Jair","Uno");
        Motorista m3 = new Motorista("Janaina","Touro");

        Corrida c1 = new Corrida(m1,p1,23.5F);
        Corrida c2 = new Corrida(m2,p2,10.5F);
        Corrida c3 = new Corrida(m1,p3,45.7F);

       c1.infoCorrida();
       c2.infoCorrida();
       c3.infoCorrida();

       m1.infoCorridasMotorista();

    }

}
