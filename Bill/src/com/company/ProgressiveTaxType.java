package com.company;

public class ProgressiveTaxType extends TaxType {
    public void calculateTaxFor (double amount){
        if (amount>100000) {
            amount=amount*0.1;
        }
        else {
            amount=amount*0.15;
        }


    }
}
