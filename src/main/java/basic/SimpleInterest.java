package basic;

import java.util.Scanner;

public class SimpleInterest {
	
	//Variables
	static int A;
	static int P;
	static int R;
	static int T;
	
	public static void main(String[] args) {
		CalInterest();
	}

	public static void CalInterest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Princial Amount: ");
		P=sc.nextInt();
		
		System.out.print("Enter Princial Interest Rate: ");
		R=sc.nextInt();
				
		System.out.print("Enter Princial Time Frime: ");
		T=sc.nextInt();
		
		sc.close();
		
		A = (P*R*T)/100;
		System.out.println(A);
		
	}
}
