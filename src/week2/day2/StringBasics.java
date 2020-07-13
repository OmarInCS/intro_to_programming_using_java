package week2.day2;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Omar";
        String email = "omarincs@gmail.com";
        String mobile = "0599888921";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(email.contains("@"));
        System.out.println(email.indexOf("@"));
        System.out.println(mobile.startsWith("05"));
        System.out.println(email.replace("gmail", "hotmail"));
        System.out.println(email.substring(0, email.indexOf("@")));

        System.out.println("-".repeat(30));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
    }
}
