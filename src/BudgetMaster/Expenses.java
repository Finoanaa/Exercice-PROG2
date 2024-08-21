package BudgetMaster;

import org.w3c.dom.Text;

import java.time.LocalDate;


public class Expenses {
    private Text description;
    private int amount;
    private Category category;
    private LocalDate date;

    public Expenses(Text description, int amount, Category category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public Text getDescription() {return description;}

    public void setDescription(Text description) {this.description = description;}

    public int getAmount() {return amount;}

    public void setAmount(int amount) {this.amount = amount;}

    public Category getCategory() {return category;}

    public void setCategory(Category category) {this.category = category;}

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}



}
