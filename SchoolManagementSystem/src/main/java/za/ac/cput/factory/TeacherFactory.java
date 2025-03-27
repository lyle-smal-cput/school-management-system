package za.ac.cput.factory;

import za.ac.cput.domain.*;

import java.util.Date;

public class TeacherFactory {
    public static Teacher createTeacher(String empNum, String idNum, String firstName, String lastName, String gender, Date dob, Address address, String emailAddress, String contactNum, Date dateOfEmployment, Date dateOfTermination, String password) {
        return new Teacher.TeacherBuilder(empNum, idNum, firstName, lastName, gender, dob, address, emailAddress, contactNum, dateOfEmployment, dateOfTermination, password, homeroom, assignedClass).build();
    }
}
