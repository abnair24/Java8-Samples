package java8.blockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BQConsumer implements Runnable {

    private BlockingQueue<Integer> queue;
    private final int value;

    public BQConsumer(BlockingQueue<Integer> queue, int value) {
        this.queue = queue;
        this.value = value;
    }

    public void run() {
        try {

            while(true) {
                Integer number = queue.take();
                if(number.equals(value)) {
                    return;
                }
                System.out.println(Thread.currentThread().getName()+"result: "+number);
            }
        }catch (InterruptedException ex){
            System.out.println("Interrupted consumer");
            Thread.currentThread().interrupt();
        }
    }
}
