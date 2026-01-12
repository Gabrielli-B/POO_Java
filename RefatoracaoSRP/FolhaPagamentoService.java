package Estudos.RefatoracaoSRP;

public class FolhaPagamentoService {
    private double inss;
    private double ir;
    private double salarioLiquido;

    private Funcionario funcionario;

    public FolhaPagamentoService(Funcionario funcionario) {
        this.funcionario = funcionario;

    }

    private void calcularFolhaPagamento() {
        inss = funcionario.getSalarioBruto() * 0.11;
        ir = funcionario.getSalarioBruto() * 0.075;
        salarioLiquido = funcionario.getSalarioBruto() - inss - ir;
    }
    public void infoFolhaPagamento(){
        System.out.println("Calculando folha de pagamento...");
        calcularFolhaPagamento();
        System.out.printf("INSS: R$ %.3f | IR: R$ %.3f | Líquido: R$ %.3f\n\n", inss, ir, salarioLiquido);
    }
}
