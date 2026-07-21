public class Transaction {

    private String paidBy;
    private double amount;

    public Transaction(String paidBy, double amount) {
        this.paidBy = paidBy;
        this.amount = amount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return paidBy + " paid Rs." + amount;
    }
}