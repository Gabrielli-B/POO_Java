package Estudos.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public class Designer extends Funcionario implements CriarPrototipos,ParticipaDeUX{
    protected Designer(String nome, String cargo, Nivel nivel) {
        super(nome,"designer", nivel);
    }

    @Override
    public void criarPrototipos() {
        System.out.println("Está criando um protótipo");
    }

    @Override
    public void participaDeUX() {
        System.out.println("Está participando de pesquisas UX");
    }
}
