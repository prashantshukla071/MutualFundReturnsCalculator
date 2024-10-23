package com.practice;

import java.util.Scanner;

public class HikeCalculator {
	/*
	 * Formula to check Hike
//	{New CTC} = {Current CTC} + ({Current CTC} * hike)
	*/
	public static void main(String[] args) {
		HikeCalculator hc= new HikeCalculator();
		
		 float cc= hc.newCTCbasedOnHikePercentage();
		  
		  if(cc>0) { System.out.println("Your new CTC will be: "+cc+"LPA"); 
		  } 
		  else {
		  System.err.println("Value entered is zero"); 
		  }
		 
		
		
//		float percentage=hc.hikePercentageBasedOnOfferedCTC();
//		System.out.println("Hike Percentage is: "+percentage+"%");
	}
	
	
	
	public float newCTCbasedOnHikePercentage() {		
		Scanner sc = new Scanner(System.in);
		float newctc = 0,cctc,hike;
		System.out.println("Enter the current CTC: ");
		cctc=sc.nextFloat();			
		System.out.println("Enter the Hike Percentage: ");
		hike =sc.nextFloat();
		sc.close();		

		
//			Condition to ensure Non Zero & Sub Zeroes are not entered
			if(cctc>0) {
				newctc= cctc+ (cctc*(hike/100));						
			} else if(cctc==0) {
				System.err.println("Zero entered");				
			}
			else {
				System.err.println("Invalid Number provided!! Please check the entry again. ");		
			}
	
		return newctc;		
	}
	
	
	public float hikePercentageBasedOnOfferedCTC() {
		Scanner sc = new Scanner(System.in);
		float cctc, offctc, difference, result = 0;
		System.out.println("Enter the current CTC: ");
		cctc=sc.nextFloat();			
		System.out.println("Enter the Offered CTC: ");
		offctc =sc.nextFloat();
		sc.close();
		
		if(cctc>0) {
			difference=offctc-cctc;
			result= (difference/cctc)*100;		
		} else if(cctc==0) {
			System.err.println("Zero entered");				
		}
		else {
			System.err.println("Invalid Number provided!! Please check the entry again. ");		
		}

	return result;		
	}

}
