public class TaxPayment {

    private double federalTax;
    private double stateTax;
    private double ficaTax;

    public TaxPayment() {
        //I put the tax rates here for storage
        this.federalTax = 15;
        this.stateTax = 5;
        this.ficaTax = 3;

    }


    public TaxPayment(double fTax, double sTax, double fiTax){
        federalTax = fTax;
        stateTax = sTax;
        ficaTax = fiTax;
    }


    public double getFederalTax () {
        return federalTax;
    }

    public double getStateTax (){
        return stateTax;
    }

    public double getFicaTax () {
        return ficaTax;
    }


    public void setFederalTax(double newFederalTax){
        this.federalTax = newFederalTax;
    }

    public void setStateTax(double newStateTax){
        this.stateTax = newStateTax;
    }

    public void setFicaTax(double newFicaTax){
        this.ficaTax = newFicaTax;
    }
}

