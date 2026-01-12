package Estudos.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> carros = new LinkedList<>();

        //adicionando elementos na fila
        carros.add("Hrv");
        carros.add("Gol");
        carros.add("Hb20");
        carros.add("Bmw");
        carros.add("Polo");

        System.out.println(carros.peek());//retorna o elemento que esta no topo da fila
        System.out.println(carros.poll());//retirando elementos da fila, mostrando o elemnto do topo da fila e removendo depois
        System.out.println(carros.isEmpty()?"Fila vazia":"FIla com elementos");//verificando se a fila está vazia, na pilha é só empty()
    }
}
