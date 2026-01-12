package Estudos.Exercicios.ExerENUM.SistemaLivros;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro l1 = new Livro("Simplesmente acontece","Joana T.W",GeneroLivro.ROMANCE);
        Livro l2 = new Livro("O maravilhoso agora","Fernanda Lemos",GeneroLivro.EDUCATIVO);
        Livro l3 = new Livro("As vatagens de ser invisivel","Teodoro Fonseca",GeneroLivro.FICCAO);
        Livro l4 = new Livro("Terrívelmente apaixonado","Gloriano Abreu",GeneroLivro.ROMANCE);
        Livro l5 = new Livro("Através da fechadura","Tenório Verdoso",GeneroLivro.TERROR);
        Livro l6 = new Livro("Sempre tenha em mente","Janaina Tyslo",GeneroLivro.EDUCATIVO);
        Livro l7 = new Livro("330 dias","Joana T.W",GeneroLivro.ROMANCE);

        biblioteca.adicionarBiblioteca(l1);
        biblioteca.adicionarBiblioteca(l2);
        biblioteca.adicionarBiblioteca(l3);
        biblioteca.adicionarBiblioteca(l4);
        biblioteca.adicionarBiblioteca(l5);
        biblioteca.adicionarBiblioteca(l6);
        biblioteca.adicionarBiblioteca(l7);

        //percorrendo pelos valores do enum
        //interessante por isso em metodo no objeto Biblioteca
        for(GeneroLivro genero : GeneroLivro.values()){
            System.out.println("Genêro: "+genero.getGenero());
            for (Livro livro : biblioteca.livros){
                if(livro.getGeneroLivro()==genero){
                    livro.infoLivro();
                }
            }
            System.out.println("==========================================================================");
        }

    }
}
