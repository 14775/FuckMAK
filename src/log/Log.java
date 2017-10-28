package log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import settings.LogType;

public final class Log {
	private static LogType loggingType;
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");

	public static void initLog(LogType logType) {
		loggingType = logType;
		if (loggingType == loggingType.NOLOG) {
		} else {

			if (loggingType == loggingType.CONSOLE) {
			}
			;
			if (loggingType == loggingType.SAVETOFILE) {
				// TODO log has to be saved into the project folder
			}
			;
		}
		StringBuilder result = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("www.tutego.com");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); // 2016/11/16 12:08:43

	}

};