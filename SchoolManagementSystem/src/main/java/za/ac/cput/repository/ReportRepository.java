/*
ReportRepository.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.repository;

import za.ac.cput.domain.Report;
import java.util.List;

public class ReportRepository {

    private List<Report> reportList;

    public ReportRepository(List<Report> reportList) {
        this.reportList = reportList;
    }

}