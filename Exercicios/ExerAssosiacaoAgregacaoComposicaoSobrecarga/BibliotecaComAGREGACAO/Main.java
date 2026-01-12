package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.BibliotecaComAGREGACAO;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();

        Livro livro1 = new Livro("Senhor dos aneis","Joao Alfredo",2003);
        Livro livro2 = new Livro("O maravilho novo mundo","Francisquinha",2015);
        Livro livro3 = new Livro("As vantagens de ser invisivel","Darlana Ferraz",2018);
        Livro livro4 = new Livro("A rebeldia","Dolores Card",2001);

        biblioteca1.adicionarLivrosNaBiblioteca(livro1);
        biblioteca1.adicionarLivrosNaBiblioteca(livro2);
        biblioteca1.adicionarLivrosNaBiblioteca(livro3);
        biblioteca1.adicionarLivrosNaBiblioteca(livro4);

        biblioteca1.removerLivroDaBiblioteca(livro1);

        biblioteca1.infosLivrosCadastrados();
    }
}
