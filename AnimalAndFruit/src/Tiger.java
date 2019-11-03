public class Tiger implements Animal, Edible,Fruit  {
    @Override
    public String makeSound() {
        return "Tiger : roarr...";
    }

    @Override
    public String howToEat() {
        return "Hổ ăn được";
    }

    @Override
    public String isGreen() {
        return null;
    }
}
