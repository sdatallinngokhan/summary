package week11.basic.exercises;

public class Replace2Numbers {

    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
