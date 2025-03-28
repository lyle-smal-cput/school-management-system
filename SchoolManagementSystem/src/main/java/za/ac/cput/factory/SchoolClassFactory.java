package za.ac.cput.factory;


import za.ac.cput.domain.SchoolClass;
import za.ac.cput.domain.Subject;

import java.util.List;

public class SchoolClassFactory {
    public static SchoolClass build(String id, List<Subject> subjectChoices, int grade) {
        if (id == null || id.isEmpty() ||
                subjectChoices.isEmpty() || grade <= 0
        ) {
            return null;
        }
        return new SchoolClass.SchoolClassBuilder()
                .setClassId(id)
                .setSubjectChoices(subjectChoices)
                .setGrade(grade)
                .build();
    }
}
