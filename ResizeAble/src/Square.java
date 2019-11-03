public class Square extends Rectangle implements ResizeAble {
    double side;
    String color;
    Boolean filled;
    public Square() {
    }

    public Square(double side,String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }


    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public void setSide( double newSide) {
        this.side = newSide;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                +"\n"
                + "Area:"
                + getArea()
                +"\n";
    }

    @Override
    public void resize(double percent) {
        double percentSide = this.side * percent /100;
        this.side += percentSide;
    }
}