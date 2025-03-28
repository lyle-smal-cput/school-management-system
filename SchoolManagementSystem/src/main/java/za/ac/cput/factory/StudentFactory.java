package za.ac.cput.factory;

/*
StudentFactory.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/



import za.ac.cput.domain.Student;

import java.util.Date;
import java.util.HashMap;

public class StudentFactory {
    public static Student createStudent(String studentID, String idNum, String firstName, String lastName,
                                        String gender, Date dob, SchoolClass schoolClass,
                                        ParentGuardian parentGuardian, HashMap<String, Integer> marks) {
        return new Student.Builder()
                .studentID(studentID)
                .idNum(idNum)
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .dob(dob)
                .schoolClass(schoolClass)
                .parentGuardian(parentGuardian)
                .marks(marks)
                .build();
    }
}