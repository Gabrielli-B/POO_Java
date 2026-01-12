package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class Bolo implements Produto,Descontavel{
    String nome = "BOLO";
    double preco = 10.00;
    double desconto = 10.00;

    @Override
    public double calcularDesconto() {
        double descontoAux =1-(desconto/100);
        return preco*descontoAux;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
