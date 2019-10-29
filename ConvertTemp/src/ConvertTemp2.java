import java.util.Scanner;

public class ConvertTemp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Convert fahrentheit to celcius");
            System.out.println("2. Convert celcius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrentheit to Celcius is: " + celsiusToFahrenheit(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celcius:");
                    celcius = input.nextDouble();
                    System.out.println("Celcius to Fahrenheit is: " + fahrenheitToCelsius(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0) ;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
