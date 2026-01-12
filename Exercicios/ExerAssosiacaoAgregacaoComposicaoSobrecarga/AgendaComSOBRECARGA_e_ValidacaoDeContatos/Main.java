package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.AgendaComSOBRECARGA_e_ValidacaoDeContatos;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Mariazinha","938492838","mariazinha@gmail.com");
        Contato c2 = new Contato("Joãozinho","394029304");
        Contato c3 = new Contato("Darlene","748493028");
        Contato c4 = new Contato("Josué","493872939","josue@gmail.com");

        Contato c5 = new Contato("Varuska","938492838555","varuska@gmail.com");
        Contato c6 = new Contato("Willian","83940");

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.inserindoAgenda(c1);
        agendaContatos.inserindoAgenda(c2);
        agendaContatos.inserindoAgenda(c3);
        agendaContatos.inserindoAgenda(c4);
        agendaContatos.inserindoAgenda(c5);
        agendaContatos.inserindoAgenda(c6);

        agendaContatos.exibindoAgendaContatos();

    }
}
