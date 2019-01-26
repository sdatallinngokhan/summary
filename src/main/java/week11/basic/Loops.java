package week11.basic;

public class Loops {

    public void forLoop() {
        System.out.println("---FOR LOOP---");
        for (int i = 1; i <= 10; i++) { // loop index is i. continue to loop until i<=10. increase i 1 in each iteration
            System.out.println("i value is : " + i);
        }
        System.out.println();
        System.out.println();
    }

    public void whileLoop() {
        System.out.println("---WHILE LOOP---");
        int i = 1;

        while (i <= 10) { // continue to while loop until i<=10
            System.out.println("i value is : " + i);
            i = i + 2; // i += 2; does same thing
        }
        System.out.println();
        System.out.println();
    }

    public void forEachLoop() {
        int[] numbersArray = {1, 2, 3};

        System.out.println("---FOREACH LOOP---");
        System.out.println("Let's print out results with foreach loop");
        for (int number : numbersArray) { // there is no index in foreach loop. because it is working with already indexed data structures. and index is being increased 1 in each iteration.
            System.out.println(number);
        }

        System.out.println();
        System.out.println();

        System.out.println("Let's print out results with for loop");
        for (int i = 0; i<numbersArray.length; i++){ // this for loop does the same thing as above
            System.out.println(numbersArray[i]);
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.forLoop();
        loops.whileLoop();
        loops.forEachLoop();
    }
}
