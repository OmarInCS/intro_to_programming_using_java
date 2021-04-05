package day7;

public class Account {
    String name;
    private double balance;
    final static double annualRate = 0.04;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static double getMonthlyRate() {
        return annualRate / 12;
    }

    public double getMonthlyInt() {
        return getMonthlyRate() * balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
