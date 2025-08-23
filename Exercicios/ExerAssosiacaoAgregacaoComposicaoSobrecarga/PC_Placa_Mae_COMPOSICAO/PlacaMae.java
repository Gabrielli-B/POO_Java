package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.PC_Placa_Mae_COMPOSICAO;

public class PlacaMae {
    private String fabricante;
    private String socket;
    private int quantidadeSlotsMemoria;

    public PlacaMae(String fabricante, String socket, int quantidadeSlotsMemoria) {
        this.fabricante = fabricante;
        this.socket = socket;
        this.quantidadeSlotsMemoria = quantidadeSlotsMemoria;
    }
    public void infoPlacaMae(){
        System.out.println("Fabricante              --> "+ this.fabricante);
        System.out.println("Socket                  --> "+ this.socket);
        System.out.println("Quantidade Slot memória --> "+ this.quantidadeSlotsMemoria);
    }
}
