package POO_IF_Aulas.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected Nivel nivel;

    protected Funcionario(String nome, String cargo, Nivel nivel){
        this.nome=nome;
        this.cargo=cargo;
        this.nivel=nivel;
    }

    protected void exibirInformacoes(){
        System.out.println("Nome | "+this.nome);
        System.out.println("Cargo | "+this.cargo);
        System.out.println("Nivel | "+this.nivel);
    };
    protected void baterPonto(){
        System.out.println("Ponto batido");
    };

}
