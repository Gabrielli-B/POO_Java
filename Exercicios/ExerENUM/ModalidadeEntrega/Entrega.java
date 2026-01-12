package Estudos.Exercicios.ExerENUM.ModalidadeEntrega;

public class Entrega {
    private TipoEntrega tipoEntrega;
    private String destinatario;

    public Entrega(TipoEntrega tipoEntrega, String destinatario) {
        this.tipoEntrega = tipoEntrega;
        this.destinatario = destinatario;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void infoEntrega(){
        System.out.println("Destinatário | "+this.destinatario);
        System.out.println("Tipo entrega | "+this.tipoEntrega.getTipoRetirada());
    }
}
