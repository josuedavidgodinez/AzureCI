package solid.interfaceSegregation.incorrect;

public class Sedan implements ICar {

    @Override
    public void manejar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public void mantenimientoPalangana() {
        System.out.println("no lo necesitan");
    }

}
