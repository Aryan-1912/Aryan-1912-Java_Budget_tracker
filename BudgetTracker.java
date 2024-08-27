import java.util.*;

public class BudgetTracker extends BudgetItem {

     public static ArrayList<BudgetItem> budgetItems = new ArrayList<>();

    public BudgetTracker() {
    }

    public double calculateTotalIncome() {
        double totalIncome = 0;
        for (BudgetItem item : budgetItems) {
            if (item.getType().equals("Income")) {
                totalIncome += item.getAmount();
            }
        }
        return totalIncome;
    }

    public double calculateTotalExpenses() {
        double totalExpenses = 0;
        for (BudgetItem item : budgetItems) {
            if (item.getType().equals("Expense")) {
                totalExpenses += item.getAmount();
            }
        }
        return totalExpenses;
    }

    public double calculateBalance() {
        return calculateTotalIncome() - calculateTotalExpenses();
    }

    public static ArrayList<BudgetItem> getBudgetItems() {
        return budgetItems;
    }
    public static void addBudgetItems(BudgetItem i){
        budgetItems.add(i);
    }
    public void genReport()
    {
        
        System.out.println("    NAME OF USER:  ARYAN(ADMIN) ");
        System.out.println("    TOTAL INCOME >>>   :     "+calculateTotalIncome());
        System.out.println("    TOTAL EXPENSE >>>   :     "+calculateTotalExpenses());
        System.out.println("    TOTAL BALANCE REMAINING >>>   :     "+calculateBalance());
    }
    
}