public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Resolve1() {
        if (a == 0) {
            if (b == 0) {
                if (c==0) {
                    System.out.println("Phương trình vô số nghiệm");
                    System.exit(0);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có 1 nghiệm là: " + (-c / b));
            }
        }
    }

    public void Resovle2() {
        double delta = b * b - 4 * a * c;
        double x1;
        double x2;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm là: " + x1 + "; x2 là: " + x2);
        } else if (delta == 0 ) {
            x1 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép là: x1 = x2 :" + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
