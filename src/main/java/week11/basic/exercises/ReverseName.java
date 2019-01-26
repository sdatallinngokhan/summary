package week11.basic.exercises;

public class ReverseName {

    public static void main(String[] args) {
        String myName = "Gokhan";

        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.print(myName.charAt(i));
        }
    }
}
