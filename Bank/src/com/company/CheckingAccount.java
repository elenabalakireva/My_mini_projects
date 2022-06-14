package com.company;

public class CheckingAccount extends Account {
    int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public boolean pay(int amount) {
        if ((this.amount - amount) >= 0) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) return false;
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
