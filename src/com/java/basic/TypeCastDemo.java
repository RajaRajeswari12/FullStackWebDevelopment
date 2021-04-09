package com.java.basic;

import java.util.Scanner;

public class TypeCastDemo {

	double demo(String value) {
		double result;
		result = (double)Double.valueOf(value);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TypeCastDemo tc = new TypeCastDemo();
		boolean gotNumbers = false;

		while(!gotNumbers) {
			Scanner getInput = new Scanner(System.in);
			System.out.println("Enter the value needs to be displayed as Double : ");
			String inputValue = getInput.next();
			try {
				double output = tc.demo(inputValue);
				System.out.println("The Equivalent Double value is "+ output);
				gotNumbers=true;
			}

			catch(NumberFormatException ne) {
				System.out.println("Enter Numbers only");
				gotNumbers = false;
			}
		}

	}

}
