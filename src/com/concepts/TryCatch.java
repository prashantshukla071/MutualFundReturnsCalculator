package com.concepts;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		/*
	
		
		Try Catch Exception Handling
		@Author Prashant, date - 17-04-2024
		
		
		int [] marks = {54, 45, 34};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Index at which you want to perfrorm operations at array Marks: ");
		int ind = sc.nextInt();
		
		System.out.println("Enter the value: ");
		int number=sc.nextInt();		
		
		try {
			float result = (marks[ind]/number);
			System.out.println("The value at index i= "+ind+" is: "+marks[ind]);
			System.out.println("Final Value is:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occured..............");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured..............");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Some Exception Occured..............");
			System.out.println(e);
		}
	}
*/	
	/*	Topic 2: Nested Try Catch
	 * Nested Try Catch Conditions Check
	 * @Author Prashant, date: 17/04/2024
	 * 
	 * Ques: Keep using the same condition unless the right index value is entered untill then throw exception.
	 * 
	 * Nested Try catch is not necessarily used in this particular question without working with it program runs fine.
	 */
	
	int [] marks = {54, 45, 34};
	
	Scanner sc= new Scanner(System.in);
	
	
//	System.out.println("Enter the value: ");
//	int number=sc.nextInt();	
	
	boolean flag=true;
	
	while(flag) {
		System.out.println("Enter the Index: ");
		int ind = sc.nextInt();
		
		try {
			System.out.println("welcome to condition checker");
			try {
				
				System.out.println("Array at i = "+ind+" is : "+marks[ind]);
				flag =false;
			
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Sorry! this index does not exist..");
				System.out.println("Exception at level 2");
			}
		}catch(Exception e) {
			System.out.println("Exception at level 1");
		}
	}
	System.err.println("Thankyou for using!");
	
}
}
