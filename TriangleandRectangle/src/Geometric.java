public class Geometric {
    private String color = "green";
    private boolean filled = true;

    public Geometric() {

    }

    public Geometric (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getStatus() {
        return this.filled;
    }

    public void setColor(String  newColor) {
        this.color = newColor;
    }

    public void setStatus(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return " A Shape with color of "
                + getColor()
                +" and "
                +(getStatus()? "filled ":" not filled");
    }
}
