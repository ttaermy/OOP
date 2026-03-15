package Prob3;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount savings1 = new SavingsAccount(1001, 5);
        SavingsAccount savings2 = new SavingsAccount(1002, 3);

        CheckingAccount checking1 = new CheckingAccount(2001);
        CheckingAccount checking2 = new CheckingAccount(2002);

        bank.openAccount(savings1);
        bank.openAccount(savings2);
        bank.openAccount(checking1);
        bank.openAccount(checking2);

        System.out.println("=== Initial Deposits ===");

        savings1.deposit(1000);
        savings2.deposit(2000);

        checking1.deposit(500);
        checking2.deposit(800);

        bank.printAccounts();


        System.out.println("\n=== Withdrawals ===");

        savings1.withdraw(200);
        checking1.withdraw(50);

        bank.printAccounts();


        System.out.println("\n=== Transfers ===");

        savings1.transfer(300, checking1);

        bank.printAccounts();


        System.out.println("\n=== Multiple Checking Transactions ===");

        checking1.deposit(100);
        checking1.withdraw(20);
        checking1.deposit(40);
        checking1.withdraw(10);

        bank.printAccounts();


        System.out.println("\n=== Bank Update (Interest + Fees) ===");

        bank.update();

        bank.printAccounts();


        System.out.println("\n=== Closing Account ===");

        bank.closeAccount(savings2);

        bank.printAccounts();

    }
}
