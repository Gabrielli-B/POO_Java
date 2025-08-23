package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.AgendaComSOBRECARGA_e_ValidacaoDeContatos;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.email = "";
        this.telefone = telefone;
    }
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    public void infoContato(){
        verificaEmail();
        System.out.println("Nome: "+this.nome+" | "+"Número: "+this.telefone+" | "+"E-mail: "+this.email);
        System.out.println("======================================================================");
    }
    public void verificaEmail(){
        if(this.email.isEmpty()){
            this.email="Não informado";
        }
    }
}
