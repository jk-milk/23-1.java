package Unit5;
public class Circle {
    private int radius;
    private Point center;

    public Circle(Point p, int radius) {
        center = p;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", center=" + center + "]";
    }
}