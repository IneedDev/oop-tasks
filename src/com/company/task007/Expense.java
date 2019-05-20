package com.company.task007;

public class Expense {
    private String expenseName;
    private int expenseBrutto;
    private int vat;

    public Expense(String expenseName, int expenseBrutto, int vat) {
        this.expenseName = expenseName;
        this.expenseBrutto = expenseBrutto;
        this.vat = vat;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public int getExpenseBrutto() {
        return expenseBrutto;
    }

    public void setExpenseBrutto(int expenseBrutto) {
        this.expenseBrutto = expenseBrutto;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }


}