package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public void infoCliente(){
        System.out.println("Nome: "+this.nome+" | CPF: "+this.cpf);
    }
}
