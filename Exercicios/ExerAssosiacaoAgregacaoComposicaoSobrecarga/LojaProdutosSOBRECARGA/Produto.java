package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.LojaProdutosSOBRECARGA;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void atualizaEstoque(int qtdNova){
        this.qtdEstoque=qtdNova;
        System.out.println("Quantidade de estoque agora é de "+this.qtdEstoque +" Do produto "+this.nome);
        System.out.println("--------------------------------------------------------");
    }

    public void atualizaEstoque(int qtdNova, String justificativa){
        this.qtdEstoque=qtdNova;
        System.out.println("Quantidade de estoque agora é de "+this.qtdEstoque+" Do produto "+this.nome);
        System.out.println("Justificativa "+justificativa);
        System.out.println("--------------------------------------------------------");
    }

    public void atualizaEstoque(int qtdNova, LocalDate data){
        this.qtdEstoque=qtdNova;
        System.out.println("Quantidade de estoque agora é de "+this.qtdEstoque+" Do produto "+this.nome);
        System.out.println("Data --> "+data);
        System.out.println("--------------------------------------------------------");
    }
}
