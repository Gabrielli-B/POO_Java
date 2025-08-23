package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaGerenciamentoCursos_ASSOCIACAO;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("TSI",380);
        Curso curso2 = new Curso("ECA",450);

        Aluno aluno1 = new Aluno("Maria",1234,curso1);
        Aluno aluno2 = new Aluno("João",4642,curso1);
        Aluno aluno3 = new Aluno("Diara",6742,curso1);
        Aluno aluno4 = new Aluno("Romulo",8735,curso2);
        Aluno aluno5 = new Aluno("Lua",1286,curso2);
        Aluno aluno6 = new Aluno("Taynara",8535,curso2);

        curso1.adicionarAlunosNoCurso(aluno1);
        curso1.adicionarAlunosNoCurso(aluno2);
        curso1.adicionarAlunosNoCurso(aluno3);
        curso2.adicionarAlunosNoCurso(aluno4);
        curso2.adicionarAlunosNoCurso(aluno5);
        curso2.adicionarAlunosNoCurso(aluno6);

        curso1.infosAlunosCadastradosNosCursos();
        curso2.infosAlunosCadastradosNosCursos();
        curso1.listagemCadastradosNosCurso();
        curso2.listagemCadastradosNosCurso();
    }
}
