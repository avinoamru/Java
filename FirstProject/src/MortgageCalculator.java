/* 	This program calculates mortgage monthly payment.
 * 	You need to input your name, amount you want to borrow, for how long you want to pay and annual rate.
 */

import java.util.Scanner;

public class MortgageCalculator {
	
	// Declaring variables //
	
	static String name;
	static double principal;
	static double annualInterestRate;
	static double monthlyInterestRate;
	static int numberOfYears;
	static int numberOfPayments;
	static int monthlyPaymentInteger;
	static int totalToPay;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
        // Input //
		
		Scanner inputInformation= new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name = inputInformation.next();
		System.out.println("Hello " + name + ", please enter the amount you need to borrow: ");
		principal = inputInformation.nextInt();
		System.out.println("Alright " + name + ", now enter for how many years you want to pay: ");
		numberOfYears = inputInformation.nextInt();
		System.out.println("Alright " + name + ", now enter the annual interest rate: ");
		annualInterestRate = inputInformation.nextDouble();
		
		// Calculation //
		
		monthlyInterestRate = annualInterestRate / 1200;
		                                                                     // The mortgage equation //
		double monthlyPayment =  principal  * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		//  Converting the answer from double to int 
		monthlyPaymentInteger = (int) monthlyPayment;
		totalToPay = monthlyPaymentInteger * numberOfYears * 12;
		
		
        // Output //
		
		System.out.println("All done " + name + ", the monthly amount to pay is: $" + monthlyPaymentInteger + " and the total amount is: " + totalToPay);
		
	}
	
}
