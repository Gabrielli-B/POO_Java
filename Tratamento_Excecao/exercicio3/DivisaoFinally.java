package Estudos.Tratamento_Excecao.exercicio3;

import java.util.Scanner;

public class DivisaoFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num,dividendo=10;

        System.out.println("Informe um número");
        num = scanner.nextInt();

        try {
            int resul = num/dividendo;
            System.out.println(" "+num + " / " + dividendo + " = " + resul);
        }catch (ArithmeticException e){
            System.out.println("Erro: divisão por zero não é permitida");
        }finally {//Muito usado para fechar recursos (Scanner, arquivos, banco)
            System.out.println("PROGRAMA FINALIZADO!");
            scanner.close();
        }
    }
}
