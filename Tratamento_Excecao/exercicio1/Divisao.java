package Estudos.Tratamento_Excecao.exercicio1;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, resul;

        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = scan.nextInt();

        try{
            resul = num1/num2;
            System.out.printf("%d / %d = %d",num1,num2,resul);
        }catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero.");
        }
    }
}
