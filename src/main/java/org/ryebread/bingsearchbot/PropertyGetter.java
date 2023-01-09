package org.ryebread.bingsearchbot;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class PropertyGetter {

	private static Properties props;

	public static final String WEBDRIVER_LOCATION = "webdriver_location";
	public static final String TOTAL_POINTS = "total_points";
	public static final String POINTS_PER_SEARCH = "points_per_search";

	static {
		props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			System.err.println("Error getting properties:" + e);
			System.exit(0);
		}
	}

	public static String get(String key) {
		String prop = props.getProperty(key);
		return prop != null ? prop : "";
	}

	public static List<String> getRequiredProps() {
		List<String> required = new LinkedList<>();
		required.add(WEBDRIVER_LOCATION);
		required.add(TOTAL_POINTS);
		required.add(POINTS_PER_SEARCH);
		return required;
	}

}
