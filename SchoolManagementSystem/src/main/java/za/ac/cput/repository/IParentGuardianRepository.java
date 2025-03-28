package za.ac.cput.repository;

import za.ac.cput.domain.ParentGuardian;

import java.util.List;

public interface IParentGuardianRepository extends IRepository<ParentGuardian, String>{
    List<ParentGuardian> getAll();

}

// Sufyaan Rawoot 221075127

