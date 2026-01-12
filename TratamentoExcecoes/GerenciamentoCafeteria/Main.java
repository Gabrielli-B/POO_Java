package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class Main {
    public static void main(String[] args) {
        //PEDIDO LOCAL
        PedidoLocal pedidoLocal1  = new PedidoLocal();
        pedidoLocal1.adicionarProduto(new Cafe());
        pedidoLocal1.adicionarProduto(new Bolo());
        System.out.println("Total pedido: R$ "+pedidoLocal1.calcularTotal());

        //PEDIDO ENTREGA
        PedidoEntrega pedidoEntrega1 = new PedidoEntrega("Rua tirandentes,n 98");
        pedidoEntrega1.adicionarProduto(new Cafe());
        System.out.println("Total pedido: R$ "+pedidoEntrega1.calcularTotal());

        //TESTE EXCEÇÕES
        //PRODUTO NULO
        try{
            PedidoLocal pedidoLocalErro = new PedidoLocal();
            pedidoLocalErro.adicionarProduto(null);
        }catch (ProdutoInvalidoException e){
            System.out.println("Erro de produto: "+ e.getMessage());
        }


        //ENDEREÇO NULO
        try{
            PedidoEntrega pedidoEntregaErro = new PedidoEntrega(null);
        }catch (EnderecoInvalidoException e){
            System.out.println("Erro de endereço: "+e.getMessage());
        }

        //CALCULAR TOTAL PEDIDO VAZIO
        try {
            PedidoLocal pedidoLocalVazio = new PedidoLocal();
            System.out.println("Total pedido vazio: R$ "+pedidoLocalVazio.calcularTotal());
        }catch (IllegalStateException e){
            System.out.println("Erro ao calcular total de pedido vazio: "+e.getMessage());
        }
    }
}
