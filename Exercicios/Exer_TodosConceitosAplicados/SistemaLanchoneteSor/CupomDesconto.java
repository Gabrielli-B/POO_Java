package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLanchoneteSor;

public enum CupomDesconto {
    NENHUM(0.0),
    PROMO5(5.0),
    PROMO10(10.0),
    PROMO20(20.0);

    private Double valorDoCupom;

    CupomDesconto(Double valorDoCupom) {
        this.valorDoCupom = valorDoCupom;
    }

    public Double getValorDoCupom() {
        return valorDoCupom;
    }
}
