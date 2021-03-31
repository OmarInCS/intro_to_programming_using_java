package day4;

import java.util.Locale;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Omar";
        String email = "OmarInCS@gamil.com";
        String mobile = "0599888921";
        String message = "Welcome to Java";

        System.out.println(message);
        System.out.println(message.charAt(0));
        System.out.println(message.length());
        System.out.println(message.charAt(message.length() - 1));
        System.out.println(message.substring(0, 7));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(email.contains("@"));
        System.out.println(email.endsWith(".com"));
        System.out.println(mobile.startsWith("05"));
        System.out.println(message.replace("Java", "C#"));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('A'));
    }
}
