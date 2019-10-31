public class Circle extends Geometric {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "A circle with radius = " + getRadius() +", which is subclass of " + super.toString();
    }
}
