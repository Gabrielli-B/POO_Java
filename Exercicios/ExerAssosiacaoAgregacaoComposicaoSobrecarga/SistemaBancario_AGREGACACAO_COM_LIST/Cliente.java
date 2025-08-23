package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaBancario_AGREGACACAO_COM_LIST;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaBancaria> contaBancarias;

    public Cliente(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
        this.contaBancarias = new ArrayList<>();
    }

    public void clientesContasBancarias(ContaBancaria contaBancaria){
        contaBancarias.add(contaBancaria);
    }

    public List<ContaBancaria> getContaBancarias() {
        return contaBancarias;
    }

    public String getNome() {
        return nome;
    }

}
