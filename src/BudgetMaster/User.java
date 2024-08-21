package BudgetMaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class User {
    private String name;
    private int monthlyBudget;
    List<Expenses> expensesList;

    public User(String name, int monthlyBudget, List<Expenses> expensesList) {
        this.name = name;
        this.monthlyBudget = monthlyBudget;
        this.expensesList = expensesList;

    }

    public User() {
        this.expensesList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(int monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public List<Expenses> getExpensesList() {
        return expensesList;
    }

    public void setExpensesList(List<Expenses> expensesList) {
        this.expensesList = expensesList;
    }

    public void addExpense(Expenses newExpense) {
        this.expensesList.add(newExpense);

    }

    public List<Expenses> getExpenseByCategory(String category) {
        return this.expensesList.stream()
                .filter(expensesList -> Objects.equals(expensesList.getCategory(), category))
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", monthlyBudget=" + monthlyBudget +
                ", expendituresList=" + expensesList +
                '}';
    }
}
