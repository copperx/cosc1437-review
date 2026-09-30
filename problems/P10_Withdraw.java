public class P10_Withdraw {
    public static double withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: balance is " + balance + ", but amount requested is " + amount);
        }
        return balance - amount;
    }
}
