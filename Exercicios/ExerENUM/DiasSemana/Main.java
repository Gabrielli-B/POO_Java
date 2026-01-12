package Estudos.Exercicios.ExerENUM.DiasSemana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda(DiaDaSemana.SEGUNDA,"Ir ao dentista");
        Agenda agenda2 = new Agenda(DiaDaSemana.SABADO,"Aniversário prima");
        Agenda agenda3 = new Agenda(DiaDaSemana.DOMINGO,"Visitar amigos");

        List<Agenda> compromissos = new ArrayList<>();
        compromissos.add(agenda1);
        compromissos.add(agenda2);
        compromissos.add(agenda3);

        for(Agenda agendas : compromissos){
            agendas.exibirInformacoes();
        }
    }
}
