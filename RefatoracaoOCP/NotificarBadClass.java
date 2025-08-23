package POO_IF_Aulas.RefatoracaoOCP;

public class NotificarBadClass {

    public void notificar(String canal) {
        if (canal.equals("EMAIL")) {
                System.out.println("Enviando e-mail...");
        } else if (canal.equals("SMS")) {
                System.out.println("Enviando SMS...");
        } else if (canal.equals("PUSH")) {
            System.out.println("Enviando notificação push...");
        } else {
            System.out.println("Canal de notificação inválido.");
        }
    }
}

