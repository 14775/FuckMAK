package log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;
import timer.TimeControl;

public final class Log {
	private static LogType loggingType;
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
	private static StringBuilder result = new StringBuilder();

	public static void initLog(LogType logType, int rules, Datastructure gridType, int dimension,
			Neighborhood cellType) {
		loggingType = logType;
		if (loggingType == loggingType.NOLOG) {
		} else {
			// TODO MISSING TimeControl needs proper output... no milisecs or secs but
			// proper hh/mm/ss/mmmm
			result.append("Startime: " + String.valueOf(TimeControl.getStartTime()) + "\n" + "Ruleset: "
					+ String.valueOf(rules) + "\n" + "Grid Type: " + String.valueOf(gridType) + "\n" + "Grid Size: "
					+ String.valueOf(dimension) + "\n" + "Cell Type: " + String.valueOf(cellType) + "\n");

		}

	}

	public static void append(String addString) {
		result.append(addString);
		// TODO automatically extend capacity of the StringBuilder once it hits the
		// limit

	};

	public static void endLog() throws IOException {
		if (loggingType == loggingType.NOLOG) {
		} else {

			if (loggingType == loggingType.CONSOLE) {
				System.out.println(result.toString());
			}
			if (loggingType == loggingType.SAVETOFILE) {
				Date filedate = new Date();
				File dir = new File("logs/");
				if (!dir.isDirectory()) {
					dir.mkdir();
				}
				File file = new File("logs/" + String.valueOf(dateFormat.format(filedate) + ".txt"));
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.append(result.toString());
				fileWriter.close();
			}
		}
	}
}