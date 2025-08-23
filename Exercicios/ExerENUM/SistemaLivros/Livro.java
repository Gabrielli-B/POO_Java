package POO_IF_Aulas.Exercicios.ExerENUM.SistemaLivros;

public class Livro {
    private String titulo;
    private String autor;
    private GeneroLivro generoLivro;

    public Livro(String titulo, String autor, GeneroLivro generoLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.generoLivro = generoLivro;
    }

    public GeneroLivro getGeneroLivro() {
        return generoLivro;
    }

    public void infoLivro(){
        System.out.println(this.titulo+" ( "+this.autor+" )");
    }
}
