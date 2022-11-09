package solid.liskovSubstitution;

import solid.openClose.CalcularArea;

public class CalcularAreaCuadrado extends CalculoArea {

    @Override
    public void calcularArea() {
        super.calcularArea();
        System.out.println("Algo especifico para el cuadrado.");
    }

}
