import java.util.Scanner;
public class RectanglePrograme {
    public static void main(String[] args) {
        AreaRectangle area = new AreaRectangle();
        area.getAreaRec();
        System.out.println("Area is: "+area.getArea());
    }
}
    class AreaRectangle {
    float width;
    float height;
    float area;
    Scanner scanner = new Scanner(System.in);

    public void getAreaRec() {
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
    }
    public float getArea(){
        area = width * height;
        return  area;
    }
    }
