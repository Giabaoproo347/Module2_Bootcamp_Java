import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Convert convert = new Convert();
        convert.getData();
        convert.getFunction();
    }
}
class Convert {
        Scanner scanner = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        int choice;

        public void getData() {
            System.out.println("Menu.");
            System.out.println("1.Convert Celcius to Fahrenheit:");
            System.out.println("2.Convert Fahrenheit to Celcius:");
            System.out.println("0.Exit");
            choice = scanner.nextInt();
        }

        public void getFunction() {
            switch (choice) {
                case 1:
                    System.out.println("Enter celcius:");
                    celcius = scanner.nextDouble();
                    fahrenheit = (9 / 5) * celcius + 32;
                    System.out.println(fahrenheit);
                    break;
                case 2:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celcius = (5 / 9) * (fahrenheit - 32);
                    System.out.println(celcius);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }