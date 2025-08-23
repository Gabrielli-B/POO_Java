package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.BibliotecaComAGREGACAO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List<Livro> livrosNaBiblioteca = new ArrayList<>();

   public Biblioteca(){}

    public void adicionarLivrosNaBiblioteca(Livro livro){
       livrosNaBiblioteca.add(livro);
    }
    public void removerLivroDaBiblioteca(Livro livro){
       livrosNaBiblioteca.remove(livro);
       System.out.println("Livro removido com sucesso!");
    }
    public void infosLivrosCadastrados(){
       if(livrosNaBiblioteca.isEmpty()){
           System.out.println("Nenhum livro cadastrado na biblioteca");
       }else{
           for (Livro livro : livrosNaBiblioteca){
               livro.infoLivros();
           }
       }
    }
    //isEmpty() verifica se o objeto está vazio
}
