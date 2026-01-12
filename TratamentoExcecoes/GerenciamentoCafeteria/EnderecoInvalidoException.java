package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class EnderecoInvalidoException extends RuntimeException{
    public EnderecoInvalidoException(String mensagem){
        super(mensagem);
    }
}
