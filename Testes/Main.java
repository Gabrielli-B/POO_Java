package Estudos.Testes;

public class Main {
    public static void main(String[] args) {
        System.out.println(teste(1) ? "Verdadeiro" : "falso");
    }
    public static boolean teste(int n){
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}
