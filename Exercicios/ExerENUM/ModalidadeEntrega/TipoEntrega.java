package POO_IF_Aulas.Exercicios.ExerENUM.ModalidadeEntrega;

public enum TipoEntrega {
    RETIRADA_LOJA("Retirada na loja"),
    ENTREGA_NORMAL("Entrega na modalidade normal"),
    ENTREGA_EXPRESSA("Entrega na modalidade expressa");

    private String tipoRetirada;

    TipoEntrega(String tipoRetirada) {
        this.tipoRetirada = tipoRetirada;
    }

    public String getTipoRetirada() {
        return tipoRetirada;
    }
}
