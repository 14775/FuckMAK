package timer;

import log.Log;

public class TimeControl {

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

		Log.append("\nSimulation Time: " + String.valueOf(secondsPassed) + "Seconds");

	}

	public static boolean getRunning() {
		return running;
	}

	public static long getStartTime() {
		return startTime;
	};
}
