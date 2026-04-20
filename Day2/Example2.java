class BankAccount {
    private double balance;

    // Setter with condition
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.deposit(-500);   // ignored (invalid)

        System.out.println("Balance: " + acc.getBalance());
    }
}