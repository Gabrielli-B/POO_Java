package POO_IF_Aulas.RefatoracaoSRP;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioEmpresa {
    private List<Funcionario> funcionariosEmpresa =new ArrayList<>();;


    public void salvarFuncionario(Funcionario funcionario){
        funcionariosEmpresa.add(funcionario);
    }

    public List<Funcionario> getFuncionariosEmpresa() {
        return funcionariosEmpresa;
    }
    public void listarFuncionarios(){
        System.out.println("Lista funcionários empresa: ");
        for(Funcionario f: funcionariosEmpresa){
            f.infoFuncionario();
        }
    }
}
