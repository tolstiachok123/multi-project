package com.solbeg.andruhovich.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestUtils {

	Utils utils;

	@BeforeEach
	void init() {
		utils = new Utils();
	}

	@Test
	void isPositiveNumber() {
		assertTrue(utils.isAllPositiveNumbers("123", "321"));
		assertFalse(utils.isAllPositiveNumbers("-123", "321"));
	}

}
