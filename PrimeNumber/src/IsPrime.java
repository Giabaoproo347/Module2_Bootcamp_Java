import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }

        if (check)
            System.out.println(number + " is a prime.");
        else
            System.out.println(number + " is not a prime.");

    }
}