package accessmodifiers.protectedmodifier.package2;

import accessmodifiers.protectedmodifier.package1.ProtectedModifierDemo;

public class ProtectedRunnerDiffPackage extends ProtectedModifierDemo {

    public static void main(String args[]) {
        ProtectedRunnerDiffPackage protectedRunnerDiffPackage = new ProtectedRunnerDiffPackage();
        ProtectedModifierDemo protectedModifierDemoObject = new ProtectedModifierDemo();
        System.out.println("##### Paquete diferente");
        protectedRunnerDiffPackage.mostrar();
    }

}
