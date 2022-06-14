package com.company;

class Bill {
    private double amount;
    private TaxType taxType;

    public Bill(double amount, TaxType taxType) {
        this.amount = amount;
        this.taxType = taxType;
    }

        public void payTaxes () {
            System.out.format("Уплачен налог в размере %.2f%n", amount);
            taxType.calculateTaxFor(amount);
        }
    }




