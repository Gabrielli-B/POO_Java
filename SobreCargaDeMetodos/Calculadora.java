package POO_IF_Aulas.SobreCargaDeMetodos;

public class Calculadora{
    private float primeiroNumeroFloat, segundoNumeroFloat;
    private int primeiroNumeroInt, segundoNumeroInt;
    private double primeiroNumeroDouble, segundoNumeroDouble;


    //pode ser feito a sobrecarga no construtor tambem sem deixar ele vazio
    public Calculadora(float primeiroNumeroFloat, float segundoNumeroFloat) {
        this.primeiroNumeroFloat=primeiroNumeroFloat;
        this.segundoNumeroFloat=segundoNumeroFloat;
    }

    public Calculadora(int primeiroNumeroInt, int segundoNumeroInt) {
        this.primeiroNumeroInt=primeiroNumeroInt;
        this.segundoNumeroInt=segundoNumeroInt;
    }
    public Calculadora(double primeiroNumeroDouble, double segundoNumeroDouble) {
        this.primeiroNumeroDouble=primeiroNumeroDouble;
        this.segundoNumeroDouble=segundoNumeroDouble;
    }


    //Modo simples de sobrecarga de métodos

    public Calculadora() {}
    public int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero+segundoNumero;
    }


    public float somar(float primeiroNumero, float segundoNumero){
        return primeiroNumero+segundoNumero;
    }

    public Double somar(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero+segundoNumero;
    }

    public double getPrimeiroNumeroDouble() {
        return primeiroNumeroDouble;
    }

    public double getSegundoNumeroDouble() {
        return segundoNumeroDouble;
    }
}
