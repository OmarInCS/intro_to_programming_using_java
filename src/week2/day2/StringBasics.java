package week2.day2;

public class StringBasics {

    public static void main(String[] args) {
        String name = "Omar Karem";
        String email = "omarincs@gmail.com";
        String mobile = "0599888921";
        String message = "Welcome to Java";

        System.out.println(name.charAt(0));
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(5));
        System.out.println(name.length());

        System.out.println(message.replace("Java", "Python"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(email.contains("@"));
        System.out.println(email.endsWith(".com"));
        System.out.println(mobile.startsWith("05"));

        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('5'));
    }

}
