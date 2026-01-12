package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaTransporteRelacionamentoObjetos;

public class Corrida {
    private Motorista motorista;
    private Passageiro passageiro;
    private float distanciaPercorrida=0;
    private final float VALOR_BASE_CORRIDA = 2.50F;

    public Corrida(Motorista motorista, Passageiro passageiro,float distanciaPercorrida) {
        this.motorista = motorista;
        motorista.corridasMotorista(this);
        this.passageiro = passageiro;
        this.distanciaPercorrida=distanciaPercorrida;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public float valorCorrida(){
        float valorCorrida=this.distanciaPercorrida*VALOR_BASE_CORRIDA;
        return valorCorrida;
    }
    public void infoCorrida(){
        float valor=valorCorrida();
        System.out.println("Passageiro           | "+passageiro.getNome());
        System.out.println("Distância percorrida | "+this.distanciaPercorrida);
        System.out.println("Valor corrida        | "+ valor+" R$");
        System.out.println("--------------------------------------------------- ");
    }
}
