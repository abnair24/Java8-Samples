package java8.concurrency;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class FutureExecutorSample {

    public static void main(String[] args) {
        try {
            sample();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sample() throws ExecutionException, InterruptedException {

        Callable<Integer>task = () -> {
            try{
                TimeUnit.SECONDS.sleep(2);
                return 1;
            }catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer>future = executorService.submit(task);

        System.out.println("Status: "+future.isDone());

        Integer result = future.get();

        System.out.println(" status : "+future.isDone());
        System.out.println(result);

        executorService.shutdown();
        future.get();

    }
}
