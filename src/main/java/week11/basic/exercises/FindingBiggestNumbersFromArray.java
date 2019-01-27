package week11.basic.exercises;

public class FindingBiggestNumbersFromArray {

    public static void main(String[] args) {
        int numbersArray[] = {45, 12, 76, 34, 54, 23, 89, 65, 4};

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] < numbersArray[j]) {
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(numbersArray[0] + ", ");
        sb.append(numbersArray[1] + ", ");
        sb.append(numbersArray[2]);

        System.out.println(sb);
    }
}
