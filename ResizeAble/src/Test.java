public class Test {
    public static void main(String[] args) {
        int side = (int) 1;
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(1, "green", true);
        shapes[1] = new Rectangle(1, 1, "blue", false);

        System.out.println("Before resize");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i] + "\n");
        }

        System.out.println("After resize");
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(side);
            System.out.println(shapes[i] + "\n");
        }

        Square[] squares = new Square[2];
        squares[0] = new Square(1, "red", false);
        squares[1] = new Square(2, "blue", true);

        System.out.println("Before resize");
        for (int i =0; i < squares.length; i++) {
            System.out.println(squares[i]+"\n");
        }

        System.out.println("After resize");
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]+"\n");
            squares[i].resize(5);

        }
    }
}