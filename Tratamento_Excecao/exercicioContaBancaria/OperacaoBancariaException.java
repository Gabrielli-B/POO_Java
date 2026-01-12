package Estudos.Tratamento_Excecao.exercicioContaBancaria;

public class OperacaoBancariaException extends Exception {
    public OperacaoBancariaException(String mensagem){
        super(mensagem);
    }
}
