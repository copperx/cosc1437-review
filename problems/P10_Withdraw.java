public class P10_Withdraw {
    public static double withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("balance is only " + balance);
        }
        return balance - amount;
    }
}
