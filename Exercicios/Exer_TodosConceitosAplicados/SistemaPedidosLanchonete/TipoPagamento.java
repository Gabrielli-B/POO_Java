package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

public enum TipoPagamento {
    CREDITO("Pagamento efetuado na modalidade crédito"),
    DEBITO("Pagamento efetuado na modalidade Débito"),
    PIX("Pagamento efetuado com sucesso"),
    DINHEIRO("Pagamento efetuado com sucesso");

    private String mensagem;

    TipoPagamento(String mensagem) {
        this.mensagem = mensagem;
    }

    public void infoPagamento(){
        System.out.println(mensagem);
    }
}
