package timer;

import java.util.concurrent.TimeUnit;

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

		secondsPassed = (stopTime - startTime); // change milliseconds to seconds

		String hoursminutesseconds = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(secondsPassed),
				TimeUnit.MILLISECONDS.toMinutes(secondsPassed)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(secondsPassed)),
				TimeUnit.MILLISECONDS.toSeconds(secondsPassed)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(secondsPassed)));

		Log.append("\nSimulation Time: " + String.valueOf(hoursminutesseconds));

	}

	public static boolean getRunning() {
		return running;
	}

	public static long getStartTime() {
		return startTime;
	};
}
