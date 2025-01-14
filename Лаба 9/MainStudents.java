import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(15);
        
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 15; i++) {
                group.addStudent();
            }
            
            Student newStudent = new Student(20, "Мужской", "Имя", "Фамилия", "Отчество", 1, 4.5);
            group.addStudent(newStudent);
            
            Student student = group.getStudent(0);
            System.out.println("Студент: " + student.getFirstName() + " " + student.getLastName() + ", Возраст: " + student.getAge());
            
            group.removeStudent(0);
            
            System.out.println("Количество студентов в группе: " + group.getCount());
        } catch (NotCorrectAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalStateException | IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        scanner.close();
    }
}