package Estudos.Tratamento_Excecao.exercicioContaBancaria;

public abstract class  ContaBancaria {
    protected double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor) throws OperacaoBancariaException;

    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Valor não pode ser nulo ou negativo");
        }
        setSaldo(getSaldo()+valor);
    }
}
