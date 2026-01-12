package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    private List<Produto> produtos;
    private String id;

    //public Pedido(String id) {
      //  this.id = id;
    //}

    public Pedido(){
        this.produtos = new ArrayList<>();
    }

    protected void adicionarProduto(Produto produto){
        if(produto == null){
            throw new ProdutoInvalidoException("Produto não pode ser nulo!");
        }
        produtos.add(produto);
    }

    protected String getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    abstract double calcularTotal();
}
