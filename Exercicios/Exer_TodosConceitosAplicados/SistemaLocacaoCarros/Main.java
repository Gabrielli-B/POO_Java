package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaLocacaoCarros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jeyza","984.435.356-45");
        ServicoExtra s1 = new ServicoExtra("GPS",15.68);
        ServicoExtra s2 = new ServicoExtra("Cadeira infantil",30.99);
        ServicoExtra s3 = new ServicoExtra("Seguro",100.0);
        ServicoExtra s4 = new ServicoExtra("GPS Pro",40.58);

        Locacao l1 = new Locacao(cliente1,8,20.50,FormaPagamento.DINHEIRO,DescontoFidelidade.OURO);
        l1.adicionarServico(s1);
        l1.adicionarServico(s2);
        l1.adicionarServico(s3);
        l1.adicionarServico(s4);
        l1.exibirResumo();

    }
}
