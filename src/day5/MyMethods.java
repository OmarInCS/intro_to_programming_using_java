package day5;

public class MyMethods {

    static double getBMI(double weight, double height) {
        return weight / Math.pow(height / 100, 2);
    }

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    static void printStatus(double bmi) {
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
