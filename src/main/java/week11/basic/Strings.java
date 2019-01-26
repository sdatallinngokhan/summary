package week11.basic;

public class Strings {

    public static void main(String[] args) {
        String stringValue1 = "Hello";

        System.out.println("My String value is : " + stringValue1);
        System.out.println("stringValue1 is starting with He ? : " + stringValue1.startsWith("He"));
        System.out.println("stringValue1 is starting with el ? : " + stringValue1.startsWith("el"));
        System.out.println("stringValue1 is ends with llo ? : " + stringValue1.endsWith("llo"));
        System.out.println("stringValue1 contains ll ? : " + stringValue1.contains("ll"));
        System.out.println("stringValue1 in big letters : "+stringValue1.toUpperCase());
        System.out.println("stringValue1 in small letters : "+stringValue1.toLowerCase());
        System.out.println("stringValue1 length is : "+stringValue1.length());
    }
}
