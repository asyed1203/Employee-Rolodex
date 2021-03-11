// CSC 214
// Author: [Syed Ahmed]
// Assignment #8:

import java.util.*;

public class Assignment8
{

    public static void main(String[] args)
    {


        //Used for user input
        Scanner in = new Scanner(System.in);

        boolean done = false;
        //Here is the arrayList, I called it: down below the inputs
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<PayPeriod> payPeriods = new ArrayList<>();
        while(!done) {

            //These are all the inputs I just decided to input start and end date for the sake of it
            PayRollManager man = new PayRollManager();
            System.out.print("Unique generated Employee ID: ");
            int employeeIDDD = man.generateUniqueID(employeeList);
            System.out.println(employeeIDDD);

            System.out.print("Enter Employee First Name: ");
            String firstName = in.next();

            System.out.print("Enter Employee Middle Initial: ");
            String middleInitial = in.next();

            System.out.print("Enter Employee Last Name: ");
            String lastName = in.next();

            System.out.print("Enter Employee House Address: ");
            String houseAddress = in.nextLine();
            houseAddress += in.nextLine();

            System.out.print("Enter Employee House City: ");
            String houseCity = in.nextLine();


            System.out.print("Enter Employee House Zip Code: ");
            String houseZipCode = in.next();

            System.out.print("Enter Employee Email Address: ");
            String emailAddress = in.next();

            System.out.print("Enter Employee Phone Number: ");
            String phoneNumber = in.next();

            System.out.print("Enter # of hours worked this week: ");
            int amountHours = in.nextInt();

            System.out.print("Enter hourly rate of pay: ");
            double payRate = in.nextDouble();

            System.out.print("Enter the Start Date: ");
            String startDate = in.next();

            System.out.print("Enter the End Date: ");
            String endDate = in.next();



            //Used these to call the variables from each class
        /*
        PayRollManager man = new PayRollManager();

        TaxPayment taxPay = new TaxPayment();

        TaxManager taxM = new TaxManager();
        */
            Employee obj = new Employee(employeeIDDD, firstName, lastName, middleInitial, houseAddress, houseCity, houseZipCode, phoneNumber, emailAddress, payRate);

            PayPeriod pay = new PayPeriod(employeeIDDD, 1, startDate, endDate, amountHours);

            employeeList.add(obj);

            payPeriods.add(pay);

            System.out.println("Would you like to enter another employee? (Y/N)");
            in.nextLine();
            String str3 = in.nextLine();
            if (str3.equals("N") || str3.equals("n") || str3.equals("No") || str3.equals("no")) {
                done = true;
            }
        }

        System.out.println("List of Employees and Details: ");


        /*
         *  This is the printing or output section. Everything is displayed, using correct format.
         * Used string.format to get the decimal places in right
         */
        int totalEmpCount = employeeList.size();
        for (int i = 0; i < totalEmpCount; i++) {
            System.out.print("--------------------------------------------");
            System.out.println("\nEmployee ID: " + payPeriods.get(i).getEmployeeIDDD());
            System.out.println("Last Name: " + employeeList.get(i).getLastName() + "        " + "Middle Initial: " + employeeList.get(i).getMiddleInitial() + "        " + "First Name: " + employeeList.get(i).getFirstName());
            System.out.println("Home Address: " + employeeList.get(i).getHouseAddress() + ", " + employeeList.get(i).getHouseCity() + " " + employeeList.get(i).getHouseZipCode());
            System.out.println("Email Address: " + employeeList.get(i).getEmailAddress());
            System.out.println("Phone Number: " + employeeList.get(i).getPhoneNumber());
            PayRollManager man = new PayRollManager();
            TaxPayment taxPay = new TaxPayment();
            TaxManager taxM = new TaxManager();
            man.PrintPayStub(employeeList.get(i), payPeriods.get(i), taxPay, taxM);
        }

        PayRollManager man1 = new PayRollManager();
        man1.displayEmployeeList(employeeList);

    }
}
