package CONCURRENCY;

import java.util.Date;
import java.util.concurrent.*;

public class ScheduledDelay {

    public static void main(String[] args) {
        ScheduledExecutorService service=null;
        int count=0;
        try{
            System.out.println("Begin");
            service= Executors.newSingleThreadScheduledExecutor();
            ScheduledFuture<?> scheduledFuture = service.scheduleWithFixedDelay(() -> {

                System.out.println(new Date());

            }, 0, 5, TimeUnit.SECONDS);
            scheduledFuture.cancel(true);




            System.out.println("End");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
