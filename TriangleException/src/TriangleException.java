import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try {
            System.out.println("Sum off 3 edge is: "+ triangle.getData());

        } catch (IllegalTriangleException e) {
            System.out.println("Chi so vuot qua gioi han");
        }
    }
}
class Triangle {
    Scanner scanner = new Scanner(System.in);
    int edge1;
    int edge2;
    int edge3;
    int sumOfEdge;

    public int getData() {
        System.out.println("Enter edge 1:");
        edge1 = scanner.nextInt();
        System.out.println("Enter edge2: ");
        edge2 = scanner.nextInt();
        System.out.println("Enter edge3: ");
        edge3 = scanner.nextInt();
        sumOfEdge = edge1 + edge2 + edge3;
        return sumOfEdge;


    }
//    public int getResult() {
//
//    }
}