package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.LojaProdutosSOBRECARGA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Cama",1500,2);
        Produto p2 = new Produto("Tv",2500,2);

        p1.atualizaEstoque(3, LocalDate.of(2025,4,29));
        p1.atualizaEstoque(5);
        p2.atualizaEstoque(4,"Porque eu quis");
    }
}
