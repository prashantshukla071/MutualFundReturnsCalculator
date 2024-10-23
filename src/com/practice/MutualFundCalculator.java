package com.practice;

public class MutualFundCalculator {

    public static void main(String[] args) {
        double initialInvestment = 7500000; // 75 lakhs
        double withdrawalPerMonth = 60000; // 60,000 INR per month
        double annualGrowthRate = 0.15; // 15% annual growth rate
        int years = 30;
        
        double remainingFund = initialInvestment;
        double totalWithdrawn = 0;
        int months = years * 12;

        // Monthly growth rate calculation
        double monthlyGrowthRate = Math.pow(1 + annualGrowthRate, 1.0 / 12) - 1;

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
    }
}

