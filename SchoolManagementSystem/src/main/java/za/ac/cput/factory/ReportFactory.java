/*
ReportFactory.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.factory;


import za.ac.cput.domain.Report;

import java.util.HashMap;

public class ReportFactory {

    public static Report createReport(HashMap<String, Integer> marks) {
        return new Report.Builder()
                .marks(marks)
                .build();
    }
}