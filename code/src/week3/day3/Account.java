package week3.day3;

public class Account {
    private String name;
    private double balance;
    private static double annualRate = 0.04;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(Account a) {
        this(a.name, a.balance);
    }

//    public Account(Account a) {
//        this.name = a.name;
//        this.balance = a.balance;
//    }


    public double getBalance() {
        return balance;
    }

    public static double getMonthlyRate() {
        return annualRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyRate() * balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public String getName() {
        return name;
    }

    public static double getAnnualRate() {
        return annualRate;
    }

    public static void setAnnualRate(double annualRate) {
        Account.annualRate = annualRate;
    }
}
