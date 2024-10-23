package com.practice;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MFWordsCalculator {

    public static void main(String[] args) {
        double initialInvestment,withdrawalPerMonth,annualGrowthRate; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial Investment: ");
        initialInvestment = sc.nextDouble();
        
        System.out.println("Enter the Withdrawal per month: ");
        withdrawalPerMonth = sc.nextDouble();
        
        System.out.println("Enter the annual Growth Rate: ");
         double x= sc.nextDouble();         
         annualGrowthRate = x/100;
         
         System.out.println("Enter the Years: ");
         int years= sc.nextInt();
         int months = years * 12;
         

         double remainingFund = initialInvestment;
         double totalWithdrawn = 0;
         
/* Monhtly Growth rate formula is needed to correctly implement the compound interest taking place
 * 
 *        Hence, the formula of monthlyRate = {1 + annualGrowthRate^(1/12)} -1
        	
*/
        // Monthly growth rate calculation
        double monthlyGrowthRate = Math.pow(1 + annualGrowthRate, 1.0 / 12) - 1;

        /*
         * Looping takes place once a month for the duration of years the activity happens
         * Hence, updating the remainingFund and totalWithdrawn
         */
        
        // Simulation loop
        for (int month = 0; month < months; month++) {
            // Apply growth for the current month
            remainingFund *= (1 + monthlyGrowthRate);

            // Withdraw amount if there is enough in the fund
            if (remainingFund >= withdrawalPerMonth) {
                remainingFund -= withdrawalPerMonth;
                totalWithdrawn += withdrawalPerMonth;
            } else {
                // If remaining fund is less than withdrawal, withdraw what's left and stop
                totalWithdrawn += remainingFund;
                remainingFund = 0;
                break;
            }
        }

        // Output the results
        System.out.printf("Remaining fund after 30 years: %.2f%n", remainingFund);
        System.out.printf("Total amount withdrawn in 30 years: %.2f%n", totalWithdrawn);
        
        // Convert amounts to words
        System.out.println("Remaining fund in words: " + convertToWords(remainingFund));
        System.out.println("Total withdrawn in words: " + convertToWords(totalWithdrawn));
    }


    // Function to convert a number into words (crores, lakhs, thousands)
    public static String convertToWords(double amount) {
        DecimalFormat df = new DecimalFormat("#");

        long crores = (long) (amount / 10000000);
        long lakhs = (long) ((amount % 10000000) / 100000);
        long thousands = (long) ((amount % 100000) / 1000);
        long hundreds = (long) ((amount % 1000) / 100);
        long remaining = (long) (amount % 100);

        StringBuilder result = new StringBuilder();

        if (crores > 0) {
            result.append(crores).append(" crore ");
        }
        if (lakhs > 0) {
            result.append(lakhs).append(" lakh ");
        }
        if (thousands > 0) {
            result.append(thousands).append(" thousand ");
        }
        if (hundreds > 0) {
            result.append(hundreds).append(" hundred ");
        }
        if (remaining > 0) {
            result.append(remaining).append(" ");
        }

        result.append("INR");
        return result.toString().trim();
    }
}
