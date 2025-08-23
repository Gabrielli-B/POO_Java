package POO_IF_Aulas.RefatoracaoSRP;

public class Main {
    public static void main(String[] args) {
        FuncionarioEmpresa funcionarioEmpresa = new FuncionarioEmpresa();
        Candidato candidato1 = new Candidato("Sabrina","9345-9843","Sabrina@gamil.com");
        Candidato candidato2 = new Candidato("João","8467-9848","Joao@gmail.com");
        Admissao admissao1 = new Admissao(candidato1,"Gerente",4.500);
        Admissao admissao2 = new Admissao(candidato2,"Supervisor",3.000);

        ProcessadorDeAdmissao processadorDeAdmissao = new ProcessadorDeAdmissao(funcionarioEmpresa);
        processadorDeAdmissao.processar(admissao1);
        processadorDeAdmissao.processar(admissao2);
        funcionarioEmpresa.listarFuncionarios();
    }
}
