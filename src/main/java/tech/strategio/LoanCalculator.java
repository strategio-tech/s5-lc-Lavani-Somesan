package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * 
     * This method takes in the total amount of the loan and 
     * calculates how much is needed to pay back in 3 months time
     * if you only pay 10% per month of the loan.
     * 
     * @param amount : total loan amount
     * @return remainingAmount : remaining amount to pay back in 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        int tenPercent = 0;
        int remainingAmount = amount;
        
        for(int i = 0; i < 3; i++) {
        	 tenPercent = (int)(remainingAmount * 0.1);
             remainingAmount = remainingAmount - tenPercent;
             System.out.println(remainingAmount);
        }
        
    	return remainingAmount;
    }

    public static void main(String[] args) {
    	//System.out.print("Please Enter an amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
