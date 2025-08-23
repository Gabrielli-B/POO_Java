package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

public class ServicoExtra {
    private String descricao;
    private Double valor;

    public ServicoExtra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void infoServicoExtra(){
        System.out.println(this.descricao+" | "+this.valor+" R$");
    }
}
