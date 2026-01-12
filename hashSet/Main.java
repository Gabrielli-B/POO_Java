package Estudos.hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //hashMap é uma coleção de 2 valores, chave e valor
        //hashSet é uma coleção do tipo valor único
        //não pode ter valor repetido, ele não armazena

        HashSet<String> carros = new HashSet<String>();

        //adicionando
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("HRV");
        carros.add("HRV");

        System.out.println(carros.contains("Camaro")?"SIM":"NÃO");
        carros.remove("Polo");
        System.out.println(carros);
        carros.clear();

    }
}
