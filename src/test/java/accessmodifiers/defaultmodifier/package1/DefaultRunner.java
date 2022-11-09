package accessmodifiers.defaultmodifier.package1;

public class DefaultRunner {

    public static void main (String args[]) {
        DefaultModifierDemo defaultModifierDemoObject = new DefaultModifierDemo();
        System.out.println("##### Clase en el mismo paquete");
        defaultModifierDemoObject.mostrar();
    }

}
