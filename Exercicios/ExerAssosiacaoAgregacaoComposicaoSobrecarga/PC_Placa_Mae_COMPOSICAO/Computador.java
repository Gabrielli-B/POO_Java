package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.PC_Placa_Mae_COMPOSICAO;

public class Computador {
    private String marca;
    private String modelo;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, PlacaMae placaMae) {
        this.marca = marca;
        this.modelo = modelo;
        this.placaMae = placaMae;
    }
    public void infoComputador(){
        System.out.println("Marca  | "+this.marca);
        System.out.println("Modelo | "+this.modelo);
        System.out.println("--> Dados da Placa-mãe");
        this.placaMae.infoPlacaMae();
        System.out.println("-------------------------");
    }
}
