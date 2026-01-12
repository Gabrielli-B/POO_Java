package Estudos.Exercicios.ExerENUM.DiasSemana;

public class Agenda {
    private DiaDaSemana diaCompromisso;
    private String descricaoCompromisso;

    public Agenda(DiaDaSemana diaCompromisso, String descricaoCompromisso) {
        this.diaCompromisso = diaCompromisso;
        this.descricaoCompromisso = descricaoCompromisso;
    }

    public DiaDaSemana getDiaCompromisso() {
        return diaCompromisso;
    }

    public String getDescricaoCompromisso() {
        return descricaoCompromisso;
    }
    public void exibirInformacoes(){
        System.out.println("Dia "+getDiaCompromisso().getDia() +" | "+getDescricaoCompromisso());

    }
}
