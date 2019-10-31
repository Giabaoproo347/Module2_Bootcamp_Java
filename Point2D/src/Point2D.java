public class Point2D {
    float x = 4.0f;
    float y = 0.0f;
    float[] arr = {x, y};


    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float newX) {
        this.x = newX;
    }

    public void setY(float newY) {
        this.y = newY;
    }

    public void setXY(float x, float y) {
        for (int i = 0; i < arr.length; i++) {
            arr[0] = x;
            arr[1] = y;
            System.out.println("Các phần tử trong mảng là: "+arr[i]);
        }
    }

    public void getXY() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
