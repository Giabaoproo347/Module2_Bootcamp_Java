public class Circle {
    double radius;
    String color;

    public Circle() {

    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "A circle with radius:"+getRadius()
                +" color is:" + getColor();
    }
}
