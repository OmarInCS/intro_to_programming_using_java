package day5;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Omar";
        String email = "omarincs@gmail.com";
        String mobile = "0599888921";
        String message = "Welcome to Java";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(message.substring(0, 7));
        System.out.println(message.replace("Java", "C#"));

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(mobile.startsWith("05"));
        System.out.println(email.endsWith(".com"));
        System.out.println(email.contains("@"));
        System.out.println(message.substring(0, 7).toUpperCase() + message.substring(7));

        char grade = 'A';
        System.out.println(Character.isLetter(grade));
        System.out.println(Character.isDigit(grade));
        System.out.println(Character.isUpperCase(grade));
    }
}
