package principlesoop.encapsulation;

public class EncapsulationRunner {

    public static void main(String args[]) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo("1490112348");

        encapsulationDemo.setName("Empleado De Prueba");
        encapsulationDemo.setEmail("testemail@test.com");
        encapsulationDemo.setAmount(97.95);
        System.out.println("Account number: " + encapsulationDemo.getAccNumber());
        System.out.println("Customer name: " + encapsulationDemo.getName());
        System.out.println("Customer email: " + encapsulationDemo.getEmail());
        System.out.println("Account balance: " + encapsulationDemo.getAmount());
    }

}
