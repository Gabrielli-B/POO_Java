package Estudos.Exercicios.ExerENUM.SistemaLivros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    public void adicionarBiblioteca(Livro l){
        livros.add(l);
    }
}
