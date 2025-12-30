package Reports;

import java.util.List;

public class StudentReport {

    private int studentId;
    private List<String> subjects;
    private List<Integer> marks;
    private double attendancePercentage;

    // Constructor
    public StudentReport(int studentId, List<String> subjects, List<Integer> marks, double attendancePercentage) {
        this.studentId = studentId;
        this.subjects = subjects;
        this.marks = marks;
        this.attendancePercentage = attendancePercentage;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    // Calculate total marks
    public int getTotalMarks() {
        return marks.stream().mapToInt(Integer::intValue).sum();
    }

    // Calculate average marks
    public double getAverageMarks() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return "StudentReport{" +
                "studentId=" + studentId +
                ", subjects=" + subjects +
                ", marks=" + marks +
                ", attendancePercentage=" + attendancePercentage +
                '}';
    }
}