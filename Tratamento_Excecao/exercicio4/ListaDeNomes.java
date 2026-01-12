package Estudos.Tratamento_Excecao.exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        Scanner scan = new Scanner(System.in);

        int indice;

        System.out.println("Informe o indice desejado: ");
        indice = scan.nextInt();

        try{
            System.out.println(nomes.get(indice));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ERRO: Índice informado maior que lista | "+e.getMessage());
        }
    }
}
