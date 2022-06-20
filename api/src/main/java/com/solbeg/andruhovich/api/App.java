package com.solbeg.andruhovich.api;

import com.solbeg.andruhovich.core.Utils;

public class App {

	private static Utils utils = new Utils();

	public static void main(String[] args) {
		System.out.println(utils.isAllPositiveNumbers("12", "79"));
	}
}
