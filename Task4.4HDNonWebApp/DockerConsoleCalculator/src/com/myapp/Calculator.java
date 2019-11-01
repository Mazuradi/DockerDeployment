package com.myapp;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(" Welcome to the Java Calculator ");
		System.out.println("--------------------------------");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		
		//Loop for the calculator
		while(exit) {
			float lanswer = 0;
			System.out.print("Please choose an operation to use (+, -, *, /): ");
			String loperation = input.next();
			System.out.print("Please enter your first number: ");
			int lnumone = input.nextInt();
			System.out.print("Please enter your second number: ");
			int lnumtwo = input.nextInt();
			
			//Switch case
			switch (loperation) {
			case "+":
				lanswer = lnumone + lnumtwo;
				break;
				
			case "-":
				lanswer = lnumone - lnumtwo;
				break;
				
			case "*":
				lanswer = lnumone * lnumtwo;
				break;
				
			case "/":
				lanswer = (float)(lnumone / lnumtwo);
			}
			
			System.out.println("Answer for " + lnumone +" "+ loperation +" "+ lnumtwo + " is: " + lanswer);
			System.out.println("---------------------------------------------------------------");
			
			//Exiting Loop
			System.out.print("Do you wish to exit (Y/N): ");
			String lexitcode = input.next();
			if(lexitcode.equals("Y") || lexitcode.equals("y")) {
				exit = false;
				input.close();
			}
			else {
				System.out.println();
			}
		}

	}

}
