package Estudos.Tratamento_Excecao.exemploDeUsoTryCatch;


import java.util.ArrayList;

public class Carros {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");

        try {//usado quando tivermos uma operação crítica que pode ser que ocorra um erro,tem uma forte chance de gerar um erro no programa
            System.out.println(carros.get(10));
        }catch (Exception e){//bloco onde vamos tratar o erro que o try identificou, aqui dentro do catch vão ter possíveis tratamentos para o erro.
            System.out.println("ERRO");
        }

        try {
            System.out.println(carros.get(10));
        }catch (Exception e){
            System.out.println("ERRO : "+e.getMessage());//mostrando erros especificos
        }

        try {
            System.out.println(carros.get(10));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ERRO : Valor fora do indice do arraylist "+e.getMessage());//mostrando erros especificos
        }catch (ClassCastException e){//outra que quero tratar
            System.out.println();
        }finally {//é o último caso do try, ele executou, deu certo ele não entra no catch, agora entrando ou não no catch quando ele acabar ele passa para a executar o finally independente se houve erro ou não no catch
            System.out.println("Fim do try");
        }
    }
}

