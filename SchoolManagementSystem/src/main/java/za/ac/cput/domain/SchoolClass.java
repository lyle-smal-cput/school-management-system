package za.ac.cput.domain;


import java.util.List;
import java.util.Objects;

public class SchoolClass {
    private String classId;
    private int grade;
    private List<Subject> subjectChoices;

    public SchoolClass() {

    }

    public SchoolClass(SchoolClassBuilder builder) {
        this.classId = builder.classId;
        this.grade = builder.grade;
        this.subjectChoices = builder.subjectChoices;

    }

    public String getClassId() {
        return classId;
    }

    public int getGrade() {
        return grade;
    }

    public List<Subject> getSubjectChoices() {
        return subjectChoices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolClass that = (SchoolClass) o;
        return grade == that.grade && Objects.equals(classId, that.classId) && Objects.equals(subjectChoices, that.subjectChoices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, grade, subjectChoices);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "classId=" + classId +
                ", grade=" + grade +
                ", subjectChoices=" + subjectChoices +
                '}';
    }

    public static class SchoolClassBuilder {
        private String classId;
        private int grade;
        private List<Subject> subjectChoices;

        public SchoolClassBuilder() {

        }

        public SchoolClassBuilder setClassId(String classId) {
            this.classId = classId;
            return this;
        }

        public SchoolClassBuilder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public SchoolClassBuilder setSubjectChoices(List<Subject> subjectChoices) {
            this.subjectChoices = subjectChoices;
            return this;
        }

        public SchoolClassBuilder copy(SchoolClass src) {
            this.classId = src.classId;
            this.grade = src.grade;
            this.subjectChoices = src.subjectChoices;
            return this;
        }

        public SchoolClass build() {
            return new SchoolClass(this);
        }
    }
}
