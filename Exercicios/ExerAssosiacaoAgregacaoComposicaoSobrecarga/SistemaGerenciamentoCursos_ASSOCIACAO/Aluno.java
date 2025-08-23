package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaGerenciamentoCursos_ASSOCIACAO;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso; //associação

    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }
}
