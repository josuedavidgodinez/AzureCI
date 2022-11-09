package accessmodifiers.protectedmodifier.package1;

public class ProtectedModifierDemo {

    protected void mostrar() { System.out.println(" ##### Me encuentro dentro de clase ProtectedModifierDemo !!! "); }

    public static void main(String args[]) {
        ProtectedModifierDemo protectedModifierDemoObject = new ProtectedModifierDemo();
        System.out.println("##### Misma Clase");
        protectedModifierDemoObject.mostrar();
    }

}
