package com.symphony.api.id;

import java.io.InputStream;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StreamHelp {

	public static String asString(InputStream is) {
		try (Scanner scanner = new Scanner(is, "UTF-8")) {
			return scanner.useDelimiter("\\A").next();
		}
	}

	public static <T> T getProperties(String name, Class<T> c) {
		try {
			ObjectMapper om = new ObjectMapper();
			String property = System.getProperties().getProperty(name);
			return om.readValue(property, c);
		} catch (Exception e) {
			throw new IdentityConfigurationException("Couldn't load test identity " + name, e);
		}

	}
}
