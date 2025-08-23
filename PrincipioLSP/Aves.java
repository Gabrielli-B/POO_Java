package POO_IF_Aulas.PrincipioLSP;

public class Aves extends Animal{
    @Override
    public void serAlimentado(String tipoAlimento){
        System.out.println("Animal do tipo ave alimentado com "+tipoAlimento);
    }

    @Override
    public void emitirSons() {
        System.out.println("Ave Piando");
    }

    @Override
    public void moverSe() {
        System.out.println("A ave está se movendo");
    }
}
