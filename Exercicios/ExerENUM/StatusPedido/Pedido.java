package Estudos.Exercicios.ExerENUM.StatusPedido;

public class Pedido {
    private int numeroPedido;
    private StatusPedido status;

    public Pedido(int numeroPedido, StatusPedido status) {
        this.numeroPedido = numeroPedido;
        this.status = status;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }
    public void infoPedido(){
        System.out.println("Número pedido "+getNumeroPedido()+" | "+getStatus().getMensagem());
    }
}
