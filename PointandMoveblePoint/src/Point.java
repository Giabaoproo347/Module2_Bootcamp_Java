public class Point {
   private float x;
   private float y;
   private float[] arr = {x,y};


    public Point () {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float newX) {
        this.x= newX;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float newY) {
        this.y = newY;
    }

    public  void getXY() {
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void setXY() {
        for (int i = 0; i < arr.length; i++) {
            arr[0] = x;
            arr[1] = y;
            System.out.println(arr[i]);
        }
    }

    public String toString() {
        return " Point: X: "+getX()+" Y: "+getY();
    }

}
