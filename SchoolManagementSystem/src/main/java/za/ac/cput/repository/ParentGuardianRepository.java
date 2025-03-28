package za.ac.cput.repository;

import za.ac.cput.domain.ParentGuardian;

import java.util.ArrayList;
import java.util.List;

public class ParentGuardianRepository implements IParentGuardianRepository {
    public static IParentGuardianRepository repository = null;
    private List<ParentGuardian> parentGuardianList;

    @Override
    public List<ParentGuardian> getAll(){
        return null;
    }

    private ParentGuardianRepository(){
        parentGuardianList = new ArrayList<ParentGuardian>();
    }

    public static IParentGuardianRepository getRepository(){
        if(repository == null){
            repository = new ParentGuardianRepository();
        }
        return repository;
    }

    @Override
    public ParentGuardian create(ParentGuardian parentGuardian) {
        boolean success = parentGuardianList.add(parentGuardian);
        if(success){
            return parentGuardian;
        }
        return null;
    }

    @Override
    public ParentGuardian read(String id) {
        for (ParentGuardian parentGuardian : parentGuardianList) {
            if (parentGuardian.getParentID().equals(id))
                return parentGuardian;
        }
        return null;
    }

    @Override
    public ParentGuardian update(ParentGuardian parentGuardian) {
        String id = parentGuardian.getParentID();
        ParentGuardian parentGuardianOld = read(id);
        if (parentGuardianOld == null)
            return null;

        boolean success = delete(id);
        if(success){
            if (parentGuardianList.add(parentGuardian))
                return parentGuardian;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        ParentGuardian parentGuardianToDelete = read(id);
        if(parentGuardianToDelete == null)
            return false;
        return parentGuardianList.remove(parentGuardianToDelete);
    }

}

// Sufyaan Rawoot 221075127
