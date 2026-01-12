package Estudos.Enum;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(TipoPagamento.PIX);

        if(pagamento.getTipoPagamento().equals(TipoPagamento.PIX)){
            System.out.println("O tipo do pagamento a ser efetuado será via " + pagamento.getTipoPagamento().getFormaDePagamento());
        }
        if (pagamento.getTipoPagamento().equals(TipoPagamento.DEBITO)){
            System.out.println("O tipo do pagamento a ser efetuado será via " + pagamento.getTipoPagamento().getFormaDePagamento());
        }
        if (pagamento.getTipoPagamento().equals(TipoPagamento.CREDITO)){
            System.out.println("O tipo do pagamento a ser efetuado será via " + pagamento.getTipoPagamento().getFormaDePagamento());
        }
    }
}
