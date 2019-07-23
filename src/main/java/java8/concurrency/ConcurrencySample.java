package java8.concurrency;

import java.util.concurrent.TimeUnit;

public class ConcurrencySample {

    public static void main(String[] args) {

        Runnable task = () -> {

            try {
                String threadNmae = Thread.currentThread().getName();
                System.out.println("Hello" + threadNmae);
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Hello again "+threadNmae);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done");

    }
}
