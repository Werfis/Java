public class GuardWorker extends Employee implements Worker {
    private String shift;

    public GuardWorker(String name, String surname, String gender, boolean active, double payment, int experience, String department, String shift) {
        super(name, surname, gender, active, "Guard Worker", payment, experience, department);
        this.shift = shift;
    }

    @Override
    public void work() {
        System.out.println("Защищаю территорию от орков в смену: " + shift);
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}