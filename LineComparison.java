package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");

		compareLength();
	}

	/**
	 * Calculating length of lines
	 */
	public static double coordinates() {
		System.out.println("Welcome to Line Comparison Computation program");
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
	 * Comparing the length of lines
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

	/**
	 * Checking the greater line
	 */
	public static void compareLength() {
		double line1 = coordinates();
		String s1 = Double.toString(line1);
		double line2 = coordinates();
		String s2 = Double.toString(line2);
		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " is less than the" + s2);
			System.out.println("s2 string is greater");
		} else {
			System.out.println(s1 + " is greater than the " + s2);
			System.out.println("s1 string is greater");
		}
	}

}
