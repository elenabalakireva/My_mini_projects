package com.company;

public class Main {

    public static void main(String[] args) {

       TaxType taxType = new TaxType();

        Bill[] payments = new Bill[3];
        payments [0] = new Bill (20000, "IncomeTaxType");
        payments [1] = new Bill (500, "VATaxType");
        payments [2] = new Bill (1000000, "ProgressiveTaxType");

        }

        }


