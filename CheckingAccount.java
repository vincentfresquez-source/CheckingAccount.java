 public class CheckingAccount extends BankAccounts {

    private double interestRate = 0.01; // 1%

    // Overdraft withdrawal method
    public void processWithdrawal(double amount) {
        balance -= amount;

        if (balance < 0) {
            balance -= 30; // overdraft fee
            System.out.println("Overdraft! A $30 fee has been charged.");
        } else {
            System.out.println("Withdrawal processed successfully.");
        }

        System.out.println("Current balance: $" + balance);
    }

    // Display full account info
    public void displayAccount() {
        System.out.println("\n--- Checking Account Details ---");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Account ID: " + getAccountID());
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Thanks for banking with us!");
    }
}