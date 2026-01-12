package Estudos.Exercicios.ExerENUM.SistemaLaboratorio;

import java.util.List;

public class Laboratorio {
    private String nome;
    private List<Computador> computadores;

    public Laboratorio(String nome, List<Computador> computadores) {
        this.nome = nome;
        this.computadores = computadores;
    }

    public void infoDeComputadoresNoLaboratorio(){
        System.out.println(this.nome+" :");
        for(Computador c : computadores){
            c.infoComputador();
        }
        System.out.println("===============================================");
    }
}
