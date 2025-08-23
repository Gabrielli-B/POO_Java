package POO_IF_Aulas.RefatoracaoSRP;
import java.time.LocalDate;

public class Admissao {
   private Funcionario funcionario;
   private Candidato candidato;
   private LocalDate dataAdmissao;

    public Admissao(Candidato candidato,String cargo, double salarioBruto ) {
        this.funcionario = new Funcionario(candidato.getNome(), candidato.getEmail(),cargo,salarioBruto);
        this.dataAdmissao = LocalDate.now();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
}
