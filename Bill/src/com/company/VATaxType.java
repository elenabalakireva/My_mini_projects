package com.company;

public class VATaxType extends TaxType {
    public double amount;
    public VATaxType(double amount) {
        this.amount=amount;
    }
    public void calculateTaxFor(double amount) {
        amount = amount * 0.18;


    }
}
