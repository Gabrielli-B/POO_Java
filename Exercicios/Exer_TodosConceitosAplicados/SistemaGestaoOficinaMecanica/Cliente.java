package POO_IF_Aulas.Exercicios.Exer_TodosConceitosAplicados.SistemaGestaoOficinaMecanica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private List<Veiculo> veiculos;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.veiculos=new ArrayList<>();
    }
    void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getNome() {
        return nome;
    }
}
