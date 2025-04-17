public class DiningPhilosophers {

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        final Object[] forks = new Object[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(i, rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(i, leftFork, rightFork);
            }
            new Thread(philosophers[i], "Философ " + i).start();
        }
    }
    static class Philosopher implements Runnable {
        private int id;
        private final Object firstFork;
        private final Object secondFork;

        Philosopher(int id, Object firstFork, Object secondFork) {
            this.id = id;
            this.firstFork = firstFork;
            this.secondFork = secondFork;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    think();
                    eat();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void think() throws InterruptedException {
            System.out.println("Философ " + id + " думает.");
            Thread.sleep((long) (Math.random() * 3000));
        }

        private void eat() throws InterruptedException {
            synchronized (firstFork) {
                System.out.println("Философ " + id + " взял первую вилку.");
                Thread.sleep(50);
                synchronized (secondFork) {
                    System.out.println("Философ " + id + " взял вторую вилку и ест.");
                    Thread.sleep((long) (Math.random() * 2000));
                    System.out.println("Философ " + id + " поел и положил вилки.");
                }
            }
        }
    }
}