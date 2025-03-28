package za.ac.cput.repository;

import za.ac.cput.domain.Report;

import java.util.Set;

public interface IReport extends IRepository {
    Set<Report> getAll();



}
