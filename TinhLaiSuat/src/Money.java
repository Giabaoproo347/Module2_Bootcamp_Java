import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double money;
        int month;
        double rate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập vào số tháng gửi");
        month = scanner.nextInt();
        System.out.println("Nhập vào lãi suất");
        rate = scanner.nextDouble();
        double total_rate = money * (rate/100)/12*month;
        System.out.println("Số tiền lãi là:"+total_rate);

    }
}
