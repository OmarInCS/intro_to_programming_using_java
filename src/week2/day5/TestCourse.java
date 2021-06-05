package week2.day5;

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the course title: ");
        String title = sc.nextLine();
        System.out.print("Enter the course price: ");
        double price = sc.nextDouble();

        Course c1 = new Course(title, price);
        int choice;

        do {
            System.out.println("\n1) Add Student");
            System.out.println("2) Drop Student");
            System.out.println("3) Number of Students");
            System.out.println("4) Show Students");
            System.out.println("5) Total Income");
            System.out.println("6) Exit");
            System.out.print("\nEnter your choice number: ");
            choice = sc.nextInt();

            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter the std. name: ");
                String name = sc.nextLine();
                c1.addStudent(name);
            }
            else if (choice == 2) {
                System.out.print("Enter the std. name: ");
                String name = sc.nextLine();
                c1.dropStudent(name);
            }
            else if (choice == 3) {
                System.out.println("The num. of students: " + c1.getNumOfStudents());
            }
            else if (choice == 4) {
                System.out.println("The students: " + c1.getStudents());
            }
            else if (choice == 5) {
                System.out.println("The Total income: " + c1.getTotalIncome());
            }

        } while (choice != 6);

        System.out.println("Good Bye!!");
    }
}
