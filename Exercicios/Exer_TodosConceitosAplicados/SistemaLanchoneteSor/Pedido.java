package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLanchoneteSor;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente; // agregação
    private List<Produto> listaDeProdutos = new ArrayList<>(); // composição
    private TipoPagamento tipoPagamento;
    private CupomDesconto cupomDesconto;
    private Double valorTotalDoPedido = 0.0;

    // MÉTODOS CONSTRUTORES CRIADOS ATRAVÉS DO CONCEITO DE SOBRECARGA DE MÉTODOS
    public Pedido(Cliente cliente, List<Produto> listaDeProdutos, TipoPagamento tipoPagamento) {
        this.cliente = cliente;
        this.listaDeProdutos = listaDeProdutos;
        this.tipoPagamento = tipoPagamento;
    }

    public Pedido(Cliente cliente, TipoPagamento tipoPagamento, CupomDesconto cupomDesconto) {
        this.cliente = cliente;
        this.listaDeProdutos = listaDeProdutos;
        this.tipoPagamento = tipoPagamento;
        this.cupomDesconto = cupomDesconto;
    }

    public Pedido(Cliente cliente, List<Produto> listaDeProdutos, TipoPagamento tipoPagamento, CupomDesconto cupomDesconto) {
        this.cliente = cliente;
        this.listaDeProdutos = listaDeProdutos;
        this.tipoPagamento = tipoPagamento;
        this.cupomDesconto = cupomDesconto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public CupomDesconto getCupomDesconto() {
        return cupomDesconto;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public Double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(Double valorTotalDoPedido) {
        this.valorTotalDoPedido = valorTotalDoPedido;
    }

    public void adicionarProduto(Produto produto) {
        this.listaDeProdutos.add(produto);
    }

    public void exibirResumo() {
        System.out.println("********** RESUMO DO PEDIDO **********");
        this.totalizarPreco();
        this.exibirNomeDoCliente();
        this.exibirFormaDePagamento();
        this.aplicarDesconto();
        this.exibirValorFinalDoPedido();
        this.exibirProdutosDoPedido();
    }

    private void totalizarPreco() {
        for (Produto produto : this.getListaDeProdutos()) {
            valorTotalDoPedido += produto.getPreco();
        }
    }

    private void exibirNomeDoCliente() {
        System.out.println("-Nome do cliente: " + this.getCliente().getNome());
    }

    private void exibirFormaDePagamento() {
        if (this.getTipoPagamento().equals(TipoPagamento.PIX) || this.getTipoPagamento().equals(TipoPagamento.DINHEIRO)) {
            System.out.println("-Pagamento efetuado com sucesso via: " + this.getTipoPagamento());
        }

        if (this.getTipoPagamento().equals(TipoPagamento.CREDITO)) {
            System.out.println("-Pagamento efetuado na modalidade crédito");
        }

        if (this.getTipoPagamento().equals(TipoPagamento.DEBITO)) {
            System.out.println("-Pagamento efetuado na modalidade débito");
        }
    }

    private void aplicarDesconto() {
        if (this.getListaDeProdutos().size() > 5) {
            this.setValorTotalDoPedido(this.getValorTotalDoPedido() - CupomDesconto.PROMO20.getValorDoCupom());
        }

        if (this.getListaDeProdutos().size() < 5 && !this.getCupomDesconto().equals(CupomDesconto.PROMO20)) {
            this.setValorTotalDoPedido(this.getValorTotalDoPedido() - this.getCupomDesconto().getValorDoCupom());
        }
    }

    private void exibirValorFinalDoPedido() {
        System.out.println("-Valor total do pedido: " + this.getValorTotalDoPedido());
    }

    private void exibirProdutosDoPedido() {
        System.out.println("-Nomes dos produtos inseridos no pedido");
        for (Produto produto : this.getListaDeProdutos()) {
            System.out.println("-: " + produto.getNome());
        }
    }
}
