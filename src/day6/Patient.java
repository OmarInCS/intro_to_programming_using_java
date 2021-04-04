package day6;

public class Patient {
    String name;
    double weight;
    double height;

    Patient(String n, double w, double h) {
        name = n;
        weight = w;
        height = h;
    }

    double getBMI() {
        return weight / Math.pow(height / 100, 2);
    }

    String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
