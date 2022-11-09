package principlesoop.polymorphism;

public class Gato extends Mascota {

    private String color;

    public Gato(String nombre, int edad, int peso, String color) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " De color " + this.color;
    }

    @Override
    public void expresarse() {
        System.out.println(super.getNombre() + ": MIAU MIAU");
    }

    @Override
    public void comer() {
        System.out.println(super.getNombre() + ": MIAU, atrapé a un ratón.");
    }
}
