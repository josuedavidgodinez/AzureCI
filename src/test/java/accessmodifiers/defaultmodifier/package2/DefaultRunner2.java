package accessmodifiers.defaultmodifier.package2;

//import accessmodifiers.defaultmodifier.package1.DefaultModifierDemo;

import accessmodifiers.publicmodifier.PublicModifierDemo;

class DefaultRunner2 {

    public static void main (String args[]) {
        PublicModifierDemo publicModifierDemoObject = new PublicModifierDemo();
        System.out.println("##### Misma Clase");
        publicModifierDemoObject.mostrar();
    }

}
