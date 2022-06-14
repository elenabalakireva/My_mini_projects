/*package com.company;

class TaxService {
    public TaxType[] tax;
    public TaxService() {
        tax = new TaxType[] {
                new IncomeTaxType(),
                new VATaxType(),
                new ProgressiveTaxType()
        };
    }
    public void payOut(double taxAmount) {
        TaxType taxType = tax [1];
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
       taxType.calculateTaxFor();
    }
}*/
