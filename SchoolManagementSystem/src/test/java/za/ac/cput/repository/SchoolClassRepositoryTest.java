package za.ac.cput.repository;
/* SchoolClassRepositoryTest.java
RepositoryTest
Author: Siya Rasmeni(222906073)
Date: 28 March 2025
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SchoolClass;
import za.ac.cput.domain.Subject;
import za.ac.cput.factory.SchoolClassFactory;
import za.ac.cput.factory.SubjectFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolClassRepositoryTest {

    private Subject subject1;
    private Subject subject2;
    private List<Subject> subjectList1;
    private List<Subject> subjectList2;
    private SchoolClass schoolClass1;
    private SchoolClass schoolClass2;
    private ISchoolClassRepository repository;

    @BeforeEach
    void setUp() {
        subject1 = SubjectFactory.createSubject("1L", "ENG", "English", 8);
        subject2 = SubjectFactory.createSubject("2L", "MATH", "Mathematics", 9);

        subjectList1 = new ArrayList<>();
        subjectList2 = new ArrayList<>();

        subjectList1.add(subject1);
        subjectList2.add(subject2);

        schoolClass1 = SchoolClassFactory.build("L1", subjectList1, 9);
        schoolClass2 = SchoolClassFactory.build("L2", subjectList2, 10);

        repository = SchoolClassRepository.getRepository();
    }

    @Test
    void create() {
        SchoolClass created1 = repository.create(schoolClass1);
        assertNotNull(created1);
        assertEquals(schoolClass1.getClassId(), created1.getClassId());
        System.out.println("Created: " + created1);

        SchoolClass created2 = repository.create(schoolClass2);
        assertNotNull(created2);
        assertEquals(schoolClass2.getClassId(), created2.getClassId());
        System.out.println("Created: " + created2);
    }


    @Test
    void read() {
        repository.create(schoolClass1);
        SchoolClass read = repository.read(schoolClass1.getClassId());
        assertNotNull(read);
        assertEquals(schoolClass1.getClassId(), read.getClassId());
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        repository.create(schoolClass1);
        SchoolClass updated = new SchoolClass.SchoolClassBuilder()
                .copy(schoolClass1)
                .setGrade(11)
                .build();
        SchoolClass result = repository.update(updated);
        assertNotNull(result);
        assertEquals(11, result.getGrade());
        System.out.println("Updated: " + result);
    }


    @Test
    void delete() {
        repository.create(schoolClass1);
        boolean success = repository.delete(schoolClass1.getClassId());
        assertTrue(success);
        System.out.println("Deleted: " + schoolClass1.getClassId());
    }

    @Test
    void getAll() {
        repository.create(schoolClass1);
        repository.create(schoolClass2);
        List<SchoolClass> all = repository.getAll();
        assertNotNull(all);
        assertEquals(2, all.size());
        System.out.println("All SchoolClasses: " + all);

    }

}
