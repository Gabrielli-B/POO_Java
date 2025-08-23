package POO_IF_Aulas.RefatoracaoSRP;

public class Funcionario {
    private String nome;
    private String email;
    private String cargo;
    private double salarioBruto;

    public Funcionario(String nome, String email, String cargo, double salarioBruto) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salarioBruto=salarioBruto;
    }
    public String getEmail() {
        return email;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void infoFuncionario(){
        System.out.printf("- "+nome+" | "+email+" | "+cargo+" | %.3f R$\n",salarioBruto);
    }

}
