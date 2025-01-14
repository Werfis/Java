public class KitchenWorker extends Employee implements Worker {
    private String specialty;

    public KitchenWorker(String name, String surname, String gender, boolean active, double payment, int experience, String department, String specialty) {
        super(name, surname, gender, active, "Kitchen Worker", payment, experience, department);
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("Готовлю еду без маминой помощи...");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}