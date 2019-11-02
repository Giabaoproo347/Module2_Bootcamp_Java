import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Nhập chiều cao của bạn:");
        height = scanner.nextDouble();
        System.out.println("Nhập cân nặng của bạn:");
        weight = scanner.nextDouble();
        double BMI = weight / (height*height);
        System.out.println(BMI);

        if (BMI < 18.) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30 ) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
