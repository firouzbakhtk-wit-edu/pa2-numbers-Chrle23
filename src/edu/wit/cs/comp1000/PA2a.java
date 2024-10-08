package edu.wit.cs.comp1000;
import java.util.Scanner;

public class PA2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// USer Enters five whole numbers and variables
		int sumPositive = 0;
		int sumNonPositive = 0;
		
		int countPositive = 0;
		int countNonPositive = 0;
		int count = 5;
		int sumAll = 0;
		
		int a, b, c, d, e;
		
		// User enters five whole numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five whole numbers: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		// loop to read numbers and calculate sums
		if (a > 0) { // check if it is a postive integer
			countPositive++;
			sumPositive = sumPositive + a;
		} else {
			countNonPositive++;
			sumNonPositive = sumNonPositive + a;
		}
		if (b > 0) { // check if it is a postive integer
			countPositive++;
			sumPositive = sumPositive + b;
		} else {
			countNonPositive++;
			sumNonPositive = sumNonPositive + b;
		}
		if (c > 0) { // check if it is a postive integer
			countPositive++;
			sumPositive = sumPositive + c;
		} else {
			countNonPositive++;
			sumNonPositive = sumNonPositive + c;
		}
		if (d > 0) { // check if it is a postive integer
			countPositive++;
			sumPositive = sumPositive + d;
		} else {
			countNonPositive++;
			sumNonPositive = sumNonPositive + d;
		}
		if (e > 0) { // check if it is a postive integer
			countPositive++;
			sumPositive = sumPositive + e;
		} else {
			countNonPositive++;
			sumNonPositive = sumNonPositive + e;
		}
		sumAll = a + b + c + d + e;
		
		String posNum = new String();
		String nonPos =  new String();
		
		if (countPositive == 1) {
			posNum = " positive number: ";
		} else {
			posNum = " positive numbers: ";
		}
		
		if (countNonPositive == 1) {
			nonPos = " non-positive number: ";
		} else {
			nonPos = " non-positive numbers: ";
		}
		
		// output results
		System.out.printf("The sum of the %d%s%d%n", countPositive, posNum ,sumPositive );
		System.out.printf("The sum of the %d%s%d%n", countNonPositive, nonPos,sumNonPositive );
		System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
		
		// calculating averages
		double avgPositive = (double)sumPositive / (double)countPositive;
		double avgNonPositive = (double)sumNonPositive / (double)countNonPositive;
		double avg = (double) sumAll / (double)(count);
		
		if (countPositive == 0) {
			avgPositive = 0.00;
		}
		if (countNonPositive == 0) {
			avgNonPositive = 0.00;
		}
		
		if (count == 0) {
			avg = 0.00;
		}
		
		// output results
		System.out.printf("The average of the %d%s%.2f%n", countPositive, posNum ,avgPositive );
		System.out.printf("The average of the %d%s%.2f%n", countNonPositive, nonPos ,avgNonPositive );
		System.out.printf("The average of the 5 numbers: %.2f%n", avg);
	} 
}
