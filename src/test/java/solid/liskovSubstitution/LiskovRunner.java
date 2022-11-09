package solid.liskovSubstitution;

public class LiskovRunner {

    public static void main(String[] args){
        CalculoArea calculateAreaCuadrado = new CalcularAreaCuadrado();
        calculateAreaCuadrado.calcularArea();
    }

}
