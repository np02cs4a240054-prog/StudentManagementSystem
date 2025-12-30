package Reports;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ReportDAO reportDAO = new ReportDAO();

        // Generate report for student with ID 1
        StudentReport student1 = reportDAO.generateStudentReport(1);
        System.out.println("Report for Student 1:");
        System.out.println(student1);
        System.out.println("Total Marks: " + student1.getTotalMarks());
        System.out.println("Average Marks: " + student1.getAverageMarks());
        System.out.println();

        // Generate report for student with ID 2
        StudentReport student2 = reportDAO.generateStudentReport(2);
        System.out.println("Report for Student 2:");
        System.out.println(student2);
        System.out.println("Total Marks: " + student2.getTotalMarks());
        System.out.println("Average Marks: " + student2.getAverageMarks());
        System.out.println();

        // Get defaulter list (attendance < 75%)
        double minAttendance = 75.0;
        List<StudentReport> defaulters = reportDAO.getDefaulterList(minAttendance);
        System.out.println("Students with attendance below " + minAttendance + "%:");
        for (StudentReport sr : defaulters) {
            System.out.println("Student ID: " + sr.getStudentId() + " Attendance: " + sr.getAttendancePercentage());
        }
    }
}