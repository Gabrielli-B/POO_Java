package POO_IF_Aulas.Enum;

public enum TipoPagamento {
    BOLETO("Boleto"),
    CREDITO("Cartão Crédito"),
    DEBITO("Cartão de Débito"),
    DINHEIRO("Dinheiro"),
    PIX("Transferencia via pix");

    private final String formaDePagamento;

    TipoPagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
}
