package aggregationcomposition;

public class Motor {

    private int cilindraje;
    private String marca;

    public Motor(int cilindraje, String marca) {
        this.cilindraje = cilindraje;
        this.marca = marca;
    }

    public void mostrar() {
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Marca Motor: " + marca);
    }

}
