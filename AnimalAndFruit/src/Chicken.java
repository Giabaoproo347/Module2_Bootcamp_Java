public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return " Chicken: cluk cluk";
    }

    @Override
    public String howToEat() {
        return "Chicken : ăn được";
    }
}
