package POO_IF_Aulas.TratamentoExcecoes.GerenciamentoCafeteria;

public class EnderecoInvalidoException extends RuntimeException{
    public EnderecoInvalidoException(String mensagem){
        super(mensagem);
    }
}
