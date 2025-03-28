package za.ac.cput.factory;
/*
ReportRepository.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Report;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class ReportFactoryTest {

    @Test
    void testCreateReport() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", 85);
        marks.put("Science", 90);

        Report report = ReportFactory.createReport(marks);

        assertNotNull(report);
        assertEquals(2, report.getMarks().set());
        assertEquals(85, report.getMarks().get());
        assertEquals(90, report.getMarks().get());

        System.out.println(report);
    }
}
