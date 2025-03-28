/*
Report.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.repository;

import za.ac.cput.domain.Report;

import java.util.List;


public interface IReport extends IRepository<String,Report> {
    List<Report> getAll();



}
