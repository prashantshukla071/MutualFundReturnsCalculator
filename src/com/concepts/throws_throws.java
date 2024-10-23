package com.concepts;

/*
 * throws keyword is used to declare that the following method may throw an exception
 * Th
 */

/* Custom Exception: user defined for negative radius value
 * By Extending Exception class we are using the following methods by overriding them
 * 
 */
class NegativeRadiusException extends Exception {
//	@Override
//	public String toString() {
//		return "Radius cannot be Negative!";
//	}

	@Override
	public String getMessage() {
		return "Radius cannot be Negative";
	}
}

public class throws_throws {

	public static void main(String[] args) {
	
//		  try{ 
//			  int c = Divide(5,0); 
//			  System.out.println(c); 
//			  }catch(Exception e) { 
//		  e.printStackTrace(); 
//		  System.err.println("Arithmetic Exception");
//		  }
//		  
//		  System.out.println("Thanks for using"); 
//		  }
		 
		
		try {
			double area =circleArea(-10);
			System.out.println("Area of Circle: "+area); 
			} catch( Exception e) {
				System.err.println("Exception");
				System.out.println(e.getMessage());
			}
		
		
	
		/*
		 * Finally: Finally block occurs even when the exception comes or not, we can use Try without catch
		 * also with using finally block which mandates the condition written inside finally block to execute.
		 */
		
//		int a = 7;
//		int b = 9;
//
//		while(true) {
//			try {
//				System.out.println(a/b); 
//			}
//			catch(ArithmeticException e) {
//				System.out.println(e);
//				break;
//			}
//			finally {
//				System.out.println("I am finally for B: "+b);
//			}
//			b--;
//		}


//Try and Finally block without catch
//		try {
//			System.out.println(50/10);
//		}
//		finally {
//			System.err.println("Yes this is finally");
//		}

}

	/* Method to calculate area of circle 
	 * 
	 */

	static double circleArea(float r) throws NegativeRadiusException{		
		if(r<0) {
			throw new NegativeRadiusException();
		}
		else return Math.PI * r * r;
	}
	
	/* Method to divide two numbers 
	 * 
	 */
//	public static int Divide(int a, int b) throws ArithmeticException {
//		int result = a / b;
//		return result;
//	}
}
