package POO_IF_Aulas.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public class Desenvolvedor extends Funcionario implements Codifica,MentoraTime,ParticipaDeUX,RevisaPullRequest{
    protected Desenvolvedor(String nome, String cargo, Nivel nivel) {
        super(nome,"desenvolvedor", nivel);
    }

    @Override
    public void codificar() {
        System.out.println(nome+" Codando...");
    }

    @Override
    public void mentoraTime() {

    }

    @Override
    public void participaDeUX() {
        System.out.println(nome+" está analisando UX");
    }

    @Override
    public void revisarPullRequest() {
        System.out.println(nome+" está revisando Pull Request...");
    }
}
