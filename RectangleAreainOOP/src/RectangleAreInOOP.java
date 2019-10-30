public class RectangleAreInOOP {
    double width;
    double height;

    public RectangleAreInOOP() {
    }

    public RectangleAreInOOP (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width)/2;
    }

    public String display() {
        return ("Rectangle: { your width is: "+this.width+" your height is: "+this.height);
    }
}

