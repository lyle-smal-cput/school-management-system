/*
ReportEntity.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/



package za.ac.cput.domain;

import java.util.HashMap;

public class Report {
    private HashMap<String, Integer> marks;

    private Report(Builder builder) {
        this.marks = builder.marks;
    }

    public ThreadLocal<Object> getMarks() {
        return null;
    }

    public static class Builder {
        private HashMap<String, Integer> marks;

        public Builder marks(HashMap<String, Integer> marks) {
            this.marks = marks;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}