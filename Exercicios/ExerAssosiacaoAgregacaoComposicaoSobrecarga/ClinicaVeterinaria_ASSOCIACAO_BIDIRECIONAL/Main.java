package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.ClinicaVeterinaria_ASSOCIACAO_BIDIRECIONAL;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marilini","(51) 9 9234-8930");
        Pessoa p2 = new Pessoa("Doralino","(51) 9 5424-8884");

        Animal a1= new Animal("Thor","Cachorro",p1);
        Animal a2= new Animal("Izzy","Cachorro",p1);
        Animal a3= new Animal("Lua","Gato",p2);

        //p1.pessoaAnimais(a1);
        //p1.pessoaAnimais(a2);
        //p2.pessoaAnimais(a3);

        p1.infosPessoaESeusAnimais();
        p2.infosPessoaESeusAnimais();
    }
}
