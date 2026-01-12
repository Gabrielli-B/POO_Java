package Estudos.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        //adicionando elementos na pilha
        carros.push("Hrv");
        carros.push("Gol");
        carros.push("Hb20");
        carros.push("Bmw");
        carros.push("Polo");

        /*for(String c :carros){
            System.out.println(c);
        }*/

        System.out.println(carros.peek());//retorna o elemento que esta no topo da pilha
        System.out.println(carros.pop());//ele retorna o elemento que está no topo da pilha e remove ele

        carros.clear();//remove todos pos elementos da pilha
        //carros.empty() => verifica se a pilha está vazia

        System.out.println(carros);

    }
}
