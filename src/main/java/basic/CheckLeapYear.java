package basic;

import java.util.Scanner;

public class CheckLeapYear {
	
	//Variables
	static int year;
	
	public static void main(String[] args) {
		checkleapyear();
	}
	
	public static void checkleapyear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		year = sc.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println(year + " is a Leap year");
				} else {
					System.out.println(year + " is not a Leap year");
				}
			} else {
				System.out.println(year + " is a Leap year");
			}
		} else {
			System.out.println(year + " is not a Leap year");
		}
		
	}
}
