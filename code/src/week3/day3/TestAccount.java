package week3.day3;

public class TestAccount {

    public static void main(String[] args) {

        Account a1 = new Account("Omar", 20000);
        Account a2 = new Account("Khalid", 15000);
//        Account a3 = a1;
        Account a3 = new Account(a1);

        a1.withdraw(5000);
        a2.deposit(5000);

        System.out.printf("%s, %.2f\n", a1.getName(), a1.getBalance());
        System.out.printf("%s, %.2f\n", a2.getName(), a2.getBalance());
        System.out.printf("%s, %.2f\n", a3.getName(), a3.getBalance());

    }

}
