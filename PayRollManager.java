import java.util.*;
public class PayRollManager  {

    //used to calculate the the amount without overtime
    public double CalculateRegularPay(Employee obj, PayPeriod pay) {
        double rHour = 0.0;
        if (pay.getAmountHours() <= 40) {
            rHour = pay.getAmountHours();
            double rPay = rHour * obj.getPayRate();
            return pay.getAmountHours() * obj.getPayRate();
        }else{
            rHour = 40.00;
            return rHour * obj.getPayRate();
        }
    }


    //used to calculate the total amount for only overtime
    public double CalculateOvertimePay(Employee obj, PayPeriod pay){
        if (pay.getAmountHours() > 40) {
            double oHour = pay.getAmountHours() - 40;
            return oHour * obj.getPayRate() * 1.5;
        }else{
            return 0.0;
        }
    }

    //Add both regular time and overtime to get the total gross amount
    public double grossTotalAmount(Employee obj,PayPeriod pay){
        return CalculateRegularPay(obj, pay) + CalculateOvertimePay(obj, pay);
    }

    //put all pay stub info in here and called it in the assignment 5 class
    public void PrintPayStub(Employee obj, PayPeriod pay, TaxPayment taxPay, TaxManager taxM) {
        PayRollManager man = new PayRollManager();
        System.out.printf("Hours Worked: " + pay.getAmountHours() + "        " + "Hourly Rate: $%.2f %n" ,obj.getPayRate());
        System.out.print("Regular Pay: " + pay.calculateRegularHour() + " hours at " + "$" + String.format("%.2f", obj.getPayRate()) + "/hr: ");
        System.out.println("$" + String.format("%.2f", CalculateRegularPay(obj, pay)));
        System.out.println("Overtime Pay: " + pay.calculateOverTimeHour() + " hours at " + "$" + String.format("%.2f", obj.overPayRate()) + "/hr: " + "$" +String.format("%.2f", CalculateOvertimePay(obj, pay)));
        System.out.printf("Gross Total: $%.2f %n", grossTotalAmount(obj, pay));
        double grossTotal = grossTotalAmount(obj, pay);
        //Tax is displayed here with the calculation of the next paycheck
        taxM.ComputeTaxPayment(grossTotal, taxPay, obj, pay);

    }

    public void displayEmployeeList(ArrayList<Employee> employeeList){
        System.out.println("Employee List");
        System.out.println("Id\tName");
        for(Employee emp : employeeList){
            System.out.println(emp.getEmployeeID() + "\t" + emp.getFirstName() + " " + emp.getLastName());
        }
    }

    public int generateUniqueID(ArrayList<Employee> employeeList){
        Random rand = new Random();
        int randInt = 0;
        boolean done = false;
        while(!done){
            done = true;
            //randInt = rand.nextInt(10000) + 1;
            randInt = rand.nextInt(999999);
            for(Employee emp : employeeList){
                if(emp.getEmployeeID() == randInt){
                    done = false;
                    break;
                }
            }
        }
        return randInt;
    }

}