package week11.basic;

public class ConstructorExercise {

    // these constructor is default constructor. because this constructor does not have any parameter
    public ConstructorExercise() { // constructor is defined with access modifier and same name with Class name
        System.out.println("default constructor is called");
    }

    // these constructor is parameterized constructor. because this constructor gets parameter
    public ConstructorExercise(String name) {
        System.out.println("parameterized constructor is called");
        System.out.println("parameterized constructor parameter value is : " + name);
    }

    public static void main(String[] args) {
        ConstructorExercise constructorExercise1 = new ConstructorExercise("Gokhan"); // instance of ConstructorExercise class is created with parameterized constructor
        ConstructorExercise constructorExercise = new ConstructorExercise(); // instance of ConstructorExercise class is created with default constructor
    }
}
