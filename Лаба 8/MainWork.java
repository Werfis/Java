public class Main {
    public static void main(String[] args) {
        KitchenWorker kitchenWorker = new KitchenWorker("Сома", "Юкихира", "Мужской", true, 30000.0, 5, "Кухня", "Повар");
        OfficeWorker officeWorker = new OfficeWorker("Асуна", "Юки", "Женский", true, 50000.0, 3, "Офис", "Проект САО");
        GuardWorker guardWorker = new GuardWorker("Аезэлверд", "Зигвард", "Мужской", true, 25000.0, 2, "Охрана", "Ночная");

        kitchenWorker.work();
        officeWorker.work();
        guardWorker.work();

        kitchenWorker.sleep();
        officeWorker.sleep();
        guardWorker.sleep();
    }
}