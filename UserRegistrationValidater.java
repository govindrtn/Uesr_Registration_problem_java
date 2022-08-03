package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistrationValidater {

	private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

	public static boolean firstNameValidater(String firstName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(firstName).matches();
	}
	
	public static boolean lastNameValidater(String lastName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(lastName).matches();
	}

	public static void main(String[] args) {
				System.out.println(firstNameValidater("Govind"));
				System.out.println(lastNameValidater("Maithil"));
	}
}
