public interface Worker {
    default void work() {
        System.out.println("Я Каменщик Работаю Три Дня...");
    }
}