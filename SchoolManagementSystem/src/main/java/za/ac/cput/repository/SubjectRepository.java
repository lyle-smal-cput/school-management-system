package za.ac.cput.repository;

import za.ac.cput.domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository implements ISubjectRepository {
    public static SubjectRepository repository = null;
    private List<Subject> subjectList;

    @Override
    public List<Subject> getAll(){
        return null;
    }

    private SubjectRepository(){
        subjectList = new ArrayList<Subject>();
    }

    public static ISubjectRepository getRepository(){
        if(repository == null){
            repository = new SubjectRepository();
        }
        return repository;
    }

    @Override
    public Subject create(Subject subject) {
        boolean success = subjectList.add(subject);
        if(success){
            return subject;
        }
        return null;
    }

    @Override
    public Subject read(String id) {
        for (Subject subject : subjectList) {
            if (subject.getSubjectID().equals(id))
                return subject;
        }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        String id = subject.getSubjectID();
        Subject subjectOld = read(id);
        if (subjectOld == null)
            return null;

        boolean success = delete(id);
        if(success){
            if (subjectList.add(subject))
                return subject;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Subject subjectToDelete = read(id);
        if(subjectToDelete == null)
            return false;
        return subjectList.remove(subjectToDelete);
    }
}

// Sufyaan Rawoot 221075127

