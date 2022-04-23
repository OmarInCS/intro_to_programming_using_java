package day11;

public class Patient {
    String name;
    double weight;
    double height;

//    Patient() {
//
//    }

    Patient(String name) {
        this(name, 70, 170);
//        this.name = name;
//        weight = 70;
//        height = 170;
    }

    Patient(String name, double w, double h) {
        this.name = name;
        this.weight = w;
        this.height = h;
    }

    double getBMI() {
        return this.weight / Math.pow(this.height / 100, 2);
    }

    String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
