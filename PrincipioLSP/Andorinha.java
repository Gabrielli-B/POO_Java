package POO_IF_Aulas.PrincipioLSP;

public class Andorinha extends Aves{
    @Override
    public void serAlimentado(String tipoAlimento) {
        System.out.println("Andorinha sendo alimentada com "+tipoAlimento);
    }

    @Override
    public void emitirSons() {
        System.out.println("Andorinha piando");
    }

    @Override
    public void moverSe() {
        System.out.println("Andorinha voando");
    }
}
