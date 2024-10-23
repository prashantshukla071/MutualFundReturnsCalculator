package com.practice;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double input;
	System.out.print("enter the Value: ");
	input = sc.nextDouble();
	
	//Consuming the new line character left by nextDobule()
	
	sc.nextLine();
	System.out.println();
	

	System.out.println("enter the Currency. eg- dollar. pound, euro.. ");
	String sr= sc.nextLine();
	
	
	if(sr.equalsIgnoreCase("dollar") || sr.equalsIgnoreCase("dollars")) {
		double output= dollarToINR_Converter(input);
		System.out.println("INR: "+output);
		
	
	} else if(sr.equalsIgnoreCase("pound")|| sr.equalsIgnoreCase("pounds")) {
		double output= poundToINR_Converter(input);
		System.out.println("INR: "+output);
		
		
	} else if(sr.equalsIgnoreCase("euro")|| sr.equalsIgnoreCase("euros")) {
		double output= euroToINR_Converter(input);
		System.out.println("INR: "+output);
		
	} else {
		System.out.println("Invalid currency entered!");
	}
	
	sc.close();
	}


	private static double dollarToINR_Converter(double input) {
		double dollar = input*83.59;
		return dollar;
	}
	private static double poundToINR_Converter(double input) {
		double pound = input*105.70;
		return pound;
	}
	private static double euroToINR_Converter(double input) {
		double euro = input*89.24;
		return euro;
}
}
