package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaGerenciamentoCursos_ASSOCIACAO;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private List<Aluno> alunosNoCurso;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunosNoCurso = new ArrayList<>();
    }

    public void adicionarAlunosNoCurso(Aluno aluno){
        alunosNoCurso.add(aluno);
    }

    public String getNomeCurso() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void infosAlunosCadastradosNosCursos(){
        for(Aluno aluno : alunosNoCurso){
            System.out.println("Nome          |  " + aluno.getNome());
            System.out.println("Curso         |  "+aluno.getCurso().getNomeCurso());
            System.out.println("Carga horária |  "+ aluno.getCurso().getCargaHoraria());
            System.out.println("Matrícula     |  "+aluno.getMatricula());
            System.out.println("--------------------------------------------------------------");
        }
    }
    public void listagemCadastradosNosCurso(){
        System.out.println("==> " +getNomeCurso());
        for(Aluno aluno : alunosNoCurso){
            System.out.println(aluno.getNome());
        }
        System.out.println("--------------------------------------------------------------");
    }
}
