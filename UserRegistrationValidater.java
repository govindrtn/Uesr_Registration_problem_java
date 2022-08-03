package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistrationValidater {

	private static final String First_Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

	public static boolean firstNameValidater(String firstName) {
		Pattern pattern = Pattern.compile(First_Name_Pattern);
		return pattern.matcher(firstName).matches();
	}

	public static void main(String[] args) {
				System.out.println(firstNameValidater("Govind"));
	}
}
