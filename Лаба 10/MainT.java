import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Student> studentsByAge = new TreeSet<>(new StudentComparator("age"));
        TreeSet<Student> studentsByAverageGrade = new TreeSet<>(new StudentComparator("averageGrade"));
        TreeSet<Student> studentsByScholarship = new TreeSet<>(new StudentComparator("scholarship"));

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Обновить оценку студента");
            System.out.println("4. Обновить стипендию студента");
            System.out.println("5. Обновить посещаемость студента");
            System.out.println("6. Отобразить отсортированный список студентов");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Add student
                    break;
                case 2:
                    // Delete student
                    break;
                case 3:
                    // Update student's grade
                    break;
                case 4:
                    // Update student's scholarship
                    break;
                case 5:
                    // Update student's attendance
                    break;
                case 6:
                    // Display sorted list of students
                    break;
                    }
                    }
                    }
                    }