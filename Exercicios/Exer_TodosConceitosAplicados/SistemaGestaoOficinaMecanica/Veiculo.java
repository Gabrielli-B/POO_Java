package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private Cliente cliente;

    public Veiculo(String placa, String modelo, String marca, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cliente=cliente;
        this.cliente.adicionarVeiculo(this);
    }
    public void infoVeiculo(){
        System.out.println("Placa: "+this.placa+" | Modelo: "+this.modelo+" | Marca: "+this.marca);
    }
}
