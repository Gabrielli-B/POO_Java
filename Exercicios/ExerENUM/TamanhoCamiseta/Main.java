package POO_IF_Aulas.Exercicios.ExerENUM.TamanhoCamiseta;

public class Main {
    public static void main(String[] args) {
        Camiseta c1 = new Camiseta(Tamanho.M,"Vermelha");
        Camiseta c2 = new Camiseta(Tamanho.G,"Azul");
        Camiseta c3 = new Camiseta(Tamanho.M,"Laranja");

        c1.exibirInformacoes();
        c2.exibirInformacoes();
        c3.exibirInformacoes();
    }
}
