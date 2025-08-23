package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.ClinicaVeterinaria_ASSOCIACAO_BIDIRECIONAL;

public class Animal {
    private String nome;
    private String especie;
    private Pessoa dono;

    public Animal(String nome, String especie, Pessoa dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
        dono.pessoaAnimais(this);//lincando diretamente o dono ao animal sem ter que adicionar manualmente no main INTERESSANTE
    }

    public void infoAnimal(){
        System.out.println("Nome    | "+this.nome+ " | " + "Especie | "+this.especie);
    }
}
