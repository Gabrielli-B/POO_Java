package Estudos.RefatoracaoSRP;

public class EmailService {
    private Funcionario funcionario;

    public void enviarEmailBoasVindas(Funcionario funcionario) {
        System.out.println("Enviando e-mail para: " + funcionario.getEmail());
        System.out.println("Assunto: Bem-vindo ao time!");
        System.out.printf("Mensagem: Olá %s, seja bem-vindo(a) ao cargo de %s!\n\n", funcionario.getNome(), funcionario.getCargo());
    }
}
