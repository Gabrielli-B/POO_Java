package Estudos.Tratamento_Excecao.exercicio5_apartirDaquiComThrow;

public class Main {
    public static void main(String[] args) {
        //aqui que tratamos a exceção
        ContaBancaria conta = new ContaBancaria(100.0);

        try {
            conta.sacar(200.0);
            System.out.println("Saque efetuado com sucesso!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
