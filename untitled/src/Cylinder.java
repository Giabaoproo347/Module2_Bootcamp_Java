public class Cylinder extends Circle {
    double height;

    public Cylinder (){

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newHeight) {
        this.height = height;
    }

    public double getVolume (){
        return getArea()*height;
    }

    public String toString() {
        return "A cylinder with height is: "+getHeight()
        + "Volume is"+ getVolume() +
        "which is subclass of:" + super.toString();
    }


}
