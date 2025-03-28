package za.ac.cput.factory;
/* TeacherFactoryTest.java
Teacher Factory  test class
Author: Lyle Jason Smal (223236012)
Date: 28 March 2025
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Teacher;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
class TeacherFactoryTest {
    Teacher teacher;
    @Test
    void createTeacher() {
        teacher=TeacherFactory.createTeacher("223236012","123456789","Lyle","Smal","Male",new Date(), new Address(),"lylesmal@gmail.com","0123456789",null,null,"password","3J",new HashMap<>());
        assertNotNull(teacher);
    }
}