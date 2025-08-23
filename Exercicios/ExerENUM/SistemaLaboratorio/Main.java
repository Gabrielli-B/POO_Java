package POO_IF_Aulas.Exercicios.ExerENUM.SistemaLaboratorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador(TipoComputador.GAMER,"Dell 1.20");
        Computador pc2 = new Computador(TipoComputador.ESCRITORIO,"Lenovo 4.20");
        Computador pc3 = new Computador(TipoComputador.SERVIDOR,"Sansung 3.20");
        Computador pc4 = new Computador(TipoComputador.GAMER,"PHP 2.20");
        Computador pc5 = new Computador(TipoComputador.GAMER,"Dell 8.20");

        List<Computador> computadoresLista1 = new ArrayList<>();
        List<Computador> computadoresLista2 = new ArrayList<>();
        computadoresLista1.add(pc1);
        computadoresLista1.add(pc2);
        computadoresLista1.add(pc3);
        computadoresLista2.add(pc4);
        computadoresLista2.add(pc5);

        Laboratorio laboratorio1 = new Laboratorio("LAB 1",computadoresLista1);
        Laboratorio laboratorio2 = new Laboratorio("LAB 2",computadoresLista2);

        laboratorio1.infoDeComputadoresNoLaboratorio();
        laboratorio2.infoDeComputadoresNoLaboratorio();

        //VOLTAR AQUI PARA VER A PARTE DA COMPOSISÃO
    }
}
