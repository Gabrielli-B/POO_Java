package Estudos.Tratamento_Excecao.exercicioContaBancaria;

public class ContaPoupanca extends ContaBancaria{
    protected double limiteSaque = 10.000;

    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
        //this.limiteSaque = 500.00;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    @Override
    public void sacar(double valor) throws OperacaoBancariaException {
        if(valor > this.limiteSaque){
            throw new OperacaoBancariaException("Erro: valor maior que seu limite de saque de "+this.limiteSaque+" por operação!");
        }
        if(valor <=0 ){
            throw new OperacaoBancariaException("Erro: Valor não pode ser nulo ou negativo");
        }
        if(valor > getSaldo()){
            throw new OperacaoBancariaException("Erro: Saldo insuficiente");
        }
        setSaldo(getSaldo()-valor);
    }
}
