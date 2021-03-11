import java.util.ArrayList;
import java.util.Scanner;

public class Employee  {

    //variables
    private int employeeID;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String houseAddress;
    private String houseCity;
    private String houseZipCode;
    private String phoneNumber;
    private String emailAddress;
    private double payRate;



    //Constructors
    public Employee(int iEmployeeID, String iFirstName, String iLastName, String iMiddleInitial, String iHouseAddress, String ihouseCity,
                    String iHouseZipCode , String iPhoneNumber ,String iEmailAddress,double iPayRate) {

        employeeID = iEmployeeID;
        firstName = iFirstName;
        lastName = iLastName;
        middleInitial = iMiddleInitial;
        houseAddress = iHouseAddress;
        houseCity = ihouseCity;
        houseZipCode = iHouseZipCode;
        phoneNumber = iPhoneNumber;
        emailAddress = iEmailAddress;
        payRate = iPayRate;



    }

    //Getter functions
    //employee ID in the employee class to 1 (hard-coded)
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public String getHouseCity() {
        return houseCity;
    }

    public String getHouseZipCode() {
        return houseZipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getPayRate() {
        return payRate;
    }


    //Setter functions
    //set employee ID in the employee class to 1 (hard-coded)
    public void setEmployeeID(int newEmployeeID) {
        this.employeeID = newEmployeeID;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setMiddleInitial(String newMiddleInitial) {
        this.middleInitial = newMiddleInitial;
    }

    public void setHouseAddress(String newHouseAddress) {
        this.houseAddress = newHouseAddress;
    }

    public void setHouseCity(String newHouseCity) {
        this.houseCity = newHouseCity;
    }

    public void setHouseZipCode(String newHouseZipCode) {
        this.houseZipCode = newHouseZipCode;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void setEmailAddress(String newEmailAddress) {
        this.emailAddress = newEmailAddress;
    }

    public void setPayRate(double newPayRate) {
        this.payRate = newPayRate;
    }

    public double overPayRate() {
        return payRate * 1.5;
    }


}
