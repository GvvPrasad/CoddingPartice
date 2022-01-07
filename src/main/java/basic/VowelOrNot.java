package basic;

import java.util.Scanner;

public class VowelOrNot {

	//Variables
	static String letter;

	public static void main(String[] args) {
		checkVowel();
	}

	public static void checkVowel() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Charater: ");
		letter = sc.next();
		sc.close();
		
		String	givenLetter = letter.toLowerCase();


		switch (givenLetter) {
		case "a":
			System.out.println(givenLetter +": is a vowel");
			break;
		case "e":
			System.out.println(givenLetter +": is a vowel");
			break;
		case "i":
			System.out.println(givenLetter +": is a vowel");
			break;
		case "o":
			System.out.println(givenLetter +": is a vowel");
			break;
		case "u":
			System.out.println(givenLetter +": is a vowel");
			break;
		default:
			System.out.println("Given Charater is not a vowel");
		}


	}
}
