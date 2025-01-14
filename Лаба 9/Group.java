import java.util.Scanner;

public class Group {
    private Student[] students;
    private int count;

    public Group(int maxSize) {
        students = new Student[maxSize];
        count = 0;
    }

    public void addStudent() throws NotCorrectAgeException {
        if (count >= students.length) {
            throw new IllegalStateException("Группа слишком большая. Нельзя добавить больше студентов. Как вариант вы можете попросить финансирование для нас чтобы группы были больше.");
        }

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Введите возраст: ");
        student.setAge(scanner.nextInt());

        System.out.print("Введите пол: ");
        student.setGender(scanner.next());

        System.out.print("Введите имя: ");
        student.setFirstName(scanner.next());

        System.out.print("Введите фамилию: ");
        student.setLastName(scanner.next());

        System.out.print("Введите отчество: ");
        student.setPatronymic(scanner.next());

        System.out.print("Введите курс: ");
        student.setCourse(scanner.nextInt());

        System.out.print("Введите средний балл: ");
        student.setAverageGrade(scanner.nextDouble());

        students[count++] = student;
    }

    public void addStudent(Student student) throws IllegalStateException {
        if (count >= students.length) {
            throw new IllegalStateException("Группа слишком большая. Нельзя добавить больше студентов. Как вариант вы можете попросить финансирование для нас чтобы группы были больше.");
        }
        
        students[count++] = student;
    }

    public void removeStudent(int index) throws IllegalStateException, IndexOutOfBoundsException {
        if (count <= 3) {
            throw new IllegalStateException("Нельзя удалить студента, если после удаления в группе останется меньше 3 студентов.");
        }

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Неверный индекс студента.");
        }

        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        
        students[--count] = null;
    }

    public Student getStudent(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Неверный индекс студента.");
        }
        
        return students[index];
    }

    public int getCount() {
        return count;
    }