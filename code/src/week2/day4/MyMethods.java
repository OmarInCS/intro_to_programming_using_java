package week2.day4;

public class MyMethods {

    public static double getBMI(double weight, double height) {
        return weight / Math.pow(height / 100, 2);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal";
        }
        else if (bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}
