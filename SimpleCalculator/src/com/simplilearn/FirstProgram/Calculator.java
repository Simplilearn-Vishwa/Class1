package com.simplilearn.FirstProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean condition = true;
		
		while(condition) {
			
			System.out.println("Enter the first number : ");
			int firstNum = sc.nextInt();
			System.out.println("Enter the second number : ");
			int secondNum = sc.nextInt();
			
			int result;
			
			System.out.println("Press 1 for Addition."
					+ "Press 2 for Subtraction."
					+ "Press 3 for Multiplication."
					+ "Press 4 for Division"
					);
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: result = firstNum + secondNum;
				System.out.println("The result is : " + result);
				break;
		case 2: result = firstNum - secondNum;
				System.out.println("The result is : " + result);
				break;
		
		case 3: result = firstNum * secondNum;
				System.out.println("The result is : " + result);
				break;
		
		case 4: result = firstNum / secondNum;
				System.out.println("The result is : " + result);
				break;
						
		
		default : System.out.println("Incorrect Choice");
		          break;
		}
		System.out.println("Do you wish to continue.Press 1 for yes and 2 for no.");
		
		int ch = sc.nextInt();
		
		if(ch == 1) {
			
			condition = true;
		}else if (ch == 2) {
			
			condition = false;
			
		}else {
			System.out.println("Please enter correct choice.");
		}
		}

	}
	
}
