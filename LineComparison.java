package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");

		double result = coordinates();
		System.out.println(result);
		length();
	}

	/**
	 * Calculating the length of line by taking input from user
	 */
	public static double coordinates() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate for x-axis:");
		int x1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis:");
		int x2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis:");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis:");
		int y2 = sc.nextInt();
		double lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine;

	}

	/**
	 * Checking from the co-ordinates that lines are same or not
	 */
	public static void length() {
		double line1 = coordinates();
		String s1 = Double.toString(line1);
		double line2 = coordinates();
		String s2 = Double.toString(line2);
		if (s1.equals(s2))
			System.out.println("Both lines are of same length");
		else
			System.out.println("Both the lines are of different length");

	}

}
