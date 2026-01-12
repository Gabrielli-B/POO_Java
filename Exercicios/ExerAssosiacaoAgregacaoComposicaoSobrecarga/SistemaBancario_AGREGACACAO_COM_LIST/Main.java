package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaBancario_AGREGACACAO_COM_LIST;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabrielli","836.667.234-90");
        Cliente c2 = new Cliente("Henri","832.572.304-00");

        ContaBancaria banrisul = new ContaBancaria(8822129,c1);
        ContaBancaria sicred = new ContaBancaria(83732039,c2);

        //ContaBancaria banrisul = new ContaBancaria(8822129,c1);
        //ContaBancaria banrisul = new ContaBancaria(8822129,c1);

        banrisul.depositar(-9);
        banrisul.depositar(60);
        banrisul.sacar(-8);
        banrisul.sacar(150);
        banrisul.sacar(90);

        banrisul.transferencia(c1,c2,30);
    }
}
