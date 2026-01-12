package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana","9 5746-2834");
        Cliente joao = new Cliente("João","9 5746-2834");
        Mecanico jerson = new Mecanico("Jerson","Elétrica");
        Mecanico tarsisio = new Mecanico("Tarsiso","Lataria");
        Veiculo v1 = new Veiculo("TR5G6s","Gol","Volkswagen",ana);
        Veiculo v2 = new Veiculo("UT6&9","Mobi","Fiat",ana);
        Veiculo v3 = new Veiculo("YTSU8","Gol","Volkswagen",joao);
        Servico servico1 = new Servico(ana,v1,jerson,"Motor",StatusServico.EM_EXECUCAO,PagamentoTipo.PIX,450.00);
        Servico servico2 = new Servico(ana,v2,tarsisio,"Lataria esquerda",StatusServico.AGUARDANDO_APROVACAO,0.0);

        servico1.exibirDetalhes();
        servico2.exibirDetalhes();
        servico1.atualizarStatus(StatusServico.CONCLUIDO);
        servico1.exibirDetalhes();
        servico2.atualizarStatus(StatusServico.CONCLUIDO);


    }
}
