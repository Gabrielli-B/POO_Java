package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public enum StatusServico {
    AGUARDANDO_APROVACAO("SERVIÇO AGUARDANDO APROVAÇÃO"),
    EM_EXECUCAO("SERVIÇO EM EXECUÇÃO"),
    CONCLUIDO("SERVIÇO CONCLUÍDO"),
    CANCELADO("SERVIÇO CANCELADO PELO CLIENTE OU OFICINA");

    private String statusPedido;

    StatusServico(String statusPedido) {
        this.statusPedido = statusPedido;
    }
    public void infoStatusServico(){
        System.out.println("Status | "+this.statusPedido);
    }
}
