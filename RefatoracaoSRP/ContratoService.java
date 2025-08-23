package POO_IF_Aulas.RefatoracaoSRP;

public class ContratoService {
    private Admissao admissao;

    public ContratoService(Admissao admissao) {
        this.admissao = admissao;
    }

    public void imprimirContrato() {
        System.out.println("Imprimindo contrato de trabalho...");
        System.out.println("----- CONTRATO -----");
        System.out.println("Nome: " + admissao.getFuncionario().getNome());
        System.out.println("Cargo: " + admissao.getFuncionario().getCargo());
        System.out.printf("Salário: R$ %.3f\n", admissao.getFuncionario().getSalarioBruto());
        System.out.println("Data de Admissão: " + admissao.getDataAdmissao());
        System.out.println("---------------------\n");
    }
}
