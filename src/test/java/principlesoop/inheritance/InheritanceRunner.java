package principlesoop.inheritance;

public class InheritanceRunner {

    public static void main(String[] args){
        Cliente c = new Cliente(1,"Alphonso","Perez", 29,1);
        System.out.println(c.toString());

        System.out.println(c.getCONTADOR_PERSONA());

        Empleado e1 =  new Empleado(2,"Madeleine","Arana", 29, 2,2500);
        System.out.println(e1.toString());
        System.out.println(e1.getCONTADOR_PERSONA());

        Persona p1 =  new Persona(3, "Eli", "Rojas", 90);
        System.out.println(p1.toString());
        System.out.println(e1.getCONTADOR_PERSONA());

    }

}
