package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.printf("Enter a b c: ");
			Scanner scanner = new Scanner(System.in);
			
			// Prompt the user to enter coefficients a, b and c
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			
			
			double discrinminant = (b * b) - (4 * a * c);
			// this is the forumla of calculating discriminant
			
			//chekc if discrinminant is less than 0
			if (discrinminant < 0) {
				System.out.println("Roots: imaginary");
			} else if (discrinminant == 0) {
				// this would check if its equal to 0 and to print out the single root accordingly
				double root =-b / (2 *a);
				System.out.printf("Root: %.2f%n", root);
			} else {
				// this would check if is positive if we made it this far and finding out the 2 roots
				double sqrtDiscrinminant = Math.sqrt(discrinminant);
				double root1 = (-b - sqrtDiscrinminant) / (2 * a);
				double root2 = (-b + sqrtDiscrinminant) / (2 * a);
				
				// reording the roots so that root 1 is less than or equal to root 2
				if (root1 > root2) {
					double temp = root1;
					root1 = root2;
					root2 = temp;
				}
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
				scanner.close();
				
			}
			

		}

	}

