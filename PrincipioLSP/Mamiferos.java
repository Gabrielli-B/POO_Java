package Estudos.PrincipioLSP;

public class Mamiferos extends Animal{
    @Override
    public void serAlimentado(String tipoAlimento) {
        System.out.println("Animal do tipo mamífero alimentado com "+tipoAlimento);
    }

    @Override
    public void emitirSons() {
        System.out.println("Som específico do mamífero");
    }

    @Override
    public void moverSe() {
        System.out.println("Mamifero se movendo");
    }
}
