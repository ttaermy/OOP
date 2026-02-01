public class SavingsAccount {
    public static void main(String[] args) {
        double balance = 1000.0;
        double interestRate = 0.05;
 
        double interest = balance * interestRate;
        double newBalance = balance + interest;
 
        System.out.println("Initial balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("New balance: " + newBalance);
    }
}