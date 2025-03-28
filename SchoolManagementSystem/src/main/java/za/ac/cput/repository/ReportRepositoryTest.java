package za.ac.cput.repository;
/*
ReportRepository.java
Report model class
Author: Christian Smith(221242597)
March 2025

*/

import za.ac.cput.domain.Report;
import za.ac.cput.factory.ReportFactory;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReportRepositoryTest {

    private static List<Report> reportList = new ArrayList<>();
    private static ReportRepository repository = new ReportRepository(reportList);

    private static Report report1;
    private static Report report2;

    @BeforeAll
    static void setup() {
        // Prepare some sample data for marks
        HashMap<String, Integer> marks1 = new HashMap<>();
        marks1.put("Maths", 85);
        marks1.put("Science", 90);
        report1 = ReportFactory.createReport(marks1);

        HashMap<String, Integer> marks2 = new HashMap<>();
        marks2.put("English", 88);
        marks2.put("History", 92);
        report2 = ReportFactory.createReport(marks2);

        // Add the reports to the repository
        reportList.add(report1);
        reportList.add(report2);
    }

    @Test
    @Order(1)
    void a_create() {
        // Check that reports were added successfully
        assertNotNull(report1);
        assertNotNull(report2);
        assertTrue(reportList.contains(report1));
        assertTrue(reportList.contains(report2));

        System.out.println(report1.toString());
        System.out.println(report2.toString());
    }

    @Test
    @Order(2)
    void b_getAll() {
        // Verify that all reports are retrieved correctly
        List<Report> allReports = repository.getAll();
        assertEquals(2, allReports.size());
        assertTrue(allReports.contains(report1));
        assertTrue(allReports.contains(report2));

        System.out.println("All Reports: " + allReports);
    }

    @Test
    @Order(3)
    void c_checkReportMarks() {
        // Ensure marks are correctly stored and retrieved for a specific report
        assertEquals(85, report1.getMarks().get());
        assertEquals(90, report1.getMarks().get());
        assertEquals(88, report2.getMarks().get());
        assertEquals(92, report2.getMarks().get());
    }

    @Test
    @Order(4)
    void d_updateReport() {
        // Simulate an update to a report (for example, changing the marks)
        HashMap<String, Integer> updatedMarks = new HashMap<>();
        updatedMarks.put("Maths", 90);
        updatedMarks.put("Science", 95);

        Report updatedReport = new Report.Builder().marks(updatedMarks).build();
        reportList.set(reportList.indexOf(report1), updatedReport);

        // Check that the updated report now has the new marks
        assertEquals(90, updatedReport.getMarks().get());
        assertEquals(95, updatedReport.getMarks().get());
        System.out.println(updatedReport.toString());
    }

    @Test
    @Order(5)
    void e_deleteReport() {
        // Simulate deleting a report (e.g., by removing it from the list)
        assertTrue(reportList.remove(report1));
        assertEquals(1, reportList.size());

        // Verify that report1 is deleted
        assertFalse(reportList.contains(report1));
        assertTrue(reportList.contains(report2));

        System.out.println("Report1 deleted successfully.");
    }
}
