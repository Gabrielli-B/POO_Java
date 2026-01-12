package Estudos.Tratamento_Excecao.exemploDeUsoThrow;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int n1,n2,res;

        n1 =50;
        n2 =20;

        if(n1 > 50){
            //disparar uma exceção de erro, tipo eu sei que é para dar erro naquilo.
            throw new IllegalArgumentException("Valor de nota invalido");// aqui não é o programa que esta gerando uma exceção para mim e sim eu quem estou gerando uma desse tipo em específico
        }
        if(n2 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        res = n1+n2;
        System.out.println("Nota 1: "+n1+" + Nota2: "+n2+" = "+res);
       /* try {
            System.out.println(carros.get(10));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ERRO : Valor fora do indice do arraylist "+e.getMessage());//mostrando erros especificos
        }catch (ClassCastException e){//outra que quero tratar
            System.out.println();
        }finally {//é o último caso do try, ele executou, deu certo ele não entra no catch, agora entrando ou não no catch quando ele acabar ele passa para a executar o finally independente se houve erro ou não no catch
            System.out.println("Fim do try");
        }*/
    }
}
