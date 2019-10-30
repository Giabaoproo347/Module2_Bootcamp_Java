import sun.java2d.pipe.hw.AccelTypedVolatileImage;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    private boolean on = false;
    private String color = "blue";
    private int speed = SLOW;
    private double radius = 5;

    public Fan() {

    }

    // Cần hỏi phương thức toString!

    public Fan(int speed, boolean on, String color, double radius) {
        this.on = on;
        this.color = color;
        this.speed = speed;
        this.radius = radius;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return false;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setSpeed(int speedvalue) {
        this.speed = speedvalue;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setStatus(boolean newStatus) {
        this.on = newStatus;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void turnOn() {
        if (on == true) {
            System.out.println("Your fan is on. Speed is:" + this.speed + "; Color is:" + this.color + "; Radius is: " + this.radius);
        } else {
            System.out.println("Your fan is off. Radius is: "+this.radius+"; Color is: "+this.color);
        }
    }
}