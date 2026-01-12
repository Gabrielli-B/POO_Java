package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class Cafe implements Produto{
    private String nome = "CAFÉ";
    private double preco = 5.00;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
