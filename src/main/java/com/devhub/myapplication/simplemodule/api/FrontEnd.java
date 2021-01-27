/**
 * 
 */
package com.devhub.myapplication.simplemodule.api;


/**
 * @author kdaud
 */
public class FrontEnd {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Microfrontend obj = new Microfrontend();
		if (obj instanceof Endsquard) {
			System.out.println(new Microfrontend().myString());
		}
		else {
			System.out.println("Not an instance of Endsquard interface");
		}
		Squard squard = new Squard();
		squard.codebase();
		if (squard instanceof Endsquard) {
			System.out.println("Welcome To OpenMRS Community 2021");
		} else {
			System.out.println("Am out of bound to access the interface functionality");
		}
		System.out.println("***************");
		Budge budge = new Budge();
		budge.codebase();
		
	}
	
}
