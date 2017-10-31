package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

import timer.TimeControl;

import org.junit.Test;

public class TimeControlTest {

	/*
	 * tests the time converter (milliseconds into the format hh:mm:ss)
	 */
	@Test
	public void millisecondsConverterTest() {
		TimeControl timer = mock(TimeControl.class);
		final long millisecondsExample = 11567834;
		String result = "";

		result = timer.millisecondsConverter(millisecondsExample);

		assertEquals(result, "03:12:47");
		assertNotEquals(result, 11567834);

	}
}
