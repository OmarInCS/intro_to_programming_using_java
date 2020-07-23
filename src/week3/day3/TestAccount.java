package week3.day3;

public class TestAccount {

    public static void main(String[] args) {

        Account a1 = new Account(1, 20000);
        Account a2 = new Account(2, 15000);

        System.out.println(a1.getBalance());
        a1.withdraw(1500);
        a1.deposit(250);

        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyInt());

        System.out.println(Account.annualRate);
        System.out.println(Account.getMonthlyRate());

        System.out.println("-".repeat(20));

//        a2.balance -= 50000;
        System.out.println(a2.getBalance());

//        Account a3 = a2;
        Account a3 = new Account(a2.id, a2.getBalance());
        a3.withdraw(2000);

        System.out.println(a2.getBalance());
        System.out.println(a3.getBalance());



    }
}
