package com.company.task007;


public class Database {

    //Database contains array for expense and array fo income

    private Expense[] expenses;
    private Income[] incomes;

    public Database(int size) {
        this.expenses = new Expense[size];
        this.incomes = new Income[size];
    }

    public Expense[] getExpenses() {
        return expenses;
    }

    public void setExpenses(Expense[] expenses) {
        this.expenses = expenses;
    }

    public Income[] getIncomes() {
        return incomes;
    }

    public void setIncomes(Income[] incomes) {
        this.incomes = incomes;
    }

    public void addExpense(Expense expense){
        for (int i=0;i<10;i++){
            //if expenses[i] is empty place new expense
            if (expenses[i]==null){
                expenses[i]=expense;
                break;
            }
        }
    }


}
