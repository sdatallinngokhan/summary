package week11.advanced;

import java.util.Scanner;

public class ScannerConsoleExercise {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number. It will be doubled : ");
        int number = scanner.nextInt();
        scanner.close();

        // Process
        int result = number * 2;

        // Output
        System.out.println("Output is : "+result);
    }
}
