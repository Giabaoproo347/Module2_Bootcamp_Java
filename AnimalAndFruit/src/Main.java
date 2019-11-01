public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Animal animal1 = (Chicken) animal;
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
