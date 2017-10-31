package timer;

import java.util.concurrent.TimeUnit;

import log.Log;

public class TimeControl {

	/*
	 * declare all needed variables
	 */

	private static long secondsPassed = 0;

	private static long startTime = 0;

	private static long stopTime = 0;

	private static boolean running = false;

	private static String hoursminutesseconds = "";

	/*
	 * save the start time
	 */

	public static void startTimer() {
		running = true;
		startTime = System.currentTimeMillis();

	}

	/*
	 * Stop the timer and write the converted time into the log
	 */

	public static void stopTimer() {

		stopTime = System.currentTimeMillis();

		secondsPassed = (stopTime - startTime);

		hoursminutesseconds = millisecondsConverter(secondsPassed);

		Log.append("\nSimulation Time: " + String.valueOf(hoursminutesseconds));

	}

	/*
	 * convert a integer input into a String in the format hh:mm:ss and returns this
	 * as a string
	 */

	public static String millisecondsConverter(long millisecondsTime) {

		hoursminutesseconds = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisecondsTime),
				TimeUnit.MILLISECONDS.toMinutes(millisecondsTime)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisecondsTime)),
				TimeUnit.MILLISECONDS.toSeconds(millisecondsTime)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisecondsTime)));
		return hoursminutesseconds;
	}

	public static boolean getRunning() {
		return running;
	}

	public static long getStartTime() {
		return startTime;
	};
}
