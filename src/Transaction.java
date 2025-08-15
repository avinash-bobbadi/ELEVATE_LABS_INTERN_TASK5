import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime dateTime;
    private double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
        this.balanceAfter = balanceAfter;
    }

    @Override
    public String toString() {
        return dateTime + " - " + type + ": " + amount + " | Balance: " + balanceAfter;
    }
}
