package week11.advanced.oop.polymorphism;

public class PolymorphismTest {

    public static final String ANIMAL_TYPE = "cat";

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        if (ANIMAL_TYPE.equals("dog")) {
            animal = new Dog();
        }

        if (ANIMAL_TYPE.equals("cat")) {
            animal = new Cat();
        }

        animal.sound();

        if (animal instanceof Cat) {
            System.out.println("I am a cat");
        }

        if (animal instanceof Dog) {
            System.out.println("I am a dog");
        }
    }
}
