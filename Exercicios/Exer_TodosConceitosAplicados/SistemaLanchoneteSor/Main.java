package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLanchoneteSor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A criação de um cliente
        System.out.println("###### SEJA BEM VINDO A LANCHONETE ######");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Por favor, informe o telefone");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone);

        //A criação de diversos produtos
        Produto produto1 = new Produto("Hambuguer de costela", 38.00);
        Produto produto2 = new Produto("Suco de morango", 15.00);
        Produto produto3 = new Produto("Molho especial da casa", 12.00);
        Produto produto4 = new Produto("Porção de batatas rusticas", 10.00);
        Produto produto5 = new Produto("Adicional de cebola caramelizada", 10.00);
        Produto produto6 = new Produto("Adicional de molho pesto", 10.00);

        //A criação do Pedido com 6 produtos solicitados pelo cliente com o pagamento via PIX com desconto aplicado
        Pedido pedido = new Pedido(cliente, TipoPagamento.PIX, CupomDesconto.PROMO20);
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);
        pedido.adicionarProduto(produto4);
        pedido.adicionarProduto(produto5);
        pedido.adicionarProduto(produto6);

        pedido.exibirResumo();
    }
}
