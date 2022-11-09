package principlesoop.polymorphism;

public class Perro extends Mascota{

    private String raza;

    public Perro(String nombre, int edad, int peso, String raza) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = raza; // Solo los perros tienen raza (según mi modelo)
    }

    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = "Callejero";
    }

    @Override
    public String toString() {
        return super.toString() + " De raza " + this.raza;
    }

    @Override
    public void expresarse() {
        System.out.println(super.getNombre() + ": GUAU GUAU");
    }

    @Override
    public void comer() {
        System.out.println(super.getNombre() + ": GUAU, estos huesitos están muy sabrosos.");
    }

}
