package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public enum PagamentoTipo {
    DINHEIRO("Pagamento efetuado em espécie"),
    CARTAO("Pagamento efetuado no cartão"),
    PIX("Pagamento efetuado no pix"),
    NENHUM("Nenhuma forma de pagamento selecionada"),
    BOLETO("AGUARDANDO COMPENSAÇÃO DO BOLETO");

    private String formaPagamento;

    PagamentoTipo(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void exibirFormaPagamento(){
        System.out.println(this.formaPagamento);
    }
}
