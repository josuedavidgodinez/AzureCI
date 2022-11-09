package principlesoop.abstraction;

public class AbstractionRunner {

    public static void main(String args[]) {

        Circle circle = new Circle(5,8, 4);

        System.out.println("Area del círculo: " + circle.area());
        System.out.println("Perímetro del círculo: " + circle.perimeter());

    }

}
