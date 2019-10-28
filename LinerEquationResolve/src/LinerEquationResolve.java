import java.util.Scanner;
public class LinerEquationResolve {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolve");
        System.out.println("a * x + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();

        if ( a!= 0) {
            double solution = -b/a;
            System.out.println("The solution is: %f! "+ solution);
        } else {
            if (b == 0 ) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
