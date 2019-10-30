import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        RectangleAreInOOP rectangle = new RectangleAreInOOP(width,height);
        System.out.println("Your rectangle is: "+rectangle.display());
        System.out.println("Area of rectangle is : "+rectangle.getArea());
        System.out.println("Perimeter of rectangle is: "+rectangle.getPerimeter());
    }
}