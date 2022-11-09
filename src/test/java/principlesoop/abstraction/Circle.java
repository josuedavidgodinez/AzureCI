package principlesoop.abstraction;

public class Circle  extends Shape{

    protected double radio;

    public Circle(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radio,2));
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radio);
    }
}
