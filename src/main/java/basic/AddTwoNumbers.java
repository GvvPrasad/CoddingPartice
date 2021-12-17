package basic;

import java.util.Scanner;

public class AddTwoNumbers {
	
	//Variables
	static int a;
	static int b;
	static int c;
	
	
	public static void main(String[] args) {
		add();
	}
	
	public static void add() {
		
		//To get Data from User from the system
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		
		System.out.println("Enter second Number: ");
		b = sc.nextInt();
		
		sc.close();
		
		c = a+b;
		System.out.println("Sum of the two numbers: " +c);
	}
}
