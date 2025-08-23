package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.RepositorioCodigoSOBRECARGA_LISTA;

import java.time.LocalDate;

public class Commits {
    private String mensagem;
    private LocalDate data;
    private String autor;

    public Commits(String mensagem, LocalDate data, String autor) {
        this.mensagem = mensagem;
        this.data = data;
        this.autor = autor;
    }
    public Commits(String mensagem, String autor){
        this.mensagem = mensagem;
        this.autor = autor;
        this.data=LocalDate.now();
    }

    public void infoCommits(){
        System.out.println(this.mensagem);
        System.out.println(this.autor);
        System.out.println(this.data);
    }
}
