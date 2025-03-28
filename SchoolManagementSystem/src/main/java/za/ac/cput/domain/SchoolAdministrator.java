/*
StudentAdministratorEntity.java
StudentAdministrator model class
Author: Christian Smith(221242597)
March 2025

*/




package za.ac.cput.domain;

import java.util.Date;
import java.util.HashMap;

public class SchoolAdministrator extends Employee{
    public SchoolAdministrator(SchoolAdministratorBuilder schoolAdministratorBuilder) {
        super();
    }

    public static class SchoolAdministratorBuilder {
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


        public SchoolAdministratorBuilder(String empNum, String idNum, String firstName, String lastName, String gender, Date dob, Address address, String emailAddress, String contactNum, Date dateOfEmployment, Date dateOfTermination, String password) {
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



        public SchoolAdministrator build() {
            return new SchoolAdministrator(this);
        }
    }
}


