package Estudos.RefatoracaoOCP;

public class Sms extends Notificacao{
    @Override
    public void enviar(){
        System.out.println("SMS enviado com sucesso!");

    }
}
