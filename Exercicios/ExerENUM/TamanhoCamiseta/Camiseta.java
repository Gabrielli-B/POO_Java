package POO_IF_Aulas.Exercicios.ExerENUM.TamanhoCamiseta;

public class Camiseta {
    private Tamanho tamanho;
    private String cor;

    public Camiseta(Tamanho tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
    public void exibirInformacoes(){
        System.out.println("Tam: "+ getTamanho()+" | Cor: "+getCor());
    }
}
