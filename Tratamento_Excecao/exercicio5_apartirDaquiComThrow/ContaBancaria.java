package Estudos.Tratamento_Excecao.exercicio5_apartirDaquiComThrow;

public class ContaBancaria {
    private double saldo;

    protected ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Quem lança o erro NÃO trata o erro.
    //Quem chama o metodo é quem deve tratar.

    protected void sacar(Double valor){
        if(valor > this.saldo){
            throw new IllegalArgumentException("Erro: Valor maior que saldo em conta");
        }
        setSaldo(getSaldo()-valor);
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double getSaldo() {
        return saldo;
    }
}
