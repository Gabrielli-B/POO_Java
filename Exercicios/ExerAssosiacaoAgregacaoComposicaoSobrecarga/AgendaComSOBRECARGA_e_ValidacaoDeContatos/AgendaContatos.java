package Estudos.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.AgendaComSOBRECARGA_e_ValidacaoDeContatos;

import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {
   private List<Contato> contatos= new ArrayList<>();

    public  AgendaContatos(){}

    public void inserindoAgenda(Contato contato){
        contatos.add(contato);
    }
    public void exibindoAgendaContatos(){
        for(Contato contato : contatos){
            if(contato.getTelefone().matches("\\d{9}")){
                contato.infoContato();
            }
        }
    }
}
