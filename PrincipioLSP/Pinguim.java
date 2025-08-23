package POO_IF_Aulas.PrincipioLSP;

public class Pinguim extends Aves{
    @Override
    public void moverSe() {
        System.out.println("Pinguim nadando e voando");
    }

    @Override
    public void emitirSons() {
        System.out.println("Pinguim está piando");
    }

    @Override
    public void serAlimentado(String tipoAlimento) {
        System.out.println("Pinguim sendo alimentado com "+tipoAlimento);
    }
}
