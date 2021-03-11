public class PayPeriod {

    private int employeeIDDD;
    private double payPeriodID;
    private String startDate;
    private String endDate;
    private int amountHours;

    public PayPeriod(int iEmployeeIDDD, double iPayPeriod, String iStartDate, String iEndDate, int iAmountHours) {
        employeeIDDD = iEmployeeIDDD;
        payPeriodID = iPayPeriod;
        startDate = iStartDate;
        endDate = iEndDate;
        amountHours = iAmountHours;
    }

    //implemented getter functions for payperiod
    public int getEmployeeIDDD() {
        return employeeIDDD;
    }

    //hard coded pay period to 1
    public double getPayPeriod() {
        return payPeriodID =1;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAmountHours() {
        return amountHours;
    }

    //setter functions
    public void setEmployeeIDDD(int employeeIDDD) {
        this.employeeIDDD = employeeIDDD;
    }

    //set to 1 for pay period
    public void setPayPeriod(double payPeriod) {
        this.payPeriodID = 1;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setAmountHours(int amountHours) {
        this.amountHours = amountHours;
    }

    //to display total regular hrs
    public int calculateRegularHour() {
        if (amountHours <= 40) {
            return amountHours;
        }else{
            return 40;
        }
    }

    //to display overtime hours
    public int calculateOverTimeHour() {
        if (amountHours > 40) {
            return amountHours - 40;
        }else{
            return 0;
        }
    }

}