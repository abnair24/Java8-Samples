package java8.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class BQProducer implements Runnable {

    private BlockingQueue<Integer> numbers;
    private final int value;
    private final int valuePerProducer;

    public BQProducer(BlockingQueue<Integer> numbers, int value, int valuePerProducer) {
        this.numbers = numbers;
        this.value = value;
        this.valuePerProducer = valuePerProducer;
    }

    public void run() {
        try {
            for(int i=0;i<100;i++){

                int x = ThreadLocalRandom.current().nextInt(100);

                numbers.put(x);
            }
            for(int j =0; j<valuePerProducer;j++){
                numbers.put(value);
            }
        } catch (InterruptedException ex) {
            System.out.println("Interrupted producer");
            Thread.currentThread().interrupt();
        }
    }
}
