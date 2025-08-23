package POO_IF_Aulas.Exercicios.ExerENUM.SistemaLaboratorio;

public class Computador {
    private TipoComputador tipoComputador;
    private String modelo;

    public Computador(TipoComputador tipoComputador, String modelo) {
        this.tipoComputador = tipoComputador;
        this.modelo = modelo;
    }

    public void infoComputador(){
        System.out.println("Modelo | "+this.modelo+"  Tipo | "+this.tipoComputador);
    }
}
