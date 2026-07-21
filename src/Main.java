import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ExpenseManager manager = new ExpenseManager();

        while (true) {

            System.out.println("\n===== Expense Splitter =====");
            System.out.println("1. Add User");
            System.out.println("2. Show Users");
            System.out.println("3. Add Expense");
            System.out.println("4. Show Balances");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    users.add(new User(name));
                    System.out.println("User added successfully!");
                    break;

                case 2:
                    System.out.println("\nUsers in Group:");

                    if (users.isEmpty()) {
                        System.out.println("No users found.");
                    } else {
                        for (User user : users) {
                            System.out.println(user.getName());
                        }
                    }
                    break;

                case 3:
                    if (users.isEmpty()) {
                        System.out.println("Please add users first.");
                        break;
                    }

                    System.out.print("Enter who paid: ");
                    String paidBy = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    manager.addExpense(paidBy, amount, users.size());
                    break;

                case 4:
                    System.out.println("\nBalances:");
                    manager.showBalances();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}