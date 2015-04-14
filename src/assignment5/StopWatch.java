package assignment5;

public class StopWatch {
	private static long totalTimeMillis;
	private static long totalTimeNanos;
	private static long startTimeMillis;
	private static long startTimeNanos;

	StopWatch(){
		totalTimeMillis = 0;
		totalTimeNanos = 0;
		startTimeNanos = 0;
		startTimeMillis = 0;
	}
	public void start(){
		startTimeMillis = System.currentTimeMillis();
		startTimeNanos = System.nanoTime();
	}
	public void stop(){
		totalTimeMillis = totalTimeMillis + (System.currentTimeMillis() - startTimeMillis);
		totalTimeNanos = totalTimeNanos + (System.nanoTime() - startTimeNanos);
		startTimeNanos = 0;
		startTimeMillis = 0;
		//System.out.println("nano: " + totalTimeNanos + " seconds: " + totalTimeMillis / 1000);
	}
	public long getNano(){
		return totalTimeNanos;
	}
	public long getMillis(){
		return totalTimeMillis;
	}

}
