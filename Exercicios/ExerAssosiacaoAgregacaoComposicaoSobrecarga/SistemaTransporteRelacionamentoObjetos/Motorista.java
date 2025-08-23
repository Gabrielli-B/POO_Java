package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaTransporteRelacionamentoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String modeloCarro;
    private List<Corrida> corridas;

    public Motorista(String nome, String modeloCarro) {
        this.nome = nome;
        this.modeloCarro = modeloCarro;
        this.corridas = new ArrayList<>();

    }

    public void corridasMotorista(Corrida corrida){
        corridas.add(corrida);
    }
    public void infoMotorista(){
        System.out.println("----------- MOTORISTA ---------");
        System.out.println("Nome         | "+this.nome);
        System.out.println("Modelo carro | "+this.modeloCarro);
    }
    public void infoCorridasMotorista(){
        infoMotorista();
        int aux=1;
        for(Corrida corrida : corridas){
            System.out.println("Corrida -> "+aux);
            corrida.infoCorrida();
            aux++;
        }
    }
}
