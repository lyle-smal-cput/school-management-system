/*
SchoolAdministrator.java
SchoolAdministrator model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.repository;

import za.ac.cput.domain.SchoolAdministrator;

import java.util.List;
import java.util.Set;

public interface ISchoolAdministrator extends IRepository<String, SchoolAdministrator> {
    List<SchoolAdministrator> getAll();
}