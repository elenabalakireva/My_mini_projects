package com.company;

public class TaxType {
    public String taxType;


    public TaxType (String taxType){
        this.taxType=taxType;
    }


    public void calculateTaxFor(double amount) {
        System.out.format("Уплачен налог в размере %.2f%n", amount);
    }
}


