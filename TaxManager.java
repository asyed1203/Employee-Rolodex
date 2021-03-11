public class TaxManager {
    public void ComputeTaxPayment (double grossPay, TaxPayment taxRates, Employee obj, PayPeriod pay) {
        if (grossPay <= 0 || pay.getAmountHours() <= 0) {
            //used logic to check for 0 hrs or 0 dollars
            System.out.println("No Hours Worked, So No Taxes Cut");

        } else {
            //All calculations are displayed here
            double f = grossPay * (taxRates.getFederalTax()/100.00);
            double s = grossPay * (taxRates.getStateTax()/100.00);
            double fi = grossPay * (taxRates.getFicaTax()/100.00);
            System.out.println("-------------------------------------------");
            System.out.println("Taxes:");
            System.out.printf("Federal Tax: $%.2f %n", f);
            System.out.printf("State Tax: $%.2f %n", s);
            System.out.printf("Fica Tax: $%.2f %n", fi);
            double totalTax = (f + s + fi);
            System.out.println("-------------------------------------------");
            System.out.printf("Net Paycheck: $%.2f %n", (grossPay - totalTax));

        }

    }
}
