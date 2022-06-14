package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100);
        CreditAccount creditAccount = new CreditAccount(-100);
        CheckingAccount checkingAccount = new CheckingAccount(100);

        creditAccount.transfer(checkingAccount, 5);
        savingsAccount.transfer(creditAccount, 10);
        creditAccount.addMoney(1000);

        System.out.println(savingsAccount.amount);
        System.out.println(creditAccount.amount);
        System.out.println(checkingAccount.amount);
    }
}
