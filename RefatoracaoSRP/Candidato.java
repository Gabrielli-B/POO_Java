package POO_IF_Aulas.RefatoracaoSRP;

public class Candidato {
    private String nome;
    private String num;
    private String email;

    public Candidato(String nome, String num, String email) {
        this.nome = nome;
        this.num = num;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNum() {
        return num;
    }

    public String getEmail() {
        return email;
    }
}
