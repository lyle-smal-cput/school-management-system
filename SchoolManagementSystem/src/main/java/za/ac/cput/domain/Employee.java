package za.ac.cput.domain;
/* Employee.java
Employee model class
Author: Lyle Jason Smal (223236012)
Date: 28 March 2025
*/
import java.util.*;

public class Employee {
    private String empNum;
    private String idNum;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private Address address;
    private String emailAddress;
    private String contactNum;
    private Date dateOfEmployment;
    private Date dateOfTermination;
    private String password;

    public String getEmpNum() {
        return empNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getContactNum() {
        return contactNum;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public Date getDateOfTermination() {
        return dateOfTermination;
    }

    public String getPassword() {
        return password;
    }
}
