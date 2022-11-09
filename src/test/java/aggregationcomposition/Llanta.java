package aggregationcomposition;

public class Llanta {

    private int id, rin;
    private String marca;

    public Llanta(int id, String marca){
        this.id = id;
        this.marca = marca;
    }

    public void mostrar() {
        System.out.println("Número de llanta: " + id);
        System.out.println("Marca de llanta: " + marca);
    }

}
