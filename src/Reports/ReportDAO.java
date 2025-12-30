package Reports;

import java.util.*;

public class ReportDAO {

    private Map<Integer, StudentReport> studentData;

    public ReportDAO() {
        studentData = new HashMap<>();

        // Sample data
        studentData.put(1, new StudentReport(1,
                Arrays.asList("Math", "Science", "English"),
                Arrays.asList(80, 90, 85),
                92.5));

        studentData.put(2, new StudentReport(2,
                Arrays.asList("Math", "Science", "English"),
                Arrays.asList(60, 70, 65),
                68.0));
    }

    // Generate report for a specific student
    public StudentReport generateStudentReport(int studentId) {
        return studentData.get(studentId);
    }

    // Get students below minimum attendance
    public List<StudentReport> getDefaulterList(double minAttendance) {
        List<StudentReport> defaulters = new ArrayList<>();
        for (StudentReport sr : studentData.values()) {
            if (sr.getAttendancePercentage() < minAttendance) {
                defaulters.add(sr);
            }
        }
        return defaulters;
    }
}