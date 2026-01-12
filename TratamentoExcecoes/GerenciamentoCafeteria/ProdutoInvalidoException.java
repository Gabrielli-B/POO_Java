package Estudos.TratamentoExcecoes.GerenciamentoCafeteria;

public class ProdutoInvalidoException extends RuntimeException{

    public ProdutoInvalidoException(String mensagem){
        super(mensagem);
    }
}
