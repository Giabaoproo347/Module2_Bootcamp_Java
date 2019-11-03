import java.util.Arrays;
import java.util.Comparator;

public class TestCircleComparator{
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(4,5,"red",true);
        rectangles[1] = new Rectangle(3,6);
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle(9,2,"green",false);

        System.out.println("After-shorted");
        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }

        System.out.println("Before-shorted");
        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);
        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }
     }
}