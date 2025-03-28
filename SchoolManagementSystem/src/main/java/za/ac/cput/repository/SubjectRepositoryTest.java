package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Subject;
import za.ac.cput.factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SubjectRepositoryTest {
    private static ISubjectRepository repository = SubjectRepository.getRepository();
    private Subject subject = SubjectFactory.createSubject("01", "Maths",
            "Problem solving", 10);

    @Test
    @Order(1)
    void a_create() {
        Subject created = repository.create(subject);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    @Order(2)
    void b_read() {
        Subject read = repository.read(subject.getSubjectID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    @Order(3)
    void c_update() {
        Subject newSubject = new Subject.Builder().copy(subject).setSubjectName("Physics").build();
        Subject updated = repository.update(newSubject);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    @Order(4)
    void d_delete() {
        assertTrue(repository.delete(subject.getSubjectID()));
        System.out.println("Success: subject deleted");
    }

    @Test
    @Order(5)
    void e_getAll() {
        System.out.println(repository.getAll());
    }

}

// Sufyaan Rawoot 221075127
