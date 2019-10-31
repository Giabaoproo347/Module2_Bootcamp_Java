public class MoveAblePoint extends Point {
    float xSpeed;
    float ySpeed;
    float[] speed = {xSpeed,ySpeed};

    public MoveAblePoint() {

    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setxSpeed( float newXSpeed) {
        this.xSpeed = newXSpeed;
    }

    public void setySpeed( float newYSpeed) {
        this.ySpeed = newYSpeed;
    }

    public void getSpeed () {
        for (int i = 0; i < speed.length; i++) {
            System.out.println(speed[i]);
        }
    }

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+" xSpeed: "+getxSpeed()+" ySpeed: "+getySpeed();
    }

    public MoveAblePoint move() {
        this.setX(super.getX() + this.xSpeed);
        this.setY(super.getY() + this.ySpeed);
        return this;
    }
}
