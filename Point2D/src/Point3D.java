public class Point3D extends Point2D {
    float z;
    float[] arr2 = {x,y,z};

    public Point3D () {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float newZ) {
        this.z = newZ;
    }

    public void setXYZ(float x, float y, float z) {
        for (int i = 0; i < arr2.length; i++ ) {
            arr2[0] = x;
            arr2[1] = y;
            arr2[2] = z;
            System.out.println(arr2[i]);;
        }
    }

    public void getXY() {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }



}
