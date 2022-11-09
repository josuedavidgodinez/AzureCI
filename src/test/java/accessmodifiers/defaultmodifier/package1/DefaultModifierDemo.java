package accessmodifiers.defaultmodifier.package1;

class DefaultModifierDemo {

    void mostrar() { System.out.println(" ##### Me encuentro dentro de clase DefaultModifierDemo !!! "); }

    public static void main (String args[]) {
        DefaultModifierDemo defaultModifierDemoObject = new DefaultModifierDemo();
        System.out.println("##### Misma Clase");
        defaultModifierDemoObject.mostrar();
    }

}
