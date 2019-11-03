public class Chicken implements Edible, Animal {
    @Override
    public String makeSound() {
        return " Chicken: cluk cluk";
    }

    @Override
    public String howToEat() {
        return "Chicken : ăn được";
    }
}
