package com.practice;

import java.util.Scanner;

public class Stock_ReturnCalculator {

//	Total Return=initialInvestment×(1+ 4048/100)
	
	/*
	Total Return = 100,000×(1+40.48)
	Total Return=100,000 ×	41.48
	Total Return=100,000×41.48
	Total Return=4,148,000 rupees
	Total Return=4,148,000 rupees
	*/
	public static void main(String[] args) {
		
		returnOnPercentage();
		
	}
			
		public static void returnOnPercentage() {
			Scanner sc = new Scanner (System.in);
			float iniAmount, percent,Return = 0;
			
			System.out.println("Initial Amount: ");
			iniAmount =sc.nextFloat();
			
			System.out.println("Return in percentage: ");
			percent = sc.nextFloat();
			sc.close();
			
			
			
			if(iniAmount>0 && percent>0) {
				Return = iniAmount*(1+ (percent/100));
				System.out.println("Total return: "+Return+ " Rs");
				
			}else {
				System.err.println("Invalid input given!!");
			}
			
			
		}
}
