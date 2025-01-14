public class OfficeWorker extends Employee implements Worker {
    private String project;

    public OfficeWorker(String name, String surname, String gender, boolean active, double payment, int experience, String department, String project) {
        super(name, surname, gender, active, "Office Worker", payment, experience, department);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Работаю над проектом: " + project);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}