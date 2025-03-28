package za.ac.cput.factory;

import za.ac.cput.domain.Subject;
import za.ac.cput.util.Helper;

public class SubjectFactory {
    public static Subject createSubject(String subjectID, String subjectName, String subjectDescription, int grade) {
        if (Helper.isNullorEmpty(subjectID) || Helper.isNullorEmpty(subjectName) || Helper.isNullorEmpty(subjectDescription))
            return null;

        return new Subject.Builder().setSubjectID(subjectID).setSubjectName(subjectName)
                .setSubjectDescription(subjectDescription).setGrade(grade).build();
    }

}

// Sufyaan Rawoot 221075127
