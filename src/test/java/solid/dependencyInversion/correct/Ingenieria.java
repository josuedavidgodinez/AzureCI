package solid.dependencyInversion.correct;

public class Ingenieria extends Empleado {

    @Override
    public void action() {
        super.action();
        System.out.println("ingenierias");
    }

}
