package week2.day3;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Omar";
        String email = "OmarInCS@gmail.com";
        String mobile = "0599888921";

        System.out.println(name.length());
        System.out.println(name.charAt(1));
        char letter = name.charAt(3);
        System.out.println(letter);
        System.out.println(name.toUpperCase());
        System.out.println(email.replace(".com", ".net"));
        System.out.println(email.substring(0, 8));
        System.out.println(email.contains("@"));
        System.out.println(mobile.startsWith("05"));
        System.out.println(email.endsWith(".com"));

        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isLetter('O'));

    }
}
