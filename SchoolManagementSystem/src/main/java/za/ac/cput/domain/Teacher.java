package za.ac.cput.domain;

import java.util.Date;
import java.util.HashMap;

public class Teacher extends Employee {
    private String homeroom;
    private HashMap assignedClass;

    public Teacher(TeacherBuilder builder) {
        this.homeroom = builder.homeroom;
        this.assignedClass = builder.assignedClass;
    }

    public String getHomeroom() {
        return this.homeroom;
    }

    public HashMap getAssignedClass() {
     return this.assignedClass;
    }

    public static class TeacherBuilder {
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
        private String homeroom;
        private HashMap assignedClass;

        public TeacherBuilder(String empNum, String idNum, String firstName, String lastName, String gender, Date dob, Address address, String emailAddress, String contactNum, Date dateOfEmployment, Date dateOfTermination, String password, String homeroom, HashMap assignedClass) {
            this.empNum = empNum;
            this.idNum = idNum;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.dob = dob;
            this.address = address;
            this.emailAddress = emailAddress;
            this.contactNum = contactNum;
            this.dateOfEmployment = dateOfEmployment;
            this.dateOfTermination = dateOfTermination;
            this.password = password;
            this.homeroom = homeroom;
            this.assignedClass = assignedClass;
        }

        public void setEmpNum(String empNum) {
            this.empNum = empNum;
        }

        public void setIdNum(String idNum) {
            this.idNum = idNum;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setDob(Date dob) {
            this.dob = dob;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public void setContactNum(String contactNum) {
            this.contactNum = contactNum;
        }

        public void setDateOfEmployment(Date dateOfEmployment) {
            this.dateOfEmployment = dateOfEmployment;
        }

        public void setDateOfTermination(Date dateOfTermination) {
            this.dateOfTermination = dateOfTermination;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setHomeroom(String homeroom) {
            this.homeroom = homeroom;
        }

        public void setAssignedClass(HashMap assignedClass) {
            this.assignedClass = assignedClass;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}
