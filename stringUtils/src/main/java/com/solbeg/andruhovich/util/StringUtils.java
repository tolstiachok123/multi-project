package com.solbeg.andruhovich.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

	public boolean isPositiveNumber(String str) {
		return (NumberUtils.isCreatable(str) & !org.apache.commons.lang3.StringUtils.contains(str, '-'));
	}

}
