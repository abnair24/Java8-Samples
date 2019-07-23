package java8.concurrency;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorSample {

    public static void main(String[] args) {

        sample();
    }

    public static void sample() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            String threadname = Thread.currentThread().getName();
            System.out.println("Hello"+ threadname);
        });

        try {
            System.out.println("Shutting down");
            executorService.shutdown();
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("termination interupted");
        }finally {
            if(!executorService.isTerminated()){
                System.out.println("killing");
            }
            executorService.shutdown();
            System.out.println("shutdown");
        }
    }
}
