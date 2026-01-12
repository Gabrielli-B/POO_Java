package Estudos.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public class Servico {
    private Cliente cliente;
    private Veiculo veiculo;
    private Mecanico mecanico;
    private String descricao;
    private StatusServico status;
    private PagamentoTipo pagamento;
    private Double valor;

    public Servico(Cliente cliente, Veiculo veiculo, Mecanico mecanico, String descricao, StatusServico status, PagamentoTipo pagamento, Double valor) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.descricao = descricao;
        this.status = status;
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public Servico(Cliente cliente, Veiculo veiculo, Mecanico mecanico, String descricao, StatusServico status, Double valor) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.descricao = descricao;
        this.status = status;
        this.valor=valor;
        this.pagamento=PagamentoTipo.NENHUM;
    }

    public void atualizarStatus(StatusServico novoStatus){
        if(this.status==novoStatus){
            System.out.println("IMPOSSÍVEL!O status passado já é o status atual");
        }else{
            if(novoStatus==StatusServico.CONCLUIDO && valor<=0.0){
                System.out.println("SERVIÇO NÃO PODE SER CONCLUÍDO! Motivo: valor = 0");
            }else{
                this.status=novoStatus;
                System.out.println("STATUS ATUALIZADO!");
            }
        }
   }
   public void exibirDetalhes(){
        mecanico.infoMecanico();
        System.out.println("Cliente : "+cliente.getNome());
        veiculo.infoVeiculo();
        pagamento.exibirFormaPagamento();
        status.infoStatusServico();
        System.out.println("============================================================================");
   }
}
