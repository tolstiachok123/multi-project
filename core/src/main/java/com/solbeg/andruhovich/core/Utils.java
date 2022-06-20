package com.solbeg.andruhovich.core;

import com.solbeg.andruhovich.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Utils {

	private static final StringUtils stringUtils = new StringUtils();

	public boolean isAllPositiveNumbers(String... str) {
		Set<String> strings = new HashSet<>(Arrays.asList(str));
		AtomicBoolean result = new AtomicBoolean(true);
		strings.forEach((string) -> {
			if (!stringUtils.isPositiveNumber(string)) result.set(false);
		});
		return result.get();
	}
}
