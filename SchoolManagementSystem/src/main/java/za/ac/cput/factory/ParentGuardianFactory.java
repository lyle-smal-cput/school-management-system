package za.ac.cput.factory;

import za.ac.cput.domain.ParentGuardian;
import za.ac.cput.util.Helper;

public class ParentGuardianFactory {

    public static ParentGuardian createParentGuardian(String parentID, String idNum, String firstName, String lastName, String gender, String dob, String address, String emailAddress, String contactNum) {
        if (Helper.isNullorEmpty(parentID) || Helper.isNullorEmpty(idNum) || Helper.isNullorEmpty(firstName) ||
                Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(gender) || Helper.isNullorEmpty(dob) ||
                Helper.isNullorEmpty(address) || Helper.isNullorEmpty(emailAddress) || Helper.isNullorEmpty(contactNum))
            return null;

        return new ParentGuardian.Builder().setParentID(parentID).setIdNum(idNum).setFirstName(firstName).
                setLastName(lastName).setGender(gender).setDob(dob).setAddress(address).setEmailAddress(emailAddress)
                .setContactNum(contactNum).build();
    }
}

// Sufyaan Rawoot 221075127
