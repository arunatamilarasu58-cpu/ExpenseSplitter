import java.util.ArrayList;
import java.util.HashMap;

public class ExpenseManager {

    private HashMap<String, Double> balances = new HashMap<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addExpense(String paidBy, double amount, int members) {

        double share = amount / members;

        balances.put(
                paidBy,
                balances.getOrDefault(paidBy, 0.0) + (amount - share)
        );

        transactions.add(new Transaction(paidBy, amount));

        System.out.println("Expense Added Successfully");
    }

    public void showBalances() {

        System.out.println("\nBalances:");

        if (balances.isEmpty()) {
            System.out.println("No balances available.");
            return;
        }

        for (String user : balances.keySet()) {
            System.out.println(user + " = Rs." + balances.get(user));
        }
    }

    public void showTransactions() {

        System.out.println("\nTransaction History:");

        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}