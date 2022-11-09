package accessmodifiers.privatemodifier.package1;


public class PrivateModifierDemo {

    private void mostrar() { System.out.println(" ##### Me encuentro dentro de clase PrivateModifierDemo !!! "); }

    public static void main (String args[]) {
        PrivateModifierDemo privateModifierDemoObject = new PrivateModifierDemo();
        System.out.println("##### Misma Clase");
        privateModifierDemoObject.mostrar();
    }

}
