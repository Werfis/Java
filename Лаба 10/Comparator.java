import java.util.Comparator;

public class StudentComparators {
    public static Comparator<Student> byAverageGrade() {
        return Comparator.comparingDouble(Student::getAverageGrade);
    }

    public static Comparator<Student> byScholarship() {
        return Comparator.comparingDouble(Student::getScholarship);
    }

    public static Comparator<Student> byAge() {
        return Comparator.comparingInt(Student::getAge);
    }

    public static Comparator<Student> byAttendancePercentage() {
        return Comparator.comparingDouble(Student::getAttendancePercentage);
    }
}