package timer;

public class TimerController {

	private static long secondsPassed = 0;

	private static long startTime = 0;

	private static long stopTime = 0;

	private static boolean running = false;

	public static void startTimer() {
		running = true;
		startTime = System.currentTimeMillis();

	}

	public static void stopTimer() {

		stopTime = System.currentTimeMillis();

		secondsPassed = (stopTime - startTime) / 1000; // change milliseconds to seconds

		// TODO Logger adden

		System.out.println(secondsPassed);

	}

	public static boolean getRunning() {
		return running;
	}

}
