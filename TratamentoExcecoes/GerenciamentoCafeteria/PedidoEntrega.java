package POO_IF_Aulas.TratamentoExcecoes.GerenciamentoCafeteria;

public class PedidoEntrega extends Pedido{
    private String endereco;
    final double TAXA_ENTREGA = 5.00;

    public PedidoEntrega( String endereco) {
        if(endereco == null){
            throw new EnderecoInvalidoException("Endereço não pode ser nulo!");
        }
        this.endereco = endereco;
    }

    @Override
    double calcularTotal() {
        if (getProdutos() == null || getProdutos().isEmpty()){
            throw new IllegalStateException("Não é possível calular o total de um pedido vazio");
        }
        double total = 0.0;

        for(Produto p:getProdutos()){
            total += p.getPreco();
        }
        total+=TAXA_ENTREGA;

        return total;
    }
}
