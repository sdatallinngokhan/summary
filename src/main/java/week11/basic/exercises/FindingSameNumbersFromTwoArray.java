package week11.basic.exercises;

public class FindingSameNumbersFromTwoArray {

    public static void main(String[] args) {
        int[] array1 = {1, 45, 4, 8, 6, 10};
        int[] array2 = {5, 1, 10, 8, 45, 1, 4};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    String common = "" + array1[i];

                    String[] splittedResult = sb.toString().split(", ");

                    boolean isContainCommon = false;
                    for (int k = 0; k<splittedResult.length; k++){
                        if (splittedResult[k] == common) {
                            isContainCommon = true;
                            break;
                        }
                    }

                    if (!isContainCommon) {
                        sb.append(common+", ");
                    }
                }
            }
        }

        System.out.println(sb);
    }

    public void compareStringAndStringBuilder() {
        // StringBuilder usage
        StringBuilder sb = new StringBuilder();
        sb.append("Gokhan ");
        sb.append("Polat ");
        sb.append("Estonia ");
        sb.append(5);

        // String usage
        String s = "Gokhan ";
        s = s + "Polat ";
        s = s + "Estonia ";
        s = s + 5;

        System.out.println("StringBuilder result : " + sb);

        System.out.println();

        System.out.println("String result : " + s);
    }
}
