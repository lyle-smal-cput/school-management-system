package za.ac.cput.domain;

public class Subject {
    private String subjectID;
    private String subjectName;
    private String subjectDescription;
    private int grade;

    private Subject() {
    }

    private Subject(Builder builder){
        this.subjectID = builder.subjectID;
        this.subjectName = builder.subjectName;
        this.subjectDescription = builder.subjectDescription;
        this.grade = builder.grade;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static class Builder{
        private String subjectID;
        private String subjectName;
        private String subjectDescription;
        private int grade;

        public Builder setSubjectID(String subjectID){
            this.subjectID = subjectID;
            return this;
        }

        public Builder setSubjectName(String subjectName){
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectDescription(String subjectDescription){
            this.subjectDescription = subjectDescription;
            return this;
        }

        public Builder setGrade(int grade){
            this.grade = grade;
            return this;
        }

        public Builder copy(Subject subject){
            this.subjectID = subject.subjectID;
            this.subjectName = subject.subjectName;
            this.subjectDescription = subject.subjectDescription;
            this.grade = subject.grade;
            return this;
        }

        public Subject build(){
            return new Subject(this);

        }
    }
}

// Sufyaan Rawoot 221075127
