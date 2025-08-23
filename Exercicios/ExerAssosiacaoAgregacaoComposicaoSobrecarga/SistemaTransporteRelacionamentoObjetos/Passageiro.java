package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaTransporteRelacionamentoObjetos;

public class Passageiro {
    private String nome;
    private String cpf;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}
