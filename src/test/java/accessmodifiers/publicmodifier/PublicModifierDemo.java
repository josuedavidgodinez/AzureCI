package accessmodifiers.publicmodifier;

public class PublicModifierDemo {

    public void mostrar() { System.out.println(" ##### Me encuentro dentro de clase PublicModifierDemo !!! "); }

    public static void main(String args[]) {
        PublicModifierDemo publicModifierDemoObject = new PublicModifierDemo();
        System.out.println("##### Misma Clase");
        publicModifierDemoObject.mostrar();
    }

}
