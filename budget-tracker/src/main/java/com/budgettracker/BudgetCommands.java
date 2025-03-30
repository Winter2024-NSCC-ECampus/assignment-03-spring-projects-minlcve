package com.budgettracker;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class BudgetCommands {

    private double balance = 0;

    @ShellMethod("Add income to your budget.")
    public String addIncome(double amount) {
        balance += amount;
        return "Income added. Current balance: $" + balance;
    }

    @ShellMethod("Add an expense to your budget.")
    public String addExpense(double amount) {
        balance -= amount;
        return "Expense added. Current balance: $" + balance;
    }

    @ShellMethod("Display current balance.")
    public String showBalance() {
        return "Your current balance is: $" + balance;
    }
}
