package week1.day4;

import java.util.Locale;

public class StringBasics {
    public static void main(String[] args) {
        String msg = "Welcome to Java";
        String mobile = "0599888921";
        String name = "Omar";

        System.out.println(msg.length());
        System.out.println(msg.charAt(0));
        System.out.println(msg.substring(0, 7));

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.replace("Java", "Python"));
        System.out.println(msg.startsWith("We"));
        System.out.println(msg.endsWith("We"));
        System.out.println(msg.contains("We"));

        char ch = mobile.charAt(0);
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
    }
}
