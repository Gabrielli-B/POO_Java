package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

public class Mecanico {
    private String nome;
    private String especialidade;

    public Mecanico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void infoMecanico(){
        System.out.println("Mecânico: "+this.nome+" | especialidade: "+this.especialidade);
    }
}
