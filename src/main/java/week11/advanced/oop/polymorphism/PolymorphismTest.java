package week11.advanced.oop.polymorphism;

public class PolymorphismTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        if (AnimalType.dog.equals("dog")) {
            animal = new Dog();
        }

        if (AnimalType.cat.equals("cat")) {
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
