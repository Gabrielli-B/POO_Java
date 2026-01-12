package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

import java.util.ArrayList;
import java.util.List;

public class Locacao {
    private Cliente cliente;
    private List<ServicoExtra> servicosExtras=new ArrayList<>(); //composição
    private int diasLocados;
    private Double precoDiaria;
    private FormaPagamento formaPagamento;
    private DescontoFidelidade descontoFidelidade;
    private Double valorTotalLocacao=0.0;

    public Locacao(Cliente cliente, int diasLocados, Double precoDiaria, FormaPagamento formaPagamento){
        this.cliente = cliente;
        this.diasLocados=diasLocados;
        this.precoDiaria=precoDiaria;
        this.formaPagamento=formaPagamento;
        this.descontoFidelidade=DescontoFidelidade.NENHUM;
    }

    public Locacao(Cliente cliente, int diasLocados, Double precoDiaria, FormaPagamento formaPagamento, DescontoFidelidade descontoFidelidade){
        this.cliente = cliente;
        this.diasLocados=diasLocados;
        this.precoDiaria=precoDiaria;
        this.formaPagamento=formaPagamento;
        this.descontoFidelidade =descontoFidelidade;
    }

    public void adicionarServico( ServicoExtra servico){
        servicosExtras.add(servico);
    }
    /*public void adicionarServico(String descricao, Double valor) {
        ServicoExtra servico = new ServicoExtra(descricao, valor);
        servicosExtras.add(servico);
    }Composição melhor?*/


    public void valorBrutoLocacao(){
        this.valorTotalLocacao=precoDiaria*diasLocados;
    }
    public void valorServicosExtras(){
        Double valorAux=0.0;
        if(!servicosExtras.isEmpty()){
            for(ServicoExtra s: servicosExtras){
                valorAux+=s.getValor();
            }
        }
        this.valorTotalLocacao+=valorAux;
    }
    public void valorFinalLocacao(){
        valorBrutoLocacao();
        valorServicosExtras();
        if (descontoFidelidade == DescontoFidelidade.BRONZE && diasLocados <= 7) {
            // Não aplica o desconto BRONZE
            System.out.println("Desconto BRONZE não aplicável para menos de 8 dias.");
        } else {
            valorTotalLocacao -= descontoFidelidade.getDesconto();
            if (descontoFidelidade != DescontoFidelidade.NENHUM) {
                System.out.println("DESCONTO FIDELIDADE " + descontoFidelidade + " APLICADO!!!");
            }
        }
        System.out.println(String.format("Valor total locação ---> %.2f",this.valorTotalLocacao));
    }

    public void exibirResumo(){
        cliente.infoCliente();
        formaPagamento.infoPagamento();
        infoLocacao();
        exibirServicoExtra();
        valorFinalLocacao();
        System.out.println("=================================================================");
    }
    public void infoLocacao(){
        System.out.println("Dias locados: "+this.diasLocados+" | Valor diária: "+this.precoDiaria);
    }
    public void exibirServicoExtra(){
        if(servicosExtras.isEmpty()){
            System.out.println("NÃO HÁ SERVIÇOS EXTRAS");
        }else{
            for(ServicoExtra s: servicosExtras){
                s.infoServicoExtra();
            }
        }
    }
}
