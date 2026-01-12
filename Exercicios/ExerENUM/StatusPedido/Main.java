package Estudos.Exercicios.ExerENUM.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(1,StatusPedido.ENVIADO);
        Pedido p2 = new Pedido(2,StatusPedido.ENTREGUE);
        Pedido p3 = new Pedido(3,StatusPedido.PENDENTE);
        Pedido p4 = new Pedido(4,StatusPedido.PROCESSANDO);
        Pedido p5 = new Pedido(5,StatusPedido.ENVIADO);
        Pedido p6 = new Pedido(6,StatusPedido.PENDENTE);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        pedidos.add(p4);
        pedidos.add(p5);
        pedidos.add(p6);

        //primeira forma
        for(Pedido p : pedidos){
            System.out.println("Número pedido: "+p.getNumeroPedido());
            switch (p.getStatus()){
                case ENVIADO :
                    System.out.println("Oba!seu pedido foi enviado");
                    break;
                case ENTREGUE:
                    System.out.println("MARAVILHA! Pedido entregue");
                    break;
                case PENDENTE:
                    System.out.println("Quase lá! Seu pedido já já será analisado");
                    break;
                case PROCESSANDO:
                    System.out.println("Falta pouco! Seu pedido está sendo processado");
                    break;
            }
            System.out.println("-------------------------------------------------------------------");
        }

        //segunda forma
        for(Pedido p: pedidos){
            p.infoPedido();
        }

    }
}
