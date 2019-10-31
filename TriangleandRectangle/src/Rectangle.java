public class Rectangle extends Geometric {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void setHeight(double newHeight) {

        this.height = newHeight;
    }

    public double getWidth() {

        return this.width;
    }

    public double getHeight() {

        return this.height;
    }

    public String toString() {
        return "A rectangle with height is: " + getHeight()
                + "witdh is: " + getWidth()
                + " which is subclass of: "  + super.toString();
    }

}
