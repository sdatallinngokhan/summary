package week11.basic.exercises;

public class SumOfPrimeNumbers {

    public boolean isPrime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();

        int sum = 0;
        for (int i = 1; i<=1000; i++){
            if (sumOfPrimeNumbers.isPrime(i)){ // instance.method(parameter if any)
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
