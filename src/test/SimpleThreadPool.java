package test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleThreadPool {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =
		Executors.newScheduledThreadPool(7);
		
		scheduledExecutorService.scheduleWithFixedDelay(new WorkerThread(""+100), 1, 2, TimeUnit.SECONDS);
		System.out.println("Finished all threads");
	}
}