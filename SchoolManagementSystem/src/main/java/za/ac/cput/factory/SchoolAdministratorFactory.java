/*
StudentAdministrator.java
StudentAdministrator model class
Author: Christian Smith(221242597)
March 2025

*/



package za.ac.cput.factory;


import za.ac.cput.domain.Address;
import za.ac.cput.domain.SchoolAdministrator;


import java.util.Date;
import java.util.HashMap;

public class SchoolAdministratorFactory {
    public static SchoolAdministrator createTeacher(String empNum, String idNum, String firstName, String lastName, String gender, Date dob, Address address, String emailAddress, String contactNum, Date dateOfEmployment, Date dateOfTermination, String password) {
        return new SchoolAdministrator.SchoolAdministratorBuilder(empNum,idNum, firstName, lastName,gender, dob, address, emailAddress, contactNum, dateOfEmployment, dateOfTermination, password).build();

}}
