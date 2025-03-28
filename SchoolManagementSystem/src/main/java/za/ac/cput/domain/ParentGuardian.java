package za.ac.cput.domain;

public class ParentGuardian {
    private String parentID;
    private String idNum;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String address; // must be address type
    private String emailAddress;
    private String contactNum;

    private ParentGuardian() {
    }

    private ParentGuardian(Builder builder) {
        this.parentID = builder.parentID;
        this.idNum = builder.idNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dob = builder.dob;
        this.address = builder.address;
        this.emailAddress = builder.emailAddress;
        this.contactNum = builder.contactNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getParentID() {
        return parentID;
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

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getContactNum() {
        return contactNum;
    }

    @Override
    public String toString() {
        return "ParentGuardian{" +
                "parentID='" + parentID + '\'' +
                ", idNum='" + idNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNum='" + contactNum + '\'' +
                '}';
    }

    public static class Builder {
        private String parentID;
        private String idNum;
        private String firstName;
        private String lastName;
        private String gender;
        private String dob;
        private String address;
        private String emailAddress;
        private String contactNum;

        public Builder setParentID(String parentID) {
            this.parentID = parentID;
            return this;
        }

        public Builder setIdNum(String idNum) {
            this.idNum = idNum;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setContactNum(String contactNum) {
            this.contactNum = contactNum;
            return this;
        }

        public Builder copy(ParentGuardian parentGuardian) {
            this.parentID = parentGuardian.parentID;
            this.idNum = parentGuardian.idNum;
            this.firstName = parentGuardian.firstName;
            this.lastName = parentGuardian.lastName;
            this.gender = parentGuardian.gender;
            this.dob = parentGuardian.dob;
            this.address = parentGuardian.address;
            this.emailAddress = parentGuardian.emailAddress;
            this.contactNum = parentGuardian.contactNum;
            return this;
        }

        public ParentGuardian build() {
            return new ParentGuardian(this);
        }
    }

}

// Sufyaan Rawoot 221075127
