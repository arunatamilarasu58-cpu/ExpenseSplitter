public class Expense {

    private String paidBy;
    private double amount;

    public Expense(String paidBy, double amount) {
        this.paidBy = paidBy;
        this.amount = amount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public double getAmount() {
        return amount;
    }
}