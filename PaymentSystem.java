 // PaymentSystem.java
public class PaymentSystem {
    private double balance;
    
    public PaymentSystem(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientFundsException(
                "Insufficient funds. Required: " + amount + 
                ", Available: " + balance + ", Deficit: " + deficit, 
                deficit
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
    
