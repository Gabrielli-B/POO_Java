package Estudos.RefatoracaoSRP;
import java.time.LocalDate;

public class FuncionarioGodClass {
    private String nome;
    private String email;
    private String cargo;
    private double salarioBruto;
    private LocalDate dataAdmissao;

    public FuncionarioGodClass(String nome, String email, String cargo, double salarioBruto) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.dataAdmissao = LocalDate.now();
    }

    public void realizarProcessoAdmissional() {
        System.out.println("Iniciando processo de admissão...\n");

        salvarNoBanco();
        enviarEmailBoasVindas();
        imprimirContrato();
        calcularFolhaPagamento();

        System.out.println("Processo de admissão finalizado.\n");
    }

    private void salvarNoBanco() {
        System.out.println("Salvando funcionário no banco de dados...");
        System.out.printf("Nome: %s | Email: %s | Cargo: %s | Salário: R$ %.2f\n\n", nome, email, cargo, salarioBruto);
    }

    private void enviarEmailBoasVindas() {
        System.out.println("Enviando e-mail para: " + email);
        System.out.println("Assunto: Bem-vindo ao time!");
        System.out.printf("Mensagem: Olá %s, seja bem-vindo(a) ao cargo de %s!\n\n", nome, cargo);
    }

    private void imprimirContrato() {
        System.out.println("Imprimindo contrato de trabalho...");
        System.out.println("----- CONTRATO -----");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salarioBruto);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("---------------------\n");
    }

    private void calcularFolhaPagamento() {
        System.out.println("Calculando folha de pagamento...");
        double inss = salarioBruto * 0.11;
        double ir = salarioBruto * 0.075;
        double salarioLiquido = salarioBruto - inss - ir;

        System.out.printf("INSS: R$ %.2f | IR: R$ %.2f | Líquido: R$ %.2f\n\n", inss, ir, salarioLiquido);
    }

    // Getters para uso em outras classes após refatoração
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getCargo() { return cargo; }
    public double getSalarioBruto() { return salarioBruto; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }
}
