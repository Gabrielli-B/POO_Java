package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaPedidosLanchonete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Bem vindo a lanchonete! ==============");

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu telefone:");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome,telefone);

        Produto p1 = new Produto("Batata Frita",10.99);
        Produto p2 = new Produto("Hamburguer",20.50);
        Produto p3 = new Produto("Refrigerante",5.40);
        Produto p4 = new Produto("Água",2.50);
        Produto p5 = new Produto("Suco",5.29);
        Produto p6 = new Produto("Pastel",10.29);

        Pedido pedido1 = new Pedido(cliente,TipoPagamento.PIX);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.adicionarProduto(p3);
        pedido1.adicionarProduto(p4);
        pedido1.adicionarProduto(p5);
        pedido1.adicionarProduto(p6);
        pedido1.exibirResumo();
    }
}
