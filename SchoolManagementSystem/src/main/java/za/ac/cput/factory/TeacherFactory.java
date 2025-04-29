package za.ac.cput.factory;
/* TeacherFactory.java
Teacher Factory  class
Author: Lyle Jason Smal (223236012)
Date: 28 March 2025
*/

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

import java.util.Date;
import java.util.HashMap;

public class TeacherFactory {
    public static Teacher createTeacher(String empNum, String idNum, String firstName, String lastName, String gender, Date dob, Address address, String emailAddress, String contactNum, Date dateOfEmployment, Date dateOfTermination, String password, String homeroom, HashMap assignedClass) {
        if (Helper.isNullorEmpty(empNum) || Helper.isNullorEmpty(idNum) || Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(gender) || Helper.isNullorEmpty(String.valueOf(dob)) || Helper.isNullorEmpty(address.toString()) || Helper.isNullorEmpty(emailAddress) || Helper.isNullorEmpty(contactNum) || Helper.isNullorEmpty(dateOfEmployment.toString()) || Helper.isNullorEmpty(dateOfTermination.toString()) || Helper.isNullorEmpty(password) || Helper.isNullorEmpty(homeroom)) {
            return null;
        }

        return new Teacher.TeacherBuilder(empNum, idNum, firstName, lastName, gender, dob, address, emailAddress, contactNum, dateOfEmployment, dateOfTermination, password, homeroom, assignedClass).build();
    }
}
