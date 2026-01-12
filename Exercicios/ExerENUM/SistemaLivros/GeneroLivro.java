package Estudos.Exercicios.ExerENUM.SistemaLivros;

public enum GeneroLivro {
    FICCAO("Ficção"),
    ROMANCE("Romance"),
    TERROR("Terror"),
    EDUCATIVO("Educativo");

    private String genero;

    GeneroLivro(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
