package POO_IF_Aulas.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public class TechLead extends Funcionario implements Codifica,GerenciaProjetos,MentoraTime,OrganizaSprint,RevisaPullRequest{
    protected TechLead(String nome, String cargo, Nivel nivel) {
        super(nome, cargo, nivel);
    }

    @Override
    public void codificar() {
        System.out.println(nome+" está codando");
    }

    @Override
    public void gerenciaProjetos() {
        System.out.println(nome+ " está participando de projetos");
    }

    @Override
    public void mentoraTime() {

    }

    @Override
    public void organizarSprin() {
        System.out.println(nome+" está organizando Sprin");
    }

    @Override
    public void revisarPullRequest() {
        System.out.println(nome+" está revisando Pull Request");
    }
}
