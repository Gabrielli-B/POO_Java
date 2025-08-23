package POO_IF_Aulas.RefatoracaoOCP;

public class Whatsapp extends Notificacao{

    @Override
    public void enviar(){
        System.out.println("Mensagem de WhatsApp enviada");
    }
}
