package solid.openClose;

public class OpenCloseRunner {

    public static void main(String[] args){
        CalcularAreaCuadrado calculareAreaCuadrado =  new CalcularAreaCuadrado();
        calculareAreaCuadrado.calculateArea();

        CalcularAreaTriangulo triangule = new CalcularAreaTriangulo();
        triangule.calculateArea();

    }

}
