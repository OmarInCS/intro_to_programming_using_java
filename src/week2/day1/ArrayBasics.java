package week2.day1;

public class ArrayBasics {
    public static void main(String[] args) {
        double[] marks = {23, 12, 25, 19};
        double total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        double avg = total / marks.length;
        System.out.println("Average: " + avg);
    }
}
