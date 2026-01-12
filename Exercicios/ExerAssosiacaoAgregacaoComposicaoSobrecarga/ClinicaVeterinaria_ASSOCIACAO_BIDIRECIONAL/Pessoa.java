package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.ClinicaVeterinaria_ASSOCIACAO_BIDIRECIONAL;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String telefone;
    private List<Animal> animais;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    public void pessoaAnimais(Animal animal){

        animais.add(animal);
    }

    public void infosPessoaESeusAnimais(){
        System.out.println("Dono    : "+this.nome);
        System.out.println("Contato : "+this.telefone);
        System.out.println("->>>Animais:");
        for (Animal animais : animais){
            animais.infoAnimal();
        }
        System.out.println("=======================");

    }
}
