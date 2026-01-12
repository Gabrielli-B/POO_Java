package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

public enum CupomDesconto {
    NENHUM(0.0),
    PROMO5(5.0),
    PROMO10(10.0),
    PROMO20(20.0);

    private Double desconto;

    CupomDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }
}
