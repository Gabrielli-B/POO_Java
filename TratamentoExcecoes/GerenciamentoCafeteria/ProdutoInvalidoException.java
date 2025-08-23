package POO_IF_Aulas.TratamentoExcecoes.GerenciamentoCafeteria;

public class ProdutoInvalidoException extends RuntimeException{

    public ProdutoInvalidoException(String mensagem){
        super(mensagem);
    }
}
