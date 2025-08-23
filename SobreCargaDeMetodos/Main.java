package POO_IF_Aulas.SobreCargaDeMetodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //sobrecarga de método simples
        System.out.println(calculadora.somar(5,5));
        System.out.println(calculadora.somar(5.5,5.5));
        System.out.println(calculadora.somar(5.75F,5.78F));

        //utilizando sobrecarga de metodos no proprio construtor
        System.out.println("UTILIZANDO SOBRECARGA DE MÉTODO NO CONSTRUTOR");
        Calculadora calculadora2 = new Calculadora(10.35,79.70);
        System.out.println(calculadora2.somar(calculadora2.getPrimeiroNumeroDouble(),calculadora2.getSegundoNumeroDouble()));
    }
//é um metodo para diferentes tipos de assinatura
}
