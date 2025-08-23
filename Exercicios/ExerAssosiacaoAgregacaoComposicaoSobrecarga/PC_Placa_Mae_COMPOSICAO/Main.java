package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.PC_Placa_Mae_COMPOSICAO;

public class Main {
    public static void main(String[] args) {
        PlacaMae placaMae1 = new PlacaMae("Sonny","LGA1200",2);
        Computador computadorSonny = new Computador("Sonny","Sonny Ultra",placaMae1);

        computadorSonny.infoComputador();

        PlacaMae placaMae2 = new PlacaMae("Lenovo","LBA1500",5);
        Computador computadorLenovo = new Computador("Lenovo","Lenovo Ultra",placaMae2);

        computadorLenovo.infoComputador();

    }
}
