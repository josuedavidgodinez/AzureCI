package principlesoop.polymorphism;

public class Loro extends Mascota {

    private int volumen;

    public Loro(String nombre, int edad, int peso, int volumen) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return super.toString() + " Con volumen " + this.volumen;
    }

    @Override
    public void expresarse() {
        System.out.println(super.getNombre() + ": PRRRR PRRRR");
    }

    @Override
    public void comer() {
        System.out.println(super.getNombre() + ": PRRRR, ¡alpiste!");
    }
}
