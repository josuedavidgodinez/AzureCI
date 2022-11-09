package accessmodifiers.protectedmodifier.package1;

public class ProtectedRunnerSamePackage {

    public static void main(String args[]) {
        ProtectedModifierDemo protectedModifierDemoObject = new ProtectedModifierDemo();
        System.out.println("##### Diferente clase, mismo paquete");
        protectedModifierDemoObject.mostrar();
    }

}
