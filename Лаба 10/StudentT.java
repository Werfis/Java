import java.util.Objects;

public class Student {
    private int age;
    private double averageGrade;
    private String firstName;
    private String lastName;
    private String patronymic;
    private double scholarship;
    private int attendedClasses;
    private int missedClasses;
    private String gender;

    public Student(int age, double averageGrade, String firstName, String lastName, String patronymic, double scholarship, int attendedClasses, int missedClasses, String gender) throws IllegalArgumentException {
        if (firstName.equals("Алексей") && lastName.equals("Белоусов") && patronymic.equals("Юрьевич")) {
            throw new IllegalArgumentException("Такой студент не может существовать: Белоусов Алексей Юрьевич.");
        }
        this.age = age;
        this.averageGrade = averageGrade;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.scholarship = scholarship;
        this.attendedClasses = attendedClasses;
        this.missedClasses = missedClasses;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public void addAttendedClass() {
        this.attendedClasses++;
    }

    public int getMissedClasses() {
        return missedClasses;
    }

    public void addMissedClass() {
        this.missedClasses++;
    }

    public String getGender() {
        return gender;
    }

    public double getAttendancePercentage() {
        int totalClasses = attendedClasses + missedClasses;
        return totalClasses == 0 ? 0 : (double) attendedClasses / totalClasses * 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Возраст: %d, Средняя оценка: %.2f, Стипендия: %.2f, Посещаемость: %.2f%%",
                lastName, firstName, patronymic, age, averageGrade, scholarship, getAttendancePercentage());
    }
}