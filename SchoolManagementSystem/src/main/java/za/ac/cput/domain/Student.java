/*
StudentEntity.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.domain;

import java.util.Date;
import java.util.HashMap;

public class Student {
    private String studentID;
    private String idNum;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private SchoolClass schoolClass;
    private ParentGuardian parentGuardian;
    private HashMap<String, Integer> marks;

    private Student(Builder builder) {
        this.studentID = builder.studentID;
        this.idNum = builder.idNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dob = builder.dob;
        this.schoolClass = builder.schoolClass;
        this.parentGuardian = builder.parentGuardian;
        this.marks = builder.marks;


    }

    public Student getStudentID() {
        return studentID;
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

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public ParentGuardian getParentGuardian() {
        return parentGuardian;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public static class Builder {
        private String studentID;
        private String idNum;
        private String firstName;
        private String lastName;
        private String gender;
        private Date dob;
        private SchoolClass schoolClass;
        private ParentGuardian parentGuardian;
        private HashMap<String, Integer> marks;

        public Builder studentID(String studentID) {
            this.studentID = studentID;
            return this;
        }
        public Builder idNum(String idNum) {
            this.idNum = idNum;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder dob(Date dob) {
            this.dob = dob;
            return this;
        }
        public Builder schoolClass(SchoolClass schoolClass) {
            this.schoolClass = schoolClass;
            return this;
        }
        public Builder parentGuardian(ParentGuardian parentGuardian) {
            this.parentGuardian = parentGuardian;
            return this;
        }
        public Builder marks(HashMap<String, Integer> marks) {
            this.marks = marks;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }


}
