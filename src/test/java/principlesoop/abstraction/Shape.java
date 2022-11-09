package principlesoop.abstraction;

public abstract class Shape {

    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getCenter() {
        return new int[]{x, y};
    }

    public abstract double area();
    public abstract double perimeter();

}
