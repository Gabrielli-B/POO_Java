package Estudos.SRP_OCP_LSP_ISP.SistemaGestaoColaboradores;

public class Estagiario extends Funcionario implements Codifica,CriarPrototipos,ParticipaDeUX {
    protected Estagiario(String nome, String cargo, Nivel nivel) {
        super(nome, "estagiario", nivel);
    }
    @Override
    public void codificar() {
        System.out.println(nome+" está codando com supervisão");
    }

    @Override
    public void criarPrototipos() {
        System.out.println(nome+ " está auxíliando na criação de protótipos");
    }

    @Override
    public void participaDeUX() {
        System.out.println(nome+" está pesquisando sobre UX");
    }
}
