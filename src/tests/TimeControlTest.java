package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TimeControlTest {

	/*
	 * tests the time converter (milliseconds into the format hh:mm:ss)
	 */
	@Test
	public void millisecondsConverterTest() {
		final long millisecondsExample = 11567834;
		String result = "";

		result = timer.TimeControl.millisecondsConverter(millisecondsExample);

		assertEquals(result, "03:12:47");
		assertNotEquals(result, 11567834);

	}

}
