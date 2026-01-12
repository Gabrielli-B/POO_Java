package Estudos.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        //adicionando
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("HRV");
        carros.add("HRV");
        System.out.println(carros);

        Iterator<String> it = carros.iterator();

        System.out.println(it.next());
        System.out.println(it.next());

        while (it.hasNext()){
            String c = it.next();
            if(c == "City"){
                it.remove();
            }
        }

        System.out.println(carros);

    }
}
