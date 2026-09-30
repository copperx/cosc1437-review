public class P10_Withdraw {
    // Return the balance left after taking amount out of balance.
    // Throw an IllegalArgumentException if amount is not positive.
    // Throw an InsufficientFundsException with a message if amount is more than balance.
    // First give InsufficientFundsException (in its own file) a constructor that takes the message

    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static double withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: amount exceeds balance.");
        }
        return balance - amount;
    }
}

