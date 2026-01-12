package Estudos.Exercicios.ExerENUM.StatusPedido;

public enum StatusPedido {
    PENDENTE("Quase lá! Seu pedido já já será analisado"),
    PROCESSANDO("Falta pouco! Seu pedido está sendo processado"),
    ENVIADO("Oba!seu pedido foi enviado"),
    ENTREGUE("MARAVILHA! Pedido entregue");

    private String mensagem;

    StatusPedido(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
