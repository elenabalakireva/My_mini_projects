package com.company;

public class CreditAccount extends Account {
    int amount;

    public CreditAccount(int amount) {
        this.amount = amount;
    }

    public boolean pay(int amount) {
        this.amount -= amount;
        return true;

    }

    public boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            this.amount -= amount;
            return true;
        } else return false;
    }

    public boolean addMoney(int amount) {
        if ((this.amount + amount) <= 0) {
            this.amount += amount;
            return true;
        } else
            return false;

    }


}
