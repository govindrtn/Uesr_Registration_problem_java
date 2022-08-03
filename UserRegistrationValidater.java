package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistrationValidater {

	private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String Email_Pattern = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";

	public static boolean firstNameValidater(String firstName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(firstName).matches();
	}

	public static boolean lastNameValidater(String lastName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(lastName).matches();
	}

	public static boolean emailValidater(String email) {
		Pattern pattern = Pattern.compile(Email_Pattern);
		return pattern.matcher(email).matches();
	}

	public static void main(String[] args) {
		System.out.println(firstNameValidater("Govind"));
		System.out.println(lastNameValidater("Maithil"));
		System.out.println(emailValidater("govindmaithil@gmail.com"));
		System.out.println(emailValidater("govindmaithil@bridgelabz.co.in"));
	
	}
}
