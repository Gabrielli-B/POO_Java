package POO_IF_Aulas.RefatoracaoOCP;

public class Email extends Notificacao{
    @Override
    public void enviar() {
        System.out.println("Enviando E-mail...");

    }
}
