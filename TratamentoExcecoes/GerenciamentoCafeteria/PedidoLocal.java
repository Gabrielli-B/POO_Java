package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class PedidoLocal extends Pedido{

    //public PedidoLocal(String id) {
      //  super(id);
    //}

    @Override
    double calcularTotal() {
        if (getProdutos() == null || getProdutos().isEmpty()){
            throw new IllegalStateException("Não é possível calular o total de um pedido vazio");
        }
        double total = 0.0;

        for(Produto p: getProdutos()){
            total += p.getPreco();
        }
        return total;
    }

}
