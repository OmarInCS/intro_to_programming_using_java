package week3.day1;

public class Patient {

    double weight;
    double height;

    // Constructor
    Patient(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    double getBMI() {
        return this.weight / (this.height * this.height);
    }

    String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return  "Normal";
        else if (bmi < 30) return  "Overweight";
        else return "Obese";

    }

}
