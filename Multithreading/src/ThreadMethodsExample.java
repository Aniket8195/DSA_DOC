class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                Thread.sleep(3000); // Pauses for 3 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        thread1.start();

        thread1.join(); // Waits for thread1 to finish before proceeding

        Thread thread2 = new Thread(new MyRunnable1());
        thread2.start();

        thread2.join(); // Waits for thread2 to finish before proceeding
        System.out.println("Main thread resumes after thread1 completes");
    }
}
