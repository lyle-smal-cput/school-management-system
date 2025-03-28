package za.ac.cput.factory;

import za.ac.cput.domain.ParentGuardian;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParentGuardianFactoryTest {
    private static ParentGuardian p1 = ParentGuardianFactory.createParentGuardian("0147","789456","",
            "","M","","","","");

    private static ParentGuardian p2 = ParentGuardianFactory.createParentGuardian("10", "1230",
            "suf", "raw", "M", "02/03", "5 Everest", "suf@",
            "0790");

    @Test
    public void testCreateParentGuardian() {
        assertNotNull(p1);
        System.out.println(p1.toString());
    }

    @Test
    public void testCreateParentGuardianWithAllAttributes() {
        assertNotNull(p2);
        System.out.println(p2.toString());
    }

}

// Sufyaan Rawoot 221075127
