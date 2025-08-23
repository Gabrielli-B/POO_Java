package POO_IF_Aulas.RefatoracaoSRP;

public class ProcessadorDeAdmissao {
    private FuncionarioEmpresa funcionarioEmpresa;

    public ProcessadorDeAdmissao(FuncionarioEmpresa funcionarioEmpresa) {
        this.funcionarioEmpresa = funcionarioEmpresa;
    }

    public void processar(Admissao admissao){
        Funcionario funcionario = admissao.getFuncionario();

        EmailService emailService = new EmailService();
        emailService.enviarEmailBoasVindas(funcionario);

        ContratoService contratoService = new ContratoService(admissao);
        contratoService.imprimirContrato();

        FolhaPagamentoService folhaService = new FolhaPagamentoService(funcionario);
        folhaService.infoFolhaPagamento();

        funcionarioEmpresa.salvarFuncionario(funcionario);
    }

}
