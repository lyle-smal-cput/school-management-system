package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TeacherFactoryTest {
    Teacher teacher;

    @Test
    void createTeacher() {
        teacher = TeacherFactory.createTeacher("123", "", "", "", "", new Date(), new Address(), "", "", new Date(), new Date(), "");
        assertNotNull(teacher);
    }
}