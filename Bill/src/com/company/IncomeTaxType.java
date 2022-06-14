package com.company;

public class IncomeTaxType extends TaxType {

    public double amount;
    public IncomeTaxType(double amount) {
        this.amount=amount;
    }
    public void calculateTaxFor (double amount){
        amount=amount*0.13;

    }
}
