package Estudos.Tratamento_Excecao.exercicioContaBancaria;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void sacar(double valor) throws OperacaoBancariaException {
        if(valor > getSaldo()){
            throw new OperacaoBancariaException("Erro: Saldo insuficiente");
        }
        if(valor <= 0){
            throw new OperacaoBancariaException("Erro: Valor não pode ser nulo ou negativo");
        }
        setSaldo(getSaldo()-valor);
        System.out.println("Saque efetuado com sucesso!");
    }
}
