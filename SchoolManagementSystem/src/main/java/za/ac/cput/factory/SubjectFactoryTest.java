package za.ac.cput.factory;

import za.ac.cput.domain.Subject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {
    Subject s1 = SubjectFactory.createSubject("01","math","", 5);
    Subject s2 = SubjectFactory.createSubject("01","math","problem solving", 5);

    @Test
    public void testCreateSubject() {
        assertNotNull(s1);
        System.out.println(s1.toString());
    }

    @Test
    public void testCreateSubjectWithAllAttributes() {
        assertNotNull(s2);
        System.out.println(s2.toString());
    }
}

// Sufyaan Rawoot 221075127
