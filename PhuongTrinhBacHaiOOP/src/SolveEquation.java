import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        System.out.println("Phương trình có dạng: ax^2 + bx + c =0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào số c:");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.Resolve1();
        equation.Resovle2();
    }
}
