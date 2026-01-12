package Estudos.Tratamento_Excecao.exercicio2;

import java.util.Scanner;

public class ErroDeEntrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num;

        System.out.println("Informe um número");
        num = scan.nextLine();

        try{
            int numero = Integer.parseInt(num);
            System.out.println("ENTRADA ACEITA: "+numero);
        }catch (NumberFormatException e){
            System.out.println("ENTRADA INVÁLIDA: Não é permitido letras, apenas números | "+e.getMessage());
        }
    }
}
