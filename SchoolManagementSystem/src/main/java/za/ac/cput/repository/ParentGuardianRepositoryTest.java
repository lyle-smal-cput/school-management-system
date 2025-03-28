package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ParentGuardian;
import za.ac.cput.factory.ParentGuardianFactory;

import static org.junit.jupiter.api.Assertions.*;

class ParentGuardianRepositoryTest {
    private static IParentGuardianRepository repository = ParentGuardianRepository.getRepository();
    private ParentGuardian parentGuardian = ParentGuardianFactory.createParentGuardian("01", "123",
            "suf", "raw", "M", "02/03", "5 everest", "suf@",
            "0795003139");

    @Test
    @Order(1)
    void a_create() {
        ParentGuardian created = repository.create(parentGuardian);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    @Order(2)
    void b_read() {
        ParentGuardian read = repository.read(parentGuardian.getParentID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    @Order(3)
    void c_update() {
        ParentGuardian newParentGuardian = new ParentGuardian.Builder().copy(parentGuardian).setFirstName("New Person").build();
        ParentGuardian updated = repository.update(newParentGuardian);
        assertNotNull(updated);
        System.out.println(updated.toString()   );
    }

    @Test
    @Disabled
    @Order(4)
    void d_delete() {
        assertTrue(repository.delete(parentGuardian.getParentID()));
        System.out.println("Success: parent deleted");
    }

    @Test
    @Order(5)
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}

// Sufyaan Rawoot 221075127
