package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.RepositorioCodigoSOBRECARGA_LISTA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Repositorio r1 = new Repositorio("Códigos em java","Java");

        Commits c1=new Commits("Commit para códigos em java", LocalDate.of(2025,4,20), "Gabrielli");
        Commits c2=new Commits("Commit para exercicios", LocalDate.of(2025,3,5), "Gabrielli");
        Commits c3=new Commits("Commit data local","gabrielli");
        r1.adicionandoCommit(c1);
        r1.adicionandoCommit(c2);
        r1.adicionandoCommit(c3);

        r1.infosCommtisNoRepositorio();


    }
}
