package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos=new ArrayList<>();
    private TipoPagamento tipoPagamento;
    private CupomDesconto cupomDesconto;


    public Pedido(Cliente cliente,TipoPagamento tipoPagamento, CupomDesconto cupomDesconto) {
        this.cliente=cliente;
        this.tipoPagamento = tipoPagamento;
        this.cupomDesconto = cupomDesconto;
    }

    public Pedido(Cliente cliente,TipoPagamento tipoPagamento) {
        this.cliente=cliente;
        this.tipoPagamento = tipoPagamento;
        this.cupomDesconto = CupomDesconto.NENHUM;
    }

    public CupomDesconto getCupomDesconto() {
        return cupomDesconto;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public Double valorBrutoPedido(){
        Double valor=0.0;
        for(Produto p : produtos ){
            valor+=p.getPreco();
        }
        return valor;
    }

    public Double valorTotalPedido(){
        Double valor = valorBrutoPedido();
        if(produtos.size()>5 && this.cupomDesconto==CupomDesconto.PROMO20){
            valor-=CupomDesconto.PROMO20.getDesconto();
            System.out.println("CUPOM APLICADO! R$ 20");
        }
        if(produtos.size()>5 && this.cupomDesconto==CupomDesconto.NENHUM){
            valor=valor-(valor*0.10);
            System.out.println("CUPOM APLICADO! 10%");
        }
        if(produtos.size()<=5 && !this.cupomDesconto.equals(CupomDesconto.PROMO20)){
            valor-=getCupomDesconto().getDesconto();
        }
        return valor;
    }

    public void exibirResumo(){
        System.out.println("Cliente ==> "+cliente.getNome());
        for(Produto p: produtos){
            p.infoProduto();
        }
        System.out.println(String.format("Valor total R$ %.2f",valorTotalPedido()));
        this.tipoPagamento.infoPagamento();
    }
}
