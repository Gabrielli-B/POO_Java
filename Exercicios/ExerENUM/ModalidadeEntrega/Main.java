package Estudos.Exercicios.ExerENUM.ModalidadeEntrega;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Entrega e1 = new Entrega(TipoEntrega.ENTREGA_EXPRESSA,"Cleudi");
        Entrega e2 = new Entrega(TipoEntrega.ENTREGA_NORMAL,"Jhon");
        Entrega e3 = new Entrega(TipoEntrega.RETIRADA_LOJA,"Varuskani");
        Entrega e4 = new Entrega(TipoEntrega.ENTREGA_EXPRESSA,"Tatiane");

        List<Entrega> entregas=new ArrayList<>();
        entregas.add(e1);
        entregas.add(e2);
        entregas.add(e3);
        entregas.add(e4);

        prazoEntrega(entregas);

    }
    public static void prazoEntrega(List<Entrega> entregas){
        for(Entrega e: entregas){
            e.infoEntrega();
            if(e.getTipoEntrega()==TipoEntrega.ENTREGA_NORMAL){
                System.out.println("Prazo entrega | 5 dias úteis");
            }
            if(e.getTipoEntrega()==TipoEntrega.ENTREGA_EXPRESSA){
                System.out.println("Prazo entrega | 1 dias úteis");
            }
            if(e.getTipoEntrega()==TipoEntrega.RETIRADA_LOJA){
                System.out.println("Prazo entrega | Entrega imediata");
            }
            System.out.println("---------------------------------------------------------------------------");
        }
    }
    public static void prazoEntregaComSwitch(List<Entrega> entregas){
        for(Entrega e : entregas){
            e.infoEntrega();
            switch ((e.getTipoEntrega())){
                case RETIRADA_LOJA -> System.out.println("Prazo entrega | Entrega imediata");
                case ENTREGA_EXPRESSA -> System.out.println("Prazo entrega | 1 dia útil");
                case ENTREGA_NORMAL -> System.out.println("Prazo entrega | 5 dias úteis");
            }
        }
    }
}
