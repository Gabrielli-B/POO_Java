package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

public class Produto {
    private String nome;
    private Double preco;


    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }
    public void infoProduto(){
        System.out.println(this.nome+" | Preço: "+this.preco+" R$");
    }
}
