package week3.day1;

public class Patient {
    String name;
    double weight;
    double height;

    Patient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    Patient(Patient p) {
        this.name = p.name;
        this.weight = p.weight;
        this.height = p.height;
    }

    double getBMI() {
        return weight / Math.pow(height / 100, 2);
    }

    String getStatus() {
        double bmi = getBMI();
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
