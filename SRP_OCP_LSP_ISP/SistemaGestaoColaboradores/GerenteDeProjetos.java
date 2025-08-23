package POO_IF_Aulas.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public class GerenteDeProjetos extends Funcionario implements GerenciaProjetos,OrganizaSprint{
    protected GerenteDeProjetos(String nome, String cargo, Nivel nivel) {
        super(nome, "gerente", nivel);
    }

    @Override
    public void gerenciaProjetos() {
        System.out.println(nome+" está gerenciando um projeto");
    }

    @Override
    public void organizarSprin() {
        System.out.println(nome+" está organizando Sprin");
    }
}
