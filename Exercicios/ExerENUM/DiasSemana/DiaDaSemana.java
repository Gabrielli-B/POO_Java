package Estudos.Exercicios.ExerENUM.DiasSemana;

public enum DiaDaSemana {
    SEGUNDA("Segunda"),
    TERCA("Terça"),
    QUARTA("Quarta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private String dia;

    DiaDaSemana(String dia) {
        this.dia = dia;
    }
    public String getDia() {
        return dia;
    }
}
