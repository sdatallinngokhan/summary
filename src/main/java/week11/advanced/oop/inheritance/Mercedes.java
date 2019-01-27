package week11.advanced.oop.inheritance;

public class Mercedes extends Car {

    public Mercedes() {
        System.out.println("I am in sub class default const.");
    }

    public Mercedes(String name) {
        super(name);
        System.out.println("I am in sub class parameterized const.");
        System.out.println(name);
    }

    public static void main(String[] args) {
        String name = "Gokhan";
        Mercedes mercedes = new Mercedes(name);
    }

}
