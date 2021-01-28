package com.mypack.datacode;

import java.util.Scanner;

public class Qa {
	
	Scanner scanner = new Scanner(System.in);
	
	public void mycucumbertest() throws Exception {
		System.out.println("Enter your present opensource community: ");
		String organisation = scanner.next();
		char[] myorg = organisation.toCharArray();
		for (char cc : myorg) {
			System.out.print(" |" + cc + "| ");
		}
		
		Boolean elligibility = scanner.hasNext();
		if (elligibility.equals(true)) {
			System.out.println("He is a software engineer");
		}
		else {
			throw new Exception("Error ocuured in the transit");
		}
	}
	
}
