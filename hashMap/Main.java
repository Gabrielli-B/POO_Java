package Estudos.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> carros = new HashMap<Integer,String>();

        //adicionando elementos na coleção, chave valor
        carros.put(1,"Polo");
        carros.put(2,"HRV");
        carros.put(3,"Golf");
        carros.put(4,"Camaro");
        carros.put(5,"Mustang");
        carros.put(6,"Cruze");

        System.out.println(carros);
        //imprimindo chave específica
        System.out.println(carros.get(3));

        for(int i=1; i<carros.size()+1; i++){
            System.out.println(carros.get(i));
        }


        //removendo um item
        carros.remove(5);

        System.out.println("Utilizando foreach");
        //utilizando foreach
        for(String c:carros.values()){
            System.out.println(c);
        }

        //limpar toda coleção
        carros.clear();
    }
}
