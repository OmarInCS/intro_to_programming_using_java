package week3.day3;

public class Account {

    int id; // instance variable
    private double balance;     // Encapsulation
    static double annualRate = 0.04;   // class variable

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // class method
    static double getMonthlyRate() {
        return annualRate / 12;
    }

    // instance method
    double getMonthlyInt() {
        return getMonthlyRate() * this.balance;
    }

    void withdraw(int amount) {
        if (amount < this.balance && amount % 50 == 0) {
            this.balance -= amount;
        }
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    double getBalance() {
        return this.balance;
    }

}
