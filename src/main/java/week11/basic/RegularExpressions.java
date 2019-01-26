package week11.basic;

public class RegularExpressions {

    public static void main(String[] args) {
        String word = "q1wdsd3fwef";
        boolean result = word.matches(".*[0-9].*"); // .* ignores beginning and ending of string and [0-9] is checking whether a character of string is matching.
        System.out.println("Does word contain digit? : " + result);

        System.out.println();

        System.out.println("Numbers in the string");
        for (int i = 0; i < word.length(); i++) {
            String temp = "" + word.charAt(i);
            if (temp.matches(".*[0-9].*")) {
                System.out.println(temp);
            }
        }

        System.out.println();
        System.out.println();

        String word1 = "efma";

        boolean result2 = word1.matches("[a-z]*");
        System.out.println("Does word1 is occured by small letters? : "+result2);

        System.out.println();
        System.out.println();

        String word2 = "SDFGG";

        boolean result3 = word2.matches("[A-Z]*");
        System.out.println("Does word2 is occured by capital letters? : "+result3);
    }
}
