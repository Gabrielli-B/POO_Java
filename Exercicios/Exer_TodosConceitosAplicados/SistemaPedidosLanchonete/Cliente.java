package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
}
