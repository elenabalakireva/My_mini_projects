package com.company;

public class SavingsAccount extends Account {
    int amount;

    public SavingsAccount(int amount) {
        this.amount = amount;
    }

    public boolean pay(int amount) {
        return false;

    }

    public boolean transfer(Account account, int amount) {
        if (this.amount < amount)
            return false;
        if (account.addMoney(amount)) {
            this.amount -= amount;
            return true;
        } else return false;
    }


    public boolean addMoney(int amount) {
        this.amount += amount;
        return true;


    }


}
