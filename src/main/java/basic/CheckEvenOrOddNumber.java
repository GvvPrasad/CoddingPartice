package basic;

import java.util.Scanner;

public class CheckEvenOrOddNumber {
	
	//Variables
	static int a;
	
	public static void main(String[] args) {
		EvenOrOddNumber();
	}
	
	public static void EvenOrOddNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		a = sc.nextInt();
		sc.close();
		
		if (a%2==0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");
		}
	}
}
