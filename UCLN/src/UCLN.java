public class UCLN {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b) {
                a = a - b;
            }  else {
                b = b - a;
            }
        }

        System.out.println("Greatest common factor: " + b);

    }
}
