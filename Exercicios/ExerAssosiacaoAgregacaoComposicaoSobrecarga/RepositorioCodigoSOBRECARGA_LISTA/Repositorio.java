package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.RepositorioCodigoSOBRECARGA_LISTA;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private String nome;
    private String linguagem;
    private List<Commits> commits;

    public Repositorio(String nome, String linguagem) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.commits=new ArrayList<>();
    }

    public void adicionandoCommit(Commits commit){
        commits.add(commit);
    }
    public void infosCommtisNoRepositorio(){
        System.out.println("--------- Repositório  ---------------------------");
        System.out.println("Linguagem => "+this.linguagem);
        for(Commits c: commits){
            c.infoCommits();
            System.out.println("===========================================");
        }
    }
}
