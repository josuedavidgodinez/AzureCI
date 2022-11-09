package solid.liskovSubstitution;

public class CalcularAreaRectangulo extends CalculoArea{

    @Override
    public void calcularArea() {
        super.calcularArea();
        System.out.println("Algo especifico para el Rectangulo.");
    }

}
