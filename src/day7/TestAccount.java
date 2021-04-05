package day7;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("Ahmed", 20000);
        Account a2 = new Account("Ali", 15000);

        a1.withdraw(5000);
        a2.deposit(5000);

//        Account.annualRate = 0.05;

        System.out.printf("%s: %.2f %.2f\n", a1.name, a1.getBalance(), a1.getMonthlyInt());
        System.out.printf("%s: %.2f %.2f\n", a2.name, a2.getBalance(), a2.getMonthlyInt());
        System.out.println(Account.annualRate);
        System.out.println(Account.getMonthlyRate());
    }
}
