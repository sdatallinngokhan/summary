package week11.basic.exercises;

public class FindBiggest3Numbers {

    public static void main(String[] args) {
        int[] numbersArray = {90, 3, 2, 1, 5, 4, 45, 32};

//        int firstNumber = numbersArray[0];
//        int secondNumber = numbersArray[1];
//        int thirdNumber = numbersArray[2];
//
//        int[] result = new int[3];
//        result[0] = numbersArray[0];
//        result[1] = numbersArray[1];
//        result[2] = numbersArray[2];

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] < numbersArray[j]) {
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = temp;
                }
            }
        }

        for (int i : numbersArray) {
            System.out.print(i + ", ");
        }
    }

}
