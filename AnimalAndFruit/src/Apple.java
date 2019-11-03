public class Apple implements Fruit, Edible {

    @Override
   public String isGreen() {
        return "Apple: red";
    }

    @Override
    public String howToEat() {
        return "Apple: ăn được";
    }
}