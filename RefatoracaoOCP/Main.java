package POO_IF_Aulas.RefatoracaoOCP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Email email = new Email();
        //Sms sms = new Sms();
        //Whatsapp whatsapp = new Whatsapp();

        Notificador notificador = new Notificador();

        Notificacao email = new Email();
        Notificacao sms = new Sms();
        Notificacao whatsapp = new Whatsapp();

        notificador.notificar(email);
        notificador.notificar(sms);
        notificador.notificar(whatsapp);

    }
}
