package com.solbeg.andruhovich.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringUtils {

	StringUtils stringUtils;

	@BeforeEach
	void init() {
		stringUtils = new StringUtils();
	}

	@ParameterizedTest
	@CsvSource({"123,true", "-123,false", "Java,false"})
	void isPositiveNumber(String input, Boolean expected) {
		assertEquals(expected, stringUtils.isPositiveNumber(input));
	}
}
