package labsheet05.question08;

class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        boolean success;
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed: check the amount and available balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account number: " + accountNo);
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Ravi Kumar", 1000.00);
        account.deposit(500.00);
        account.withdraw(300.00);
        account.withdraw(5000.00);
        account.displayAccount();
    }
}