package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

public enum FormaPagamento {
    CARTAO("Pagamento realizado com cartão"),
    BOLETO("Aguardando compensação bancária"),
    TRANSFERENCIA("Transferência eletrônica aceita"),
    DINHEIRO("Pagamento confirmado em espécie");

    private String tipoPagamento;

    FormaPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void infoPagamento(){
        System.out.println(this.tipoPagamento);
    }
}
