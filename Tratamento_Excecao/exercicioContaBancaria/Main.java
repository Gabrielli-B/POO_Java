package Estudos.Tratamento_Excecao.exercicioContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaPoupanca(100.000,"João");
        ContaBancaria conta2 = new ContaCorrente(300,"maria");

        try{
            conta.depositar(100);
            conta.sacar(2.000);
            System.out.println(conta.getSaldo());

            conta2.depositar(50);
            conta2.sacar(100);

        }catch (OperacaoBancariaException e){
            System.out.println(e.getMessage());
        }
    }
}
