package day10;

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

    public static void printStatus(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }

    public static double max(double... numbers) {
        double best = numbers[0];
        for (double n : numbers) {
            if (n > best) {
                best = n;
            }
        }

        return best;
    }

    public static double[] maxThreeMarks(double[] marks) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            double best = 0;
            int bestIdx = 0;
            for (int j = 0; j < marks.length; j++) {
                if (marks[j] >= best) {
                    best = marks[j];
                    bestIdx = j;
                }
            }
            result[i] = best;
            marks[bestIdx] = -1;
        }
        return result;
    }
}
