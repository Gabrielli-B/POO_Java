package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

public enum DescontoFidelidade {
    NENHUM(0.0),
    OURO(100.0),
    PRATA(50.0),
    BRONZE(20.0);

    private Double desconto;

    DescontoFidelidade(Double desconto) {
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }
}
