package week2.day3;

public class MyMethods {

    public static double getPercentage(double mark, int finalMark) {
        return mark / finalMark * 100;
    }

    public static String getGrade(double pct) {
        if (pct > 85) {
            return "Excellent";
        }
        else if (pct > 75) {
            return "V. Good";
        }
        else if (pct > 65) {
            return "Good";
        }
        else if (pct >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public static boolean isAllLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllDigits(String number) {
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPlateValid(String plate) {
        if (plate.length() < 4 || plate.length() > 7) {
            return false;
        }

        String part1 = plate.substring(0, 3);
        String part2 = plate.substring(3);

        if (isAllLetters(part1) && isAllDigits(part2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
